import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.LinkOption;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
import java.nio.file.Paths;

public class CountingTask extends RecursiveTask<Long> {
    private Path dir;
 
    public CountingTask(Path dir) {
        this.dir = dir;
    }
 
    @Override
    protected Long compute() {
        long size = 0;
        List<CountingTask> subTasks = new ArrayList<CountingTask>();

        try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir)) {
            for (Path subPath : ds) {
                if (Files.isDirectory(subPath, LinkOption.NOFOLLOW_LINKS)) {
                    subTasks.add(new CountingTask(subPath));
                } else {
                    long s = Files.size(subPath);
                    size += s;
                }
            }
 
            if (!subTasks.isEmpty()) {
                for (CountingTask subTask : invokeAll(subTasks)) {
                    long s = subTask.join();
                    size += s;
                }
            }

        } catch (Exception ex) {
            return 0L;
        }
        return size;
    }

    public static void main(String[] args) {
        int parallelism = Runtime.getRuntime().availableProcessors() << 1;
        String uri = "path from files";
        Long size = new ForkJoinPool(parallelism).invoke(new CountingTask(Paths.get(uri)));
        System.out.println("O tamanho dos arquivos foi => "+ size);
    }
}