
/**
 * class Biography - Creates a biography and associated elements.
 * 
 * @author Eric Brooke
 * @version 1
 */
public class Biography
{
    // instance variables
    private String title;
    private Name author;
    private String publisher;
    private Date datePublished;
    private Name subjectOfBook;

    /**
     * Constructors for objects of class Biography
     */
    
    public Biography(){}
    
    public Biography(String title, String authorFirstName, String authorLastName, String publisher, 
    int yearPub, int monthPub, int dayPub, String subjectFirstName, String subjectLastName)
    {
        // initialise instance variables
        
        author =new Name(authorFirstName, authorLastName);
        setTitle(title);
        setPublisher(publisher);
        datePublished = new Date(yearPub, monthPub, dayPub);
        subjectOfBook = new Name(subjectFirstName, subjectLastName);
        
    }

     /**
     * setTitle
     * @param  title                                                                 
     */
    
    public void setTitle(String ntitle)
    {
        title = ntitle;
    }

    
     /**
     * setAuthor
     * @param  author                                                                 
     */
    
    public void setAuthor(String authorFirstName, String authorLastName)
    {
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
    }
 
     /**
     * setPublisher
     * @param  publisher                                                                 
     */
    
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    /**
     * setDatePublished
     * @param yearPub, monthPub, dayPub                                                                 
     */
    
    public void setDatePublished(int yearPub, int monthPub, int dayPub)
    {
        datePublished.setYear(yearPub);
        datePublished.setMonth(monthPub);
        datePublished.setDay(dayPub);
    }
    
    /**
     * setsubjectOfBook
     * @param subjectFirstName, subjectLastName                                                  
     */
    
    public void setSubjectOfBook(String subjectFirstName, String subjectLastName)
    {
        subjectOfBook.setFirstName(subjectFirstName);
        subjectOfBook.setLastName(subjectLastName);
    }    
    
    /**
     * getTitle
     * @return     title
     */
    
    public String getTitle()
    {
        return this.title;
    }

    /**
     * getAuthor
     * @return     author
     */
    
    public String getAuthor()
    {
        return author.getFullName();
    }
    
    /**
     * getPublisher
     * @return     publisher
     */
    
    public String getPublisher()
    {
        return this.publisher;
    }
    
    /**
     * getDatePublished
     * @return     getSubjectOfBook
     */
    
    public String getDatePublished()
    {
        return datePublished.getFullDate();
    }
    
    /**
     * getSubjectOfBook
     * @return     subjectOfBook
     */
    
    public String getSubjectOfBook()
    {
        return subjectOfBook.getFullName();
    }  
    
    /**
     * getFullBook
     * prints to the screen the full details of one book.
     */
    public void getFullBook()
    {
        System.out.println("Title:  " + title);
        System.out.println("Author:  " + getAuthor());
        System.out.println("Publisher:  " + publisher);
        System.out.println("Date Published:  " + getDatePublished());
        System.out.println("Subject:  " + getSubjectOfBook());
        
    }
}
