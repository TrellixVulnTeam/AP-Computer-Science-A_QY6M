import java.util.Scanner;
/**
 * Given a string and a non-negative int n, 
 * we'll say that the front of the string 
 * is the first 3 chars, or whatever is 
 * there if the string is less than length 3.
 * Return n copies of the front; 
 */
public class loopQ2
{
   public static void frontTimes(int num)
   {
      int a;
      System.out.println("Put into your word:");
      Scanner keyboard = new Scanner(System.in);
      String i = keyboard.nextLine();
      for (a = 0; a <= (num - 1); a ++)
      {
          System.out.print(i.charAt(a));
      }
   }
}
