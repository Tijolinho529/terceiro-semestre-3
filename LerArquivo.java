import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            // FileReader para ler o arquivo.
            FileReader leitor = new FileReader("arquivo.txt");
            // BufferedReader para melhorar a leitura
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha;

            // while lê linha por linha até encontrar null (fim do arquivo).
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            
        }
    }
}