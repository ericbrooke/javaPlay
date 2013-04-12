
/**
 * Hockey Player
 * 
 * @author eric brooke
 * @version 1
 */
public class HockeyPlayer
{
    // instance variables 
    Name name;
    char positionPlayed; // f or d or g
    Date dateBorn;
    double annualSalaryUSDollars;
    
    public static final int LEAGUE_MIN_SALARY_US_DOLLARS=500000;
    
    /**
     * Constructor for objects of class HockeyPlayer
     */
    public HockeyPlayer()
    {
   
    }

     /**
     * constructor - withs data tests
     * @version 1
     * @param  name, positionPlayed, born, annualSalaryUSDollars
     */
    
    public HockeyPlayer(Name name,char positionPlayed,Date born,double annualSalaryUSDollars)
    {
        if (name != null)
        {
            this.name = name;
        }
        else
        {
            name.setFirstName("john");
            name.setLastName("doe");
        }

     
        setPositionPlayed(positionPlayed);
     
        if(annualSalaryUSDollars >=LEAGUE_MIN_SALARY_US_DOLLARS)
        {
            this.annualSalaryUSDollars = annualSalaryUSDollars;
        }
        else 
        {
            this.annualSalaryUSDollars =LEAGUE_MIN_SALARY_US_DOLLARS;
        }
        
        if(born.getYear() < 1900 || born.getYear() > 2012)
        {
            this.dateBorn.setDay(1);
            this.dateBorn.setMonth(1);
            this.dateBorn.setYear(1900);
        }
        else
        {
            this.dateBorn = born;
        }
    }

    /**
     * setName
     * @param  name object
     */
    public void setName(Name name)
    {
        this.name = name;
    }
    
    public Name getName()
    {
        return this.name;
    }
    
    /**
     * setPositionPlayed
     * 
     * @param  position
     */
    public void setPositionPlayed(char position)
    {
        if (position == 'f' || position == 'd' || position == 'g')
        {
            positionPlayed = position;
        }
        else
        {
            System.out.println("This is not a valid hockey position use f, d or g");
            positionPlayed = 'd';
        }
    }

    /**
     * getPositionPlayed 
     * @version 1
     * @return  positionPlayed
     */
    public char getPositionPlayed()
    {
        return this.positionPlayed;
    }
    
    /**
     * getDetailString
     * create a format string of all player information
     * @return "Player: "+" "+fn+" "+ln+" "+"Position Played: "+p+" "+"Date Born: "+db
     */
    public String getDetailString()
    {
        String fn = this.name.getFirstName();
        String ln = this.name.getLastName();
        String p = Character.toString(getPositionPlayed());
        String db = this.dateBorn.getFullDate();
        
        return "Player: "+" "+fn+" "+ln+" "+"Position Played: "+p+" "+"Date Born: "+db;
    }
}
