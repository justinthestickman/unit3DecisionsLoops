import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year <= 1582)
        {
            System.out.println("Leap Year");
        }
        else if (year % 400 == 0 && year > 1582)
        {
            System.out.println("Leap Year");
        }
        else if (year % 100 == 0 && year > 1582)
        {
            System.out.println("Not a Leap Year");
        }
        else if (year % 4 == 0 && year > 1582)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}