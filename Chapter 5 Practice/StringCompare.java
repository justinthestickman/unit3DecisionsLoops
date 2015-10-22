/**
 * Compares two Strings.
 * 
 * @author Justin Huang, Nic Gardiner, Tony Lu
 * @version 15 October 2015
 */
public class StringCompare
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        if (word1.equals(word2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        String sub1 = word1.substring(0,3);
        String sub2 = word2.substring(0,3);
        
        if (sub1.compareTo(sub2) == 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
   }
}