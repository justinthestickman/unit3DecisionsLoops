import java.util.Scanner;

public class Diamond
{
    public static void main(String[] Args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();
        int lines = (input * 2) - 1;
        int lines1 = input;
        int lines2 = input-1;
        for (int i = 0; i < lines1; i++)
        {
            int spaces = (lines1 - i);
            int asterisks = (i * 2) + 1;
            for (int n = 0; n < spaces; n++)
            {
                System.out.print(" ");
            }
            for (int x = 0; x < asterisks; x++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = lines2; i > 0; i--)
        {
            int spaces = (lines1 - i + 1);
            int asterisks = (i * 2) - 1;
            for (int n = 0; n < spaces; n++)
            {
                System.out.print(" ");
            }
            for (int x = 0; x < asterisks; x++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

//   *   
//  ***  
// *****  
//*******
// *****  
//  ***  
//   *   