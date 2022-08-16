package Part_1;

import java.io.File;

public class Main{
    public static void main(String[] args) {
        File file = new File("caminho/arquivo.exemplo");
        long bytes = file.listFiles().length;
        System.out.println("O arquivo possui " + bytes + " bytes.");
    }
}