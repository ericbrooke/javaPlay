
/**
 * class Author here.
 * 
 * @author Eric Brooke
 * @version 1
 */
public class Author
{
    private Name name;
    private Date dateOfBirth;
    private Date dateOfDeath;
    
    /**
     * Author Constructor
     *
     * @param name 
     * @param dateOfBirth 
     * @param dateOfDeath
     */
    public Author(Name name, Date dateOfBirth, Date dateOfDeath)
    {
        if (name != null)
        {
            this.name = name;
        }
        
        if (dateOfBirth != null)
        {
            this.dateOfBirth = dateOfBirth;
        }
        
        if (dateOfDeath != null)
        {
            this.dateOfDeath = dateOfDeath;
        }
    }
    
    // Accessors for Authors
    /**
     * Method getName
     *
     * @return The name object
     */
    public Name getName()
    {
        return name;
    }
    
    /**
     * Method getDateOfBirth
     *
     * @return The date of birth object
     */
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    /**
     * Method getDateOfDeath
     *
     * @return The date of death object
     */
    public Date getDateOfDeath()
    {
        return dateOfDeath;
    }
}
