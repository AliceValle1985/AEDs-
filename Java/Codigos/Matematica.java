package Codigos;
public class Matematica
{
    public static void main ( String[] args )
    {
        int Bigger  = 25;
        int Smaller = 5;
        // Displays the highest value
        System.out.println ( Math.max ( Bigger, Smaller ) );
        // Displays the square root
        System.out.println ( "Raiz quadrada de 64: " + Math.sqrt ( 64 ) );
        // Displays the absolute value ( the positive value )
        System.out.println ( "Positive value of -50: " + Math.abs ( -50 ) );
        // Displays a random number between 0.0 and 1.0
        System.out.println ( "Random number: " + Math.random ( ) );
        // Displays a random number desired by the user
        int Random = ( int ) ( Math.random ( ) * 101 );
        System.out.println ( "Random: " + Random );
    }
}