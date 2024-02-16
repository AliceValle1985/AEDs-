package Codigos;
import Biblioteca.Apvg;
public class Unid00UltExer 
{
    public static void Exer1 ( )
    {
        String palavra = "";
        int maiusculos = 0;
        int minusculos = 0;
        int tamanho    = 0;
        
        Apvg.print ( "Digite uma palavra: " );
        palavra = Apvg.receiveS ( palavra );
        char[] caracteres = palavra.toCharArray();
        for ( int i = 0; i < palavra.length ( ); i++ )
        {   
            char caractere = caracteres[i];
            if ( caractere >= 'a' && caractere <= 'z' )
            {
                minusculos++;
            }
            if ( caractere >= 'A' && caractere <= 'Z' )
            {
                maiusculos++;
            }
            tamanho++;
        }  
        Apvg.print ( "Quantidade de caracteres: " + tamanho );
        Apvg.print ( "Quantidade de maiusculas: " + maiusculos );
        Apvg.print ( "Quantidade de minusculas: " + minusculos );
    }
    public static void oca ( )
    {
        String palavra = "";
        Apvg.print ( "Digite uma palavra: " );
        palavra = Apvg.receiveS ( palavra );
        char[] caracteres = palavra.toCharArray();
        for ( int i = 0; i < palavra.length ( ); i ++ )
        {
            char caractere = caracteres[i];
            if ( caractere == 'a' )
            {
                int posicao = i + 1;
                Apvg.print ( "A letra 'a' se encontra na posição " + posicao + "." );
            }
        }
    }
    public static void tuto ( )
    {
        String palavra  = "";
        int quantletras = 0;
        int Vogal       = 0;
        int consoantes  = 0;
        int naoletras   = 0;
        Apvg.print ( "Digite uma palavra: " );
        palavra = Apvg.receiveS ( palavra );
        char[] caracteres = palavra.toCharArray();
        int quantCaracteres = palavra.length ( );
        for ( int i = 0; i < quantCaracteres; i ++ )
        {
            char caractere = caracteres[i];
            if ( Apvg.isCaractere ( caractere ) )
            {
                quantletras++;
            }
            if ( Apvg.isVogal ( caractere ) == true )
            {
                Vogal++;
            }
            if ( Apvg.isConsonants ( caractere ) == true )
            {
                consoantes++;
            }
            if ( Apvg.isConsonants ( caractere ) == false && Apvg.isVogal ( caractere ) == false && Apvg.isCaractere ( caractere ) == false )
            {
                naoletras++;
            }
        }
        Apvg.print ( "Quantidade de letras: " + quantletras );
        Apvg.print ( "Quantidade de não letras ( simbolos ): " + naoletras );
        Apvg.print ( "Quantidades de vogais: " + Vogal );
        Apvg.print ( "Quantidades de consoantes: " + consoantes );
    }
    public static void main(String[] args) 
    {
        Exer1 ( );
        oca ( );
        tuto ( );
    }
}
