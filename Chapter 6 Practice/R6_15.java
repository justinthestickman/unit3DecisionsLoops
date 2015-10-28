public class R6_15
{
    public static void main(String[] args)
    {
        int s = 0;
        int i = 1;
        while( i <= 10)
        {
            s += i;
            i++;
        }
        System.out.println(s);
    }
    
    public static void main2(String[] args)
    {
        int s = 0;
        for( int i = 1; i <= 10; i++ )
        {
            s = s + i;
        }
        System.out.println(s);
    }
}