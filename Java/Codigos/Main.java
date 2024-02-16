package Codigos;
// The name of the classes always have to star with uppercase letters (letras maiusculas no inicio da classe)
// The name of the java file must match the class name
public class Main 
{
    // This is the main function, it's like int main from c
    // Public means the it can be called at any cricumstances
    public static void main ( String[] args )
    {
        // Const value
        final int Constante = 20;
        // Int
        int Num             = 15;
        int Num2            = 5;
        /* Float
        Note that you should end the value with an "f" for floats and "d" if it's doubles
        */
        float FloatValue    = 19.99f;
        // Char
        char Letter         = 'A';
        // Bool
        boolean Bool        = true;

        System.out.println ( Num );
        
        System.out.println ( Num + Num2 );
        System.out.println ( Constante );
        System.out.println ( FloatValue );
        System.out.println ( Letter );
        System.out.println ( Bool );
        /*
        System.out.println ( "Bucetahiperxerecante" );
        System.out.println ( "O println sempre vai pular uma linha" );
        System.out.print   ( "O print não pula nenhuma linha. " );
        System.out.print   ( "Essa parte já é outro print." );
        */
    }
}