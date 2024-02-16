package Codigos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Unid00Copia 
{
    public static void Copy ( String ArqLido, String ArqCopia )
    {
        try
        {
            // ArqLido  = NOME DO ARQUIVO
            // ArqCopia = NOME DO ARQUIVO
            // Cria um arquivo para a leitura 
            BufferedReader arquivoR = new BufferedReader ( new FileReader ( ArqLido ));
            // Cria um arquivo para escrita
            BufferedWriter arquivocopia = new BufferedWriter ( new FileWriter ( ArqCopia ) );
            String linha;
            // Enquanto tiver linhas a serem lidas, vai executar oq esta dentro do while
            while ( ( linha = arquivoR.readLine ( ) ) != null )
            {
                // Escreve no arquivo copia
                arquivocopia.write ( linha );
                // Coloca as linhas do arquivo
                arquivocopia.newLine();
            }
            arquivoR.close     ( );
            arquivocopia.close ( );
        }
        catch ( IOException e )
        {
            System.out.println ( "Erro ao ler o arquivo: " + e.getMessage ( ) );
        }
    }
    public static void main ( String[] args )
    {
        Copy ( "Arquivo.txt", "Copia.txt" );
    }
}
