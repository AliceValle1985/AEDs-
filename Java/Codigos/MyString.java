package Codigos;
public class MyString
{
    public static void main ( String[] args )
    {
        // String
        String Name         = "Alice ";
        String Surname      = "Valle";
        String FullName     = Name + Surname;
        System.out.println ( Name );
        System.out.println ( "Hello " + FullName );
        System.out.println ( "Quantidade de letras no seu nome: " + FullName.length ( ));
        System.out.println ( FullName.toUpperCase ( ) );
        System.out.println ( FullName.toLowerCase ( ) );
        // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
        System.out.println ( FullName.indexOf( "Valle" ) );
        System.out.println ( " " );
        String Name2        = "Valkriya";
        String Surname2     = "Ivanov";
        System.out.println ( Name2 + " " + Surname2 );
        // Or:
        System.out.println ( Name2.concat( Surname2 ) );
        // If you have do use double quotes in the print, you'll have to use \" anything \"
        System.out.println ( "This is \"just\" a test, and will not make diference" );
        // It goes for une quote ( ' ) to
        System.out.println ( "This is a \'test\' too" );
    }
}