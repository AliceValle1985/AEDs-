package Codigos;
import Biblioteca.Apvg;
public class Unid00retanguloclass
{
    private double base;
    private double altura;
    public Unid00retanguloclass ( double b, double a )
    {
        this.base = b;
        this.altura = a;
    }
    public double getArea ()
    {
        double area = this.base * this.altura;
        return area;
    }
    public double getPerimetro ( )
    {
        double perimetro = 2 * ( this.base + this.altura );
        return perimetro;
    }
    public double getDiagonal ( )
    {
        double diagonal =  Math.sqrt ( Math.pow( this.base, 2 )  + ( Math.pow( this.altura, 2 ) ) );
        return diagonal;
    }
    /*public void Supostomain ( )
    {
        double diago = getDiagonal ( 2.0,2.0 );
        Apvg.print ( diago );
    }*/
    public static void main ( String[] args )
    {
        int x = 0;
        double base      = 0.0;
        double altura    = 0.0;
        double diago     = 0.0;
        double perimetro = 0.0;
        double area  = 0.0;
        Apvg.print ( "Digite a base: " );
        base = Apvg.receiveD ( base );
        Apvg.print ( "Digite a altura: " );
        altura = Apvg.receiveD ( altura );

        Unid00retanguloclass retangulo = new Unid00retanguloclass( base, altura );
        Apvg.print ( "1 - Area" );
        Apvg.print ( "2 - Perimetro" );
        Apvg.print ( "3 - Diagonal" );
        Apvg.print ( "Digite o numero desejado: " );
        x = Apvg.receiveI ( x );
        switch ( x )
        {
            case 1: 
            area = retangulo.getArea ( );
            Apvg.print ( "Area do retangulo: " + area );

            case 2: 
            perimetro = retangulo.getPerimetro ( );
            Apvg.print ( "Perimetro do retangulo: " + perimetro );
            break;

            case 3:
            diago = retangulo.getDiagonal ( );
            Apvg.print ( "Diagonal do retangulo: " + diago );
            break;

        }
    }
} 

