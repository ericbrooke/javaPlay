
/**
 * Write a description of class Book here.
 * 
 * @author Eric Brooke
 * @version 1
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    private int ISBN;
    private String authorLastName;
    private String authorFirstName;
    private int yearPublished;
    private int month;
    

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
    }
    
    public Book(String newTitle, int newISBN, String newAuthorLastName, String newAuthorFirstName, int newYearPublished)
    {
        setTitle(newTitle);
        setISBN(newISBN);
        setAuthorLastName(newAuthorLastName);
        setAuthorFirstName(newAuthorFirstName);
        setYearPublished(newYearPublished);
    }

        /**
     * 
     * @return     title
     */
    public  String getTitle()
    {
        return title;
    }

    /**
     * 
     * @return     ISBN
     */
    public  int getISBN()
    {
        return ISBN;
    }

        /**
     * 
     * @return     authorLastName
     */
    public  String getAuthorLastName()
    {
        return authorLastName;
    }
    
        /**
     * 
     * @return     authorFirstName
     */
    public  String getAuthorFirstName()
    {
        return authorFirstName;
    }
    
        /**
     * 
     * @return     yearPublished
     */
    public  int getYearPublished()
    {
        return yearPublished;
    }
    

    /**
     * 
     * @return     title
     */
    public final void setTitle(String newTitle)
    {
        if (newTitle.length() <3)
        {
            title = newTitle;    
        }
    }
    
    /**
     * 
     * @return     ISBN
     */
    public final void setISBN(int newISBN)
    {
       if ((ISBN >= 1000) && (ISBN <= 2000) )
       {
          ISBN = newISBN;
       }
    }
    
        /**
     * 
     * @return     authorLastName
     */
    public final void setAuthorLastName(String newAuthorLastName)
    {
        if (newAuthorLastName != "")
        {
            authorLastName = newAuthorLastName;
        }
    }
    
        /**
     * 
     * @param     authorFirstName
     */
    public final void setAuthorFirstName(String newAuthorFirstName)
    {
        if (newAuthorFirstName != "")
        {
            newAuthorFirstName = newAuthorFirstName;
        }
    }
        /**
     * 
     * @param     newYearPublished
     */
    public final void setYearPublished(int newYearPublished)
    {
        if((newYearPublished >= 1900) && (newYearPublished <= 2012))
        {
            yearPublished = newYearPublished;
        }
    }
    /**
       * 
         */
     public String getMonthName(int month)
     {
         if ((month <1) || (month>12))
         {
             System.out.println("Error with month");
             return "";
         }
         
         if (month == 1){
             return "January";
         }

         if (month == 2){
             return "Feb";
         }
         
         return "";
     }

}
