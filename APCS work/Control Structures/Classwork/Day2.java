import java.util.Random;
/**
 * name:AbdielNie
 * date: 10/18/2017
 * description: The random homework
 */
public class Day2
{
    //Day2 question1
    /**
     * Write a method that randomly generates an integer 
     * between 1 and 12 and 
     * displays the English month name January, February, 
     * etc… for the number 1, 2, etc. 
     */
    public static String randomMonth()
    {
        Random random = new Random();
        int month = random.nextInt(6);
        if (month == 1)
        {
            System.out.println("January");
        }
        else if (month == 2)
        {
            System.out.println("February");
        }
        else if (month == 3)
        {
            System.out.println("March");
        }
        else if (month == 4)
        {
            System.out.println("April");
        }
        else if (month == 5)
        {
            System.out.println("May");
        }
        return "June";
        
    }
    
    //Question 2
    /**
     * Write a method named capitalizeName 
     * that takes a first name and last name. 
     * Make sure the names are properly capitalized. 
     * Example:
     * Input: deMar deRozan
     * Output: DeMar DeRozan
     * Input: Stephen colbert
     * Output: Stephen Colbert
     */
}
