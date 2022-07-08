import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Deterministico deterministico = new Deterministico();
        
        File arquivo = new File("Diretório\\file.txt");
        File resultado = new File("Diretório\\resultados.txt");

        if(!resultado.exists())
            resultado.createNewFile();

        FileReader fr = new FileReader(arquivo);
        BufferedReader leitura = new BufferedReader(fr);
        FileWriter fw = new FileWriter(resultado);
        BufferedWriter escrita = new BufferedWriter(fw);

        escrita.write("============================================\n");
        escrita.write("Determístico:\n");
        while (leitura.ready()){
            String linha = leitura.readLine();
            if(deterministico.reconhece(linha))
                escrita.write(linha+" aceita!\n");
            else
                escrita.write(linha+" rejeitada!\n");
        }
        escrita.write("============================================");
        leitura.close();
        fr.close();
        escrita.close();
        fw.close();
    }
}
