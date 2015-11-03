import java.util.Random;

public class Drunkard
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        Random rand = new Random();
        for (int i = 0; i < 100; i++)
        {
            int intDirection = rand.nextInt(4);
            if (intDirection == 0)
                x += 1;
            else if (intDirection == 1)
                y += 1;
            else if (intDirection == 2)
                x -= 1;
            else
                y -= 1;
        }
        System.out.println("( " + x + " , " + y + " )");
    }
}