
/**
 * Name - creates a basic name class with some basic checking. 
 * Elements are reduced to lowercase and then first letter is caplistised.
 * 
 * @author Eric Brooke
 * @version 1
 */
public class Name
{
    private String first;
    private String last;

    public Name(){}
    
    public Name(String firstName,String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    /**
     * 
     * @return     first
     */
    public String getFirstName()
    {

        return first;
    }
    
    
    /**
     * 
     * @return     last
     */
    public String getLastName()
    {

        return last;
    }
    
    /**
     * getFullName
     * @return     last
     */
    public String getFullName()
    {

        String f = this.getFirstName();
        String l = this.getLastName();
        
        return f + " " + l;
    }
    
    /**
     * 
     * @param     first
     */
    public void setFirstName(String firstName)
    {
        if ((firstName != null ) && (firstName.length() > 0)){
            firstName = firstName.toLowerCase();
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            first = firstName;
        }
        else{
            System.out.println("Nann its not going to happen");
        }
    }
    
    
    /**
     * 
     * @param     last
     */
    public void setLastName(String lastName)
    {
        if ((lastName != null ) && (lastName.length() > 0)){
            lastName = lastName.toLowerCase();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            last = lastName;
        }
        else {
            System.out.println("lastnames do not work like that");
        }
    }
}
