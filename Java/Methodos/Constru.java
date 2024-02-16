package Methodos;
import Biblioteca.Apvg;
public class Constru 
{
    int x = 0;
    int y = 0;
    int c = 0;
    public Constru ( int x, int y, int c )
    {
        this.x = x;
        this.y = y;
        this.c = c;
    }
    public static void main ( String[] args )
    {
        Constru myObj = new Constru ( 5, 6, 7 );
        Apvg.printInt(myObj.x);
        Apvg.printInt(myObj.y);
        Apvg.printInt(myObj.c);

    }
}
