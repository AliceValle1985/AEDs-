package Biblioteca;
import java.util.Scanner;
public class Apvg 
{
    // Public methods must be called by creating objects
    // Static methods can be called without creating objects
    public static int receiveInt ( int n )
    {
        Scanner scanner = new Scanner ( System.in );
        n = scanner.nextInt (  );
        scanner.close ( );
        return ( n );
    }
    // Exibe uma string na tela
    public static void printString ( String n )
    {
        System.out.println( n );
    }
    public static void printInt ( int n )
    {
        System.out.println( n );
    }
}