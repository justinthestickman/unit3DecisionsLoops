import java.util.Scanner;

public class FindMaxAndMin
{
    public static void findMax()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter a series of numbers or any character to quit." );
        
        double largest = scan.nextDouble();
        while( scan.hasNextDouble() )
        {
            double input = scan.nextDouble();
            if( input > largest )
            {
                largest = input;
            }
        }
        
        System.out.println( "Largest: " + largest );
    }
    public static void findMin()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter a series of numbers or any character to quit." );
        
        double smallest = scan.nextDouble();
        while( scan.hasNextDouble() )
        {
            double input = scan.nextDouble();
            if( input < smallest )
            {
                smallest = input;
            }
        }
        
        System.out.println( "Smallest: " + smallest );
    }
    public static void findMaxAndMin()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter a series of numbers or any character to quit." );
        
        double largest = scan.nextDouble();
        double smallest = largest;
        while( scan.hasNextDouble() )
        {
            double input = scan.nextDouble();
            if( input > largest )
            {
                largest = input;
            }
            if( input < smallest )
            {
                smallest = input;
            }
        }
        
        System.out.println( "\nLargest: " + largest + "\nSmallest: " + smallest );
    }
}