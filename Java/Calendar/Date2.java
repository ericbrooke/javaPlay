/**
 * Date class 
 * 
 * @author Eric Brooke
 * @version 2.0
 */
public class Date
{
    // Symbolic constants
    public static final int LAST_YEAR_ALLOWED           = 2099;
    public static final int DEFAULT_MONTH               = 1;
    public static final int DEFAULT_DAY                 = 1;
    public static final int MAX_MONTH                   = 12;
    public static final int MAX_DAY                     = 31;
    
    public static final int MONTH_CODE_JAN              = 1;  // gregorian conversion month codes
    public static final int MONTH_CODE_FEB              = 4;
    public static final int MONTH_CODE_MAR              = 4;
    public static final int MONTH_CODE_APR              = 0;
    public static final int MONTH_CODE_MAY              = 2;
    public static final int MONTH_CODE_JUN              = 5;
    public static final int MONTH_CODE_JUL              = 0;
    public static final int MONTH_CODE_AUG              = 3;
    public static final int MONTH_CODE_SEP              = 6;
    public static final int MONTH_CODE_OCT              = 1;
    public static final int MONTH_CODE_NOV              = 4;
    public static final int MONTH_CODE_DEC              = 6;
    
    public static final int JANUARY                     = 1; // months of the year
    public static final int FEBRUARY                    = 2; 
    public static final int MARCH                       = 3;
    public static final int APRIL                       = 4;
    public static final int MAY                         = 5;
    public static final int JUNE                        = 6;
    public static final int JULY                        = 7;
    public static final int AUGUST                      = 8;
    public static final int SEPTEMBER                   = 9;
    public static final int OCTOBER                     = 10;
    public static final int NOVEMBER                    = 11;
    public static final int DECEMBER                    = 12;
    
    public static final int SATURDAY                    = 0; // day of the week integers
    public static final int SUNDAY                      = 1;
    public static final int MONDAY                      = 2;
    public static final int TUESDAY                     = 3;
    public static final int WEDNESDAY                   = 4;
    public static final int THURSDAY                    = 5;
    public static final int FRIDAY                      = 6;
    
    public static final int NUMBER_DIGITS_SHORT_YEAR    = 2; // 2 digits from 4 digit year
    
    public static final int LEAP_YEAR_FACTOR_A          = 4; // leap year number factors
    public static final int LEAP_YEAR_FACTOR_B          = 100;
    public static final int LEAP_YEAR_FACTOR_C          = 400;
    
    public static final int SIXTEEN_HUNDREDS_MIN        = 1600;// century min / max integers
    public static final int SIXTEEN_HUNDREDS_MAX        = 1699;
    public static final int SEVENTEEN_HUNDREDS_MIN      = 1700;
    public static final int SEVENTEEN_HUNDREDS_MAX      = 1799;
    public static final int EIGHTEEN_HUNDREDS_MIN       = 1800;
    public static final int EIGHTEEN_HUNDREDS_MAX       = 1899;
    public static final int TWO_THOUSANDS_MIN           = 2000;
    public static final int TWO_THOUSANDS_MAX           = 2099;
    public static final int TWENTY_ONE_HUNDREDS_MIN     = 2100;
    public static final int TWENTY_ONE_HUNDREDS_MAX     = 2199;
    public static final int SIXTEEN_HUNDREDS_FACTOR     = 6;
    public static final int SEVENTEEN_HUNDREDS_FACTOR   = 4;
    public static final int EIGHTEEN_HUNDREDS_FACTOR    = 2;
    public static final int TWO_THOUSANDS_FACTOR        = 6;
    public static final int TWENTY_ONE_HUNDREDS_FACTOR  = 4;
    
    public static final int MONTHS_IN_YEAR              = 12;
    public static final int WEEKS_IN_MONTH              = 4;
    public static final int DAYS_IN_WEEK                = 7;

    private int year;
    private int month;
    private int day;

    /**
     * Default constructor
     */
    public Date()
    {
    }
    
    /**
     * Secondary constructor for passing in the year only
     * 
     * @param year
     */
    public Date(int year)
    {
        if ((year > 0) && (year <= LAST_YEAR_ALLOWED))
        {
            this.year = year;    
        }
    }

    /**
     * Secondary constructor for passing in year month & day
     */
    public Date(int year, int month, int day)
    {
        if ((year > 0) && (year <= LAST_YEAR_ALLOWED))
        {
            this.year = year;    
        }

        if ((month > 0) && (month <= MAX_MONTH))
        {
            this.month = month;    
        }

        if ((day > 0) && (day <= MAX_DAY))
        {
            this.day = day;    
        }
    }

    /**
     * Mutator for year
     * 
     * @param int year
     */
    public void setYear(int year)
    {
        if ((year > 0) && (year <= LAST_YEAR_ALLOWED))
        {
            this.year = year;    
        }        
    }

    /**
     * Accessor for the year
     * 
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Mutator for month
     * 
     * @param int month
     */
    public void setMonth(int month)
    {
        if ((month > 0) && (month <= MAX_MONTH))
        {
            this.month = month;    
        }        
    }

    /**
     * Accessor for the month
     * 
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Mutator for day
     * 
     * @param int day
     */
    public void setDay(int day)
    {
        if ((day > 0) && (day <= MAX_DAY))
        {
            this.day = day;    
        }        
    }

    /**
     * Accessor for the day
     * 
     * @return the day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Accessor to return the day of the week
     * @return day of the week
     */
    public String getDayOfTheWeek()
    {
        // convert to string to get last two characters of the year and back to int to do the math
        String shortYearString  = Integer.toString(year);
        shortYearString         = shortYearString.substring(shortYearString.length() - NUMBER_DIGITS_SHORT_YEAR);
        int shortYearInt        = Integer.parseInt(shortYearString); // convert the shortend year back to int for calcs
        int monthCode           = MONTH_CODE_JAN;

        //set the monthCode variable according to the month
        if (month == JANUARY)
        {
            monthCode = MONTH_CODE_JAN;
        }
        else if (month == FEBRUARY)
        {
            monthCode = MONTH_CODE_FEB;
        }
        else if (month == MARCH)
        {
            monthCode = MONTH_CODE_MAR;
        }
        else if (month == APRIL)
        {
            monthCode = MONTH_CODE_APR;
        }
        else if (month == MAY)
        {
            monthCode = MONTH_CODE_MAY;
        }
        else if (month == JUNE)
        {
            monthCode = MONTH_CODE_JUN;
        }
        else if (month == JULY)
        {
            monthCode = MONTH_CODE_JUL;
        }
        else if (month == AUGUST)
        {
            monthCode = MONTH_CODE_AUG;
        }
        else if (month == SEPTEMBER)
        {
            monthCode = MONTH_CODE_SEP;
        }
        else if (month == OCTOBER)
        {
            monthCode = MONTH_CODE_OCT;
        }
        else if (month == NOVEMBER)
        {
            monthCode = MONTH_CODE_NOV;
        }
        else 
        {
            monthCode = MONTH_CODE_DEC;
        }

        // adjust for leap years in the months of Jan and Feb
        if (isLeapYear() && (month <= 2))
        {
            monthCode -= 1;
        }

        // adjust the monthCode variable depending on what century was entered for the year
        if ((year >= SIXTEEN_HUNDREDS_MIN) && (year <= SIXTEEN_HUNDREDS_MAX))
        {
            monthCode += SIXTEEN_HUNDREDS_FACTOR;
        }
        else if ((year >= SEVENTEEN_HUNDREDS_MIN) && (year <= SEVENTEEN_HUNDREDS_MAX))
        {
            monthCode += SEVENTEEN_HUNDREDS_FACTOR;
        }
        else if ((year >= EIGHTEEN_HUNDREDS_MIN) && (year <= EIGHTEEN_HUNDREDS_MAX))
        {
            monthCode += EIGHTEEN_HUNDREDS_FACTOR;
        }
        else if ((year >= TWO_THOUSANDS_MIN) && (year <= TWO_THOUSANDS_MAX))
        {
            monthCode += TWO_THOUSANDS_FACTOR;
        }
        else if ((year >= TWENTY_ONE_HUNDREDS_MIN) && (year <= TWENTY_ONE_HUNDREDS_MAX))
        {
            monthCode += TWENTY_ONE_HUNDREDS_FACTOR;
        }

        // calculate the numbered day of the week for the given date based on supplied formula
        int numberDayOfWeek     = ((shortYearInt / MONTHS_IN_YEAR) + (shortYearInt % MONTHS_IN_YEAR) + ((shortYearInt % MONTHS_IN_YEAR) / WEEKS_IN_MONTH) + day + monthCode) % DAYS_IN_WEEK;

        // return the string of the name of the day of the week
        if (numberDayOfWeek == SATURDAY)
        {
            return "Saturday";
        }
        else if (numberDayOfWeek == SUNDAY)
        {
            return "Sunday";
        }
        else if (numberDayOfWeek == MONDAY)
        {
            return "Monday";
        }
        else if (numberDayOfWeek == TUESDAY)
        {
            return "Tuesday";
        }
        else if (numberDayOfWeek == WEDNESDAY)
        {
            return "Wednesday";
        }
        else if (numberDayOfWeek == THURSDAY)
        {
            return "Thursday";
        }
        else
        {
            return "Friday";
        }

    }
    
    /**
     * Method getMonthStringFromInt  convert an integer month to a String month
     *
     * @return The string value
     */
    public String getMonthStringFromInt()
    {
        if (month == JANUARY)
        {
            return "January";
        }
        else if (month == FEBRUARY)
        {
            return "February";
        }
        else if (month == MARCH)
        {
            return "March";
        }
        else if (month == APRIL)
        {
            return "April";
        }
        else if (month == MAY)
        {
            return "May";
        }
        else if (month == JUNE)
        {   
            return "June";
        }
        else if (month == JULY)
        {
            return "July";
        }
        else if (month == AUGUST)
        {
            return "August";
        }
        else if (month == SEPTEMBER)
        {
            return "September";
        }
        else if (month == OCTOBER)
        {
            return "October";
        }
        else if (month == NOVEMBER)
        {
            return "November";
        }
        else 
        {
            return "December";
        }   
    
    }

    /**
     * method to tell if the year is a leap year
     * @return true or false for is leap year
     */
    private boolean isLeapYear()
    {
        if((year % LEAP_YEAR_FACTOR_A == 0 && year % LEAP_YEAR_FACTOR_B != 0) || (year % LEAP_YEAR_FACTOR_C == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

