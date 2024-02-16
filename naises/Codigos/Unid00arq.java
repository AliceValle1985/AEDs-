package Codigos;
import java.io.*;
public class Unid00arq
{
    // Grava um valor boolean no arquivo
    public static boolean openWrite ( String nomeArq )
    {
        boolean valor = false;
        try
        {   
            // "BufferedWriter arquivoW" abre o arquivo para escrita e "new FileWriter ( nomeArq )" cria um novo caso não tenha sido criado antes
            
            BufferedWriter arquivoW = new BufferedWriter(new FileWriter ( nomeArq ));
            // Escreve no arquivo, e "valouOf" pega o valor do boolean
            arquivoW.write( String.valueOf ( valor ) );
            // Fecha o arquivo
            arquivoW.close (  );
            // Retorna o valor true já que o codigo foi executado corretamente
            return true;
        }
        // Lança a exeção
        catch ( IOException e )
        {
            System.out.println ( "Erro ao abrir o arquivo." + e.getMessage ( ) );
            // Retorna o valor false já que o codigo foi executado erroneamente
            return false;
        }
    }
    // Grava um caractere no arquivo
    public static boolean openWrite ( String nomeArq, String charset )
    {
        try
        {
            BufferedWriter arquivoW = new BufferedWriter ( new FileWriter ( nomeArq ));
            arquivoW.write( charset );
            // Fecha o arquivo
            arquivoW.close (  );
            // Retorna o valor true já que o codigo foi executado corretamente
            return true;
        }
        catch ( IOException e )
        {
            System.out.println ( "Erro ao abrir o arquivo." + e.getMessage ( ) );
            // Retorna o valor false já que o codigo foi executado erroneamente
            return false;
        }
    }
    public static boolean openRead ( String nomeArq )
    {
        try
        {
            BufferedReader arquivoR = new BufferedReader ( new FileReader ( nomeArq ));
            String linha;
            while ( ( linha = arquivoR.readLine ( ) ) != null )
            {
                System.out.println ( linha );
            }
            arquivoR.close ( );
            return true;
        }
        catch ( IOException e )
        {
            System.out.println ( "Erro ao ler o arquivo: " + e.getMessage ( ) );
            return false;
        }
    }
    public static void main ( String[] args )
    {
        openWrite ( "Xereca.txt" );
        openWrite ( "buceta.txt", "a" );
        openRead  ( "BUCETARALHASSO.txt" );
    }
}