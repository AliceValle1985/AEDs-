package Codigos;
import Biblioteca.Apvg;
public class Unid00recursivi 
{
    // Faça um método recursivo que receba dois números inteiros e retorne a 
    // multiplicação do primeiro pelo segundo fazendo somas
    public static int multiplica ( int num, int vezes )
    {
        if ( vezes == 0 )
        {
            return ( 0 );
        }
        if ( vezes == 1 )
        {
            return ( num );
        }
        return num + multiplica ( num, vezes - 1 );
    }    
    public static int fat ( int num )
    {
        if ( num == 1 )
        {
            return ( 1 );
        }
        if ( num == 0 )
        {
            return ( 0 );
        }
        else
        {
            return num * fat ( num - 1 );
        }
    }
    public static int fib ( int num )
    {
        if ( num <= 1 )
        {
            return ( num );
        }
        else
        {
            return fib ( num - 1 ) + fib ( num - 2 );
        }
    }
    public static int maior ( int a[], int n )
    {
        if (n == 1) 
        {
            return a[0];
        } 
        else 
        {
            int maior = maior ( a, n - 1 );
            if ( maior > a[n - 1] ) 
            {
                return maior;
            } 
            else 
            {
                return a[n - 1];
            }
        }
    }
    public static void main ( String[] args )
    {
        int x = 0;
        int mult = multiplica ( 5, 5 );
        int fato = fat ( 5 );
        int fibonacci = fib ( 9 );
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = a.length;
        int nummaior = maior ( a, n );
        char []c = {'e', 's', 's', 'o' };
        char []vogaisc = {'a', 'e', 'i', 'o', 'u'};
        boolean result = false;
        int vogais = 0;
        Apvg.print ( "1 - Multiplica" );
        Apvg.print ( "2 - Fatorial" );
        Apvg.print ( "3 - Fibonacci" );
        Apvg.print ( "4 - Maior Array" );
        Apvg.print ( "5 - Palindromo" );
        Apvg.print ( "6 - Quantidade de Vogais" );
        Apvg.print ( "Digite o numero desejado: " );
        x = Apvg.receiveI ( x );
        switch ( x )
        {
            case 1: Apvg.print ( mult );
            break;

            case 2: Apvg.print ( fato );
            break;

            case 3: Apvg.print ( fibonacci );
            break;

            case 4: Apvg.print ( "Maior elemento: " + nummaior );
            break;

            case 5: result = Apvg.Palindromo ( c, 0 );
            Apvg.print ( result );
            break;

            case 6: vogais = Apvg.quantVogal( vogaisc, 0, 0 );
            Apvg.print ( vogais );
            break;
        }
    }
}
