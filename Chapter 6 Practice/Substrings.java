import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter a string: ");
        String input = scan.next();
        int length = input.length();
        for( int i = 0; i < length; i++ )
        {
            for (int n=0; n < length-i; n++)
            {
                String sub1 = input.substring(n,i+n+1);
                System.out.println(sub1);
            }
        }
    }
}