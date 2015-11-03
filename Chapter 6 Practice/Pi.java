public class Pi
{
    public static void main(String[] args)
    {
        final double NUM = 4.0;
        double denom = 1.0;
        double pi = 0.0;
        for (int i = 1; i <= 10000; i++)
        {
            pi += (NUM / denom);
            denom += 2;
            pi -= (NUM / denom);
            denom += 2;
        }
        System.out.println(pi);
    }
}