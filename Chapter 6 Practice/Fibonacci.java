import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int fold1 = 0;
        int fold2 = 1;
        int fnew = fold1 + fold2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Integer n for Fibonacci Sequence: ");
        int n = scan.nextInt();
        System.out.println(fnew);        
        for (int i = 0; i < n; i++)
        {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;
            System.out.println(fnew);
        }
        //System.out.println(fnew);
    }
}