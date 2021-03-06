
/**
 * Name class 
 * 
 * @author Eric Brooke
 * @version 1.0
 */
public class Name
{
    private String firstName;
    private String lastName;
    
    /**
     * Default constructor
     */
    public Name()
    {
    }
    
    /**
     * Secondary constructor for passing the first and last name
     * 
     * @param String firstName
     * @param String lastName
     */
    public Name(String firstName, String lastName)
    {
        if ((firstName != null) && (firstName.length() > 0))
        {
            this.firstName = firstName;
        }
        else
        {
            this.firstName = "Unset";
        }
        
        if ((lastName != null) && (lastName.length() > 0))
        {
            this.lastName = lastName;
        }
        else
        {
            this.lastName = "Unset";
        }
        
    }
    
    /**
     * Mutator for firstName
     * 
     * @param String firstName
     */
    public void setFirstName(String firstName)
    {
        if ((firstName != null) && (firstName.length() > 0))
        {
            this.firstName = firstName;
        }
    }
    
    /**
     * Accessor for firstName
     * 
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Mutator for lastName
     * 
     * @param String lastName
     */
    public void setLastName(String lastName)
    {
        if ((lastName != null) && (lastName.length() > 0))
        {
            this.lastName = lastName;
        }
    }
    
    /**
     * Accessor for lastName
     * 
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }
}
