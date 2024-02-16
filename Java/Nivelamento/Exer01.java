package Nivelamento;
import Biblioteca.Apvg;
public class Exer01 
{
    // Metodo
    public static boolean Xdentrodoarray( int a[], int x )
    {
        boolean resultado = false;
        int tamanhodoarray = a.length;
        for( int i = 0; i < tamanhodoarray; i++ )
        {
            if( x == a[i] )
            {
                resultado = true;
            }
        }
        return ( resultado );
    }
    public static void main ( String [] agrs )
    {
        int y = 0; 
        // Numero desejado
        int num = 0;
        // Quantidade do array
        int arrayquant = 0;
        Apvg.printString( "Digite a quantidade de valores para o array: " );
        // RecivieInt para receber a quantidade de array
        arrayquant = Apvg.receiveInt( arrayquant );

        // Array
        int[ ] a = new int[arrayquant];
        Apvg.printString( "Digite os valores do array: " );
        // For para dar os valores ao array
        for( int i = 0; i < arrayquant; i++ )
        {
            y = Apvg.receiveInt ( y );
            a[i] = y;
        }
        Apvg.printString( "Digite o numero que deseja procurar: " );
        num = Apvg.receiveInt ( num );
        boolean resultado = Xdentrodoarray( a, num );
        if(resultado == true)
        {
            Apvg.printString( "Esse numero ( " + num + " ) esta presente no array" );
        }
        else
        {
            Apvg.printString( "Esse numero ( " + num + " ) não esta presente no array: " );
        }

    }
}
