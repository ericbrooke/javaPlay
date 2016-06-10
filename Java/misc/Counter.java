/**
 * lab8a
 * 
 * @author ericbrooke
 * @version 1
 */
public class Counter
{
    // instance variables

    /**
     * Constructor for objects of class lab8a
     */
    public lab8a()
    {
 
    }

    /**
     * 
     * @param  topValue
     */
    public static void displayNumbers(int topValue)
    {
        int counter = 0;
        if (topValue <0)
        {
            topValue--;
        }
        else 
        {
            topValue++;
        }
        while (counter != topValue)
        {
            System.out.println(counter);
            if (topValue < 0){
                counter --;
            }
            else 
            {
            counter ++;
            }
        }
    }
    
    public static void displayInReverse(int low, int high)
    {
        int counter;
        counter = high;
            
        if (low > high) 
        {
            System.out.println("Nann you dont understand go away");
        }
        else 
        {
            
            System.out.println("low number - "+low);
            System.out.println("high number - "+counter);
            
            //while (counter != low)
            //{
            //    System.out.println(counter);
                
            //        counter ++;
              
            //}
        }
    }
