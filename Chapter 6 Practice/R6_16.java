import java.util.Scanner;

public class R6_16
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner( System.in );
        System.out.print("asdf: ");
        int n = in.nextInt();
        double x = 0;
        double s;
        
        s = 1.0 / (1 + n * n);
        n++;
        x += s;
        
        while ( s > 0.01 )
        {
            s = 1.0 / (1 + n * n);
            n++;
            x += s;
        }
        System.out.println("s: " + s + "\nx: " + x);
    }
    
    public static void main2(String[] args)
    {
        Scanner in = new Scanner( System.in );
        System.out.print("asdf: ");
        int n = in.nextInt();
        double x = 0;
        double s;
        do
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        while (s > 0.01);
        System.out.println("s: " + s + "\nx: " + x);
    }
}