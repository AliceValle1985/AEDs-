package Codigos;
public class Arrays
{
    public static void main ( String[] args )
    {
        // Array are used to store mutiple values in a single varible
        // This varible 'cars' have 4 strings inside of it
        //                  [0]     [1]     [2]     [3]
        String [] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // Array of integers
        //            [0]  [1] [2] [3] [4]
        int[] MyNum = {10, 20, 30, 40, 50};
        // Accessing the elements of arrays
        System.out.println ( Cars[0] + " " + MyNum[0] );
        Cars[0]  = "Xereca";
        MyNum[0] = 3;
        System.out.println ( Cars[0] + " " + MyNum[0] );
        // -------------ARRAYS LENGTH-------------
        System.out.println ( "Amount of strings inside \'Cars\': " + Cars.length );
        System.out.println ( "Amount of integers inside \'MyNum\': " + MyNum.length );
        // Specific for to run each element of a array
        for ( int n: MyNum )
        {
            System.out.println ( n );
        }
        for ( int i = 0; i < Cars.length; i++ )
        {
            System.out.println ( Cars[i] );
        }
    }

}
