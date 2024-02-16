package Unidade00Exercicios;

import Biblioteca.Apvg;

public class Unidade00f
{

    
    public static void main ( String[] args )
    {
        int x = 0;
        String nomeArq = " ";
        Apvg.print ( "1 - Armazenar uma frase no arquivo" );
        Apvg.print ( "2 - Mostrar o conteudo na tela" );
        Apvg.print ( "3 - Converter minusculas para maiusculas" );
        Apvg.print ( "Digite o numero desejado: " );
        x = Apvg.receiveI ( x );
        switch ( x )
        {
            case 1: 
            Apvg.print ( "Digite o nome do arquivo: " );
            nomeArq = Apvg.receiveS( nomeArq );
            Apvg.openWritePhrase ( nomeArq );
            break;
            case 2:
            Apvg.print ( "Digite o nome do arquivo: " );
            nomeArq = Apvg.receiveS( nomeArq );
            Apvg.openRead ( nomeArq );
            break;
            case 3:
            Apvg.print ( "Digite o nome do arquivo: " );
            nomeArq = Apvg.receiveS( nomeArq );
            Apvg.MinusForMaiu ( nomeArq );
            break;

        }
    }
}