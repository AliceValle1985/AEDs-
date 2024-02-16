package Codigos;
import java.util.Scanner;
public class WhileForDo
{
    public static void main ( String[] args )
    {
        int i = 0;
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Quantas bct desejas?" );
        int Bct = scanner.nextInt ( );
        while ( i < Bct )
        {
            System.out.println ( "Buceta" );
            i++;
        }
        // Do while
        int Num5 = 0;
        System.out.println ( "Digite o numero 5" );
        do
        {
            Num5 = scanner.nextInt ( );
        }   while ( Num5 != 5 );
        System.out.println ( "Era tão dificil digitar o 5 caralho?" );
        for ( int a = 1; a <= Bct; a++ )
        {
            System.out.println ( a );
        }
        // Specific for to run arrays
        int [] Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for ( int n: Numbers )
        {
            System.out.println ( n );
        }
        System.out.println ( "\n////////////////ANOTHER////////////////\n" );
        for (int b = 0; b < 10; b++) 
        {
            if (b == 4) 
            {
                continue;
            }
            System.out.println(b);
        }
        scanner.close ( );
    }
    
}