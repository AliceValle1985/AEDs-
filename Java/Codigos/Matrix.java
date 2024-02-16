package Codigos;
public class Matrix
{
    public static void main ( String[] args )
    {
        int[][] MyMatrix = { {1, 2, 3, 4}, {5, 6, 7} };
        for(int i = 0; i < MyMatrix.length; i++)
        {
            for(int j = 0; j < MyMatrix[i].length; ++j)
            {
                System.out.print ( MyMatrix[i][j] + " " );
            }
        }
    }
}