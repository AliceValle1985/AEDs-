package Codigos;
import Biblioteca.Apvg;
// Esse é um exercicio de um dos slides do naises (unidade 00, slide 34), os metodos estão no biblioteca que eu criei para simplificar o uso de algumas coisas, como receber valores e exibir também
public class Unid00LerValeImp 
{
    public static void main(String[] args) 
    {
        String texto = "" ;
        char c       = 'a';
        int inteiro  =  0 ;
        double real  = 0.0;
        Apvg.print ( "Digite um texto: " );
        texto = Apvg.receiveS ( texto );
        Apvg.print ( "Digite um caractere: " );
        c = Apvg.receiveC ( c );
        Apvg.print ( "Digite um numero inteiro: " );
        inteiro = Apvg.receiveI ( inteiro );
        Apvg.print ( "Digite um numero real: " );
        real = Apvg.receiveD ( real );
        Apvg.print ( "Suas respostas: " );
        Apvg.print ( texto );
        Apvg.print ( c );
        Apvg.print ( inteiro );
        Apvg.print ( real );
    }
    
}
