
/**
 * Date Class - Creates a date object with some basic restrictions for each element.
 * 
 * @author ericbrooke
 * @version 1
 */
public class Date
{
    private int year;
    private int month;
    private int day;
    
    public static final int CURRENT_YEAR=2013;
    public static final int FIRST_DAY =1;
    public static final int LAST_DAY =31;
    public static final int FIRST_MONTH =1;
    public static final int LAST_MONTH =12;
    
    /**
     * Constructor for objects of class Date
     */
    public Date()
    {
        year = CURRENT_YEAR;
        month = FIRST_MONTH;
        day = FIRST_DAY;
        
    }
    
    public Date(int theYear, int theMonth, int theDay)
    {
        setYear(theYear);
        setMonth(theMonth);
        setDay(theDay);
        
    }

    /**
     * setYear - cannot be be greater then the current year
     * @version 1
     * @param  theYear   
     */
    public void setYear(int theYear)
    {
         
        
        if (theYear <= CURRENT_YEAR){
            year = theYear;
        }
        else {
            System.out.println("Come on give me a good year and the bottle");
        }
    }
    
     /**
     * setMonth - has to between 1 to 12
     * @version 1
     * @param  thMonth
     */
    public void setMonth(int theMonth)
    {
        if ((theMonth >= FIRST_MONTH) && (theMonth <= LAST_MONTH)){
            month = theMonth;
        }
        else {
            System.out.println("Not a valid month");
        }
    }
    
     /**
     * SetDay - set between 1 and 31
     * @version 1
     * @param  thDay
     */
    public void setDay(int theDay){
        if ((theDay >= FIRST_DAY) && (theDay <= LAST_DAY)) {
            day = theDay;
        }
        else {
            System.out.println("Not a valid day");
        }
        
    }
    
    /**
     * getYear
     * @version 1
     * @return  year
     */
    
    public int getYear(){
        return year;
    }
    
        /**
     * getMonth
     * @version 1
     * @return     month
     */
    
    public int getMonth(){
        return month;
    }
    
     /**
     * getDay
     * @version 1
     * @return     day
     */
    public int getDay(){
        return day;
    }
    
    /**
     * GetFullDate - translate the date elements from ints to String and collect them together with - between each element, adds 0 if less then 10 for month and day
     * @version 1
     * @return     y + m + d
     */
    public String getFullDate(){
        
       String m;
       String d;
        
        if (month <10) {
            m = Integer.toString(month);
            m = "0"+m;
        }
        else{
            m = Integer.toString(month);
        }

        if (day <10) {
            d = Integer.toString(day);
            d = "0"+d;
        }
        else{
            d = Integer.toString(day);
        }
        
        String y = Integer.toString(year);

        return y +"-"+ m +"-"+ d;
    }
}
