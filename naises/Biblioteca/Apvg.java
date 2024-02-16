package Biblioteca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import java.io.PrintWriter;
public class Apvg 
{
    static Scanner scanner = new Scanner ( System.in );
    // Public methods must be called by creating objects
    // Static methods can be called without creating objects
    public static int receiveI ( int n )
    {
        n = scanner.nextInt (  );
        return ( n );
    }
    public static String receiveS ( String n )
    {
        n = scanner.next (  );
        return ( n );
    }
    public static char receiveC ( char n )
    {
        n = scanner.next ( ) .charAt ( 0 );
        return ( n );
    }
    public static double receiveD ( double n )
    {
        n = scanner.nextDouble (  );
        return ( n );
    }
    // Exibe uma string na tela
    public static void print ( String n )
    {
        System.out.println ( n );
    }
    // Exibe um int na tela
    public static void print ( int n )
    {
        System.out.println ( n );
    }
    // Exibe um char na tela
    public static void print ( char n )
    {
        System.out.println ( n );
    }
    // Exibe um double
    public static void print ( double n )
    {
        System.out.println ( n );
    }
    public static void print ( boolean n )
    {
        System.out.println ( n );
    }
    public static void closeScanner ( )
    {
        scanner.close ( );
    }
    public static boolean isVogal ( char n )
    {
        if ( ( n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' ) || (n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U') )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isCaractere ( char n )
    {
        if ( ( n >= 'a' && n <= 'z' ) || ( n >= 'A' && n <= 'Z' ) )
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static boolean isCaractere ( String n )
    {
        boolean result = false;
        for ( int i = 0; i < n.length(); i++ )
        {
            char c = n.charAt ( i );
            if ( ( c >= 'a' && c <= 'z' ) || ( c >= 'A' && c <= 'Z' ) )
            {
                result = true;
            }
            else 
            {
                result = false;
            }
        }
        return ( result );
    }
    public static boolean isConsonants ( char n )
    {
        if ( isCaractere ( n ) && !isVogal ( n ) )
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    // Arrays
    public static boolean isVogal ( char a[] )
    {
        boolean result = false;
        for ( int i = 0; i < a.length; i++ )
        {
            if ( ( a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' ) || ( a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') )
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }
        return result;
    }
    public static int MaiorArray ( int a[] )
    {
        int maior = a[0];
        for ( int i = 0; i < a.length; i++ )
        {
            if ( a[i + 1] > maior )
            {
                maior = a[i + 1];
            }
        }
        return 0;
    }
    public static boolean Palindromo ( char a[], int i )
    {
        if ( a[0] != a[a.length - 1] )
        {
            return false; // Se tiver diferença, ele é falso
        }
        // Se a posição atual ( a[i] ) for igual a posição - 1 - i ( ou seja, for igual a posição a frente ) retotna true
        // Exemplo: ( 4 = ultima posição desse exemplo )
        // a[0] == a[4 - 1 - 0]
        // Vai comparar o primeiro com o ultimo nesse caso 
        if ( a[i] ==  a[a.length - 1 - i ])
        {
            return true;
        }
        return Palindromo ( a, i + 1 );
    }
    public static int quantVogal ( char c[], int i, int Vogal )
    {
        if ( i >= c.length )
        {
            return Vogal;
        }
        if ( isVogal ( c[i] ) )
        {
            return Vogal = quantVogal(c, i + 1, Vogal + 1);
        }
        else
        {
            return quantVogal(c, i + 1, Vogal);
        }
    }
    public static boolean isMaius ( char c )
    {
        boolean result = false;
        if ( c >= 'A' && c <= 'Z' )
        {
            result = true;
        }
        return result;
    }
    public static int CharForInt( char c )
    {
        int value = 0;
        if ( isCaractere ( c ) )
        {
            value = (int)c;
        }
        return value;
    }
    // ARQUIVOS
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
    public static void openWritePhrase ( String nomeArq )
    {
        Scanner scanner = new Scanner(System.in);
        print ( "Digite a frase: " );
        String frase = scanner.nextLine();
        scanner.close();
        try
        {
            BufferedWriter arquivoW = new BufferedWriter(new FileWriter ( nomeArq ));
            arquivoW.write ( frase );
            arquivoW.close ( );
            print ( "Frase armazenada corretamente no arquivo " + nomeArq );
        }
        catch ( IOException e )
        {
            System.out.println ( "Erro ao abrir o arquivo." + e.getMessage ( ) );
        }
    }  
    public static void MinusForMaiu ( String nomeArq )
    {
        try
        {
            BufferedReader arquivoR = new BufferedReader ( new FileReader ( nomeArq ));
            String linha;
            while ( ( linha = arquivoR.readLine ( ) ) != null )
            {
                for ( int i = 0; i < linha.length(); i++ )
                {
                    char c = linha.charAt(i);
                    if ( c >= 'a' && c <= 'z' )
                    {
                        c = Character.toUpperCase ( c );
                        
                    }
                    System.out.println ( c );
                }
                
            }
            arquivoR.close ( );
        }
        catch ( IOException e )
        {
            System.out.println ( "Erro ao ler o arquivo: " + e.getMessage ( ) );
        }
    }
}