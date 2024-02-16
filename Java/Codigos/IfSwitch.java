package Codigos;
import java.util.Scanner;
public class IfSwitch
{
    public static void main ( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        // Test to se if any one is old enough to vote
        int myAge = 18;
        int votingAge = 16;
        if (myAge >= votingAge) 
        {
          System.out.println("Old enough to vote!");
        } 
        else 
        {
          System.out.println("Not old enough to vote.");
        }
        // Or, can be use this:
        String result = /*if*/( myAge >= 16 ) ? "Old enough to vote!" : "Not old enough to vote.";
        System.out.println ( result );
        // Switch to define the day of the week
        System.out.print("Digite um número de 1 a 7: ");
        int dayWeek = scanner.nextInt ( );
        switch ( dayWeek )
        {
            case 1: System.out.println ( "Sunday" ); break;
            case 2: System.out.println ( "Monday" ); break;
            case 3: System.out.println ( "Tuesday" ); break;
            case 4: System.out.println ( "Wendnesday" ); break;
            case 5: System.out.println ( "Thursday" ); break;
            case 6: System.out.println ( "Friday" ); break;
            case 7: System.out.println ( "Saturday" ); break;
        }
        scanner.close ( );
    }
}