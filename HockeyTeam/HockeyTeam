
/**
 * class HockeyTeam
 * 
 * @author Eric Brooke
 * @version 1
 * 
 */
 
import java.util.ArrayList;
import java.util.Iterator;

public class HockeyTeam
{
    // instance variables
    private Name name;
    private ArrayList<HockeyPlayer> players;
    private ArrayList<HockeyPlayer> samePosition;

    /**
     * Constructor for objects of class HockeyTeam
     */
    public HockeyTeam()//test setup
    {
        players = new ArrayList<HockeyPlayer>();
        
        name = new Name ("Cannucks","Vancouver");
        players.add(new HockeyPlayer(new Name("Ted","Farmer"),'f',new Date(1967,3,1),600000));
        players.add(new HockeyPlayer(new Name("Robert","Luongo"),'g',new Date(1967,3,1),900000));
        players.add(new HockeyPlayer(new Name("Cory","Schneider"),'d',new Date(1967,3,1),600000));
        players.add(new HockeyPlayer(new Name("Curt","Ridely"),'f',new Date(1967,3,1),700000));
        players.add(new HockeyPlayer(new Name("Kirk","McLean"),'f',new Date(1967,3,1),500000));
    }
    
    public HockeyTeam(Name name)
    {
         players = new ArrayList<HockeyPlayer>();
         this.name = name;
    }
   
     /**
     * addPlayer - test for null object
     * @version 1
     * @param  newPlayer
     */
    public void addPlayer(HockeyPlayer newPlayer)
    {
        if(newPlayer == null)
        {
          System.out.println("Player not added");
        }
        else
        {
          players.add(newPlayer);
        }
    }
   
     /**
     * listPlayerNames - see list without using other classes
     * @version 1
     * 
     */
    public void listPlayerNames()//test
    {
        for (HockeyPlayer player : players)
        {
            if (player.getName().getLastName() != null)
            {
                System.out.println(player.getName().getLastName());
            }
            else
            {
                System.out.println("A player has no last name");
            }
        }
    }
    
     /**
     * getAllAtPosition
     * @version 1
     * @param  position
     * @return samePosition or null
     */
    public ArrayList<HockeyPlayer> getAllAtPosition(char position)
    {
        if (position == 'f' || position == 'd' || position == 'g')
        {
          samePosition = new ArrayList<HockeyPlayer>();
        
          Iterator<HockeyPlayer> it = players.iterator();
        
          while(it.hasNext())
          {
              HockeyPlayer hp = it.next();
            
              if(hp.getPositionPlayed() == position )
              {
                samePosition.add(hp);
              }
          }
        
          return samePosition;
      }
      else
      {
          return null;
      }
    }
    
     /**
     * printRosterDetails 
     * @version 1
     * 
     */
    public void printRosterDetails()
    {
        Iterator<HockeyPlayer> it = players.iterator();
        
        while(it.hasNext())
        {
           HockeyPlayer hp = it.next();
            
           System.out.println(hp.getDetailString());
        }
    }
    
    /**
     * removePlayersByName 
     * @version 1
     * @param  firstName, lastName
     */

    public void removePlayersByName(String firstName, String lastName)
    {
        Iterator<HockeyPlayer> it = players.iterator();
        
        while(it.hasNext())
        {
           HockeyPlayer hp = it.next();
            
           if(hp.getName().getFirstName().equalsIgnoreCase(firstName))
           {
               if(hp.getName().getLastName().equalsIgnoreCase(lastName))
               {
                   System.out.println(hp.getName().getLastName()+ " removed");
                   players.remove(hp);
               }
               else
               {
                System.out.println("No lastName match");
               }
               
           }
           else 
           {
            System.out.println("No firstName match");
           }
           
        }
    }
}
