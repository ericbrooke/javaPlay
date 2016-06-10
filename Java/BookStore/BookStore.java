import java.util.ArrayList;
import java.util.Iterator;

/**
 * Bookstore class
 * 
 * @author Eric Brooke
 * @version v1.0
 */
public class BookStore
{
    private ArrayList<Book> books;
    
    /**
     * BookStore Constructor.  Initializes the books ArrayList and Adds 10 books to the bookstore
     *
     */
    public BookStore()
    {
        books = new ArrayList<Book>(); // initialize the collection of books
        
        // add 10 books 
        // Book constructor Book(String title, Author author, Date datePublished)
        // Author constructor Author(Name name, Date dateOfBirth, Date dateOfDeath)
        // Date constructor Date(int year, int month, int day)
        books.add(new Book( "The Nose",
                  new Author(new Name("Nikolai", "Gogol"), new Date(1809, 3, 31), new Date(1852, 3, 4)),
                  new Date(1836) ));
        books.add(new Book("The Stranger",
                  new Author(new Name("Albert", "Camus"), new Date(1913, 11, 7), new Date(1960, 1, 4))  ,
                  new Date(1942) ));
        books.add(new Book("The Plague",
                  new Author(new Name("Albert", "Camus"), new Date(1913, 11, 7), new Date(1960, 1, 4))  ,
                  new Date(1947) ));
        books.add(new Book("The Metamorphosis",
                  new Author(new Name("Franz", "Kafka"), new Date(1883, 7, 3), new Date(1924, 6, 3))  ,
                  new Date(1915) ));
        books.add(new Book("Nausea",
                  new Author(new Name("Jean-Paul", "Sartre"), new Date(1905, 6, 21), new Date(1980, 4, 15))  ,
                  new Date(1938) ));
        books.add(new Book("The Trial",
                  new Author(new Name("Franz", "Kafka"), new Date(1883, 7, 3), new Date(1924, 6, 3))  ,
                  new Date(1925) ));
        books.add(new Book("One Day in the Life of Ivan Denisovich",
                  new Author(new Name("Aleksandr", "Solzhenitsyn"), new Date(1918, 12, 11), new Date(2008, 8, 3))  ,
                  new Date(1962) ));
        books.add(new Book("Breakfast of Champions",
                  new Author(new Name("Kurt", "Vonnegut"), new Date(1922, 11, 11), new Date(2007, 4, 11))  ,
                  new Date(1973) ));
        books.add(new Book("The Brothers Karamazov",
                  new Author(new Name("Fyodor", "Dostoyevsky"), new Date(1821, 11, 11), new Date(1881, 2, 9))  ,
                  new Date(1880) ));
        books.add(new Book("No Exit",
                  new Author(new Name("Jean-Paul", "Sartre"), new Date(1905, 6, 21), new Date(1980, 4, 15))  ,
                  new Date(1944) ));
        
        
    }
    
    /**
     * Method displayTitlesOfBooksByAuthorsBornOnThisDay
     *
     * @param dayOfTheWeek the name of the day of the week
     */
    public void displayTitlesOfBooksByAuthorsBornOnThisDay(String dayOfTheWeek)
    {
        Iterator<Book> myIterator   = books.iterator(); // Instantiate the Iterator on the books list
        Book                    b   = null;             // declare a Book variable to hold the iterators next object    
        
        while (myIterator.hasNext())
        {
            b = myIterator.next();
            if (b.getAuthor().getDateOfBirth().getDayOfTheWeek().equals(dayOfTheWeek))
            {
                System.out.println("Title: " + b.getTitle());
            }
        }
    }
    
    /**
     * Method displayTitlesByAuthor
     *
     * @param lastName A last name to search for
     */
    public void displayTitlesByAuthor(String lastName)
    {
        Iterator<Book> myIterator   = books.iterator(); // instantiate the iterator and assign it to the variable myIterator
        Book                    b   = null;             // declare a local variable to hold the iterators next object
        
        while (myIterator.hasNext())
        {
            b = myIterator.next(); // add the next object to the variable b
            if (b.getAuthor().getName().getLastName().equals(lastName))
            {
                System.out.println("Title: " +  b.getTitle() + "  Author: " + b.getAuthor().getName().getLastName());
            }
        }
        
    }
    
    /**
     * Method displayTitlesWrittenBefore
     *
     * @param year before which the books were published
     */
    public void displayTitlesWrittenBefore(int year)
    {
        Iterator<Book> myIterator   = books.iterator();
        Book                    b   = null;
                
        while (myIterator.hasNext())
        {
            b = myIterator.next();
            if (b.getDatePublished().getYear() < year)
            {
                System.out.println(b.getTitle() + " " + b.getDatePublished().getYear());
            }
        }
    }
    
    /**
     * Method isTitleInBookstore
     *
     * @param title A parameter
     * @return The true if the String title matches the title in the list
     */
    public boolean isTitleInBookstore(String title)
    {
        Iterator<Book> myIterator = books.iterator(); // instatiate the Iterator
        Book                    b = null; // create a variable to hold the ojbect returned from next()
        
        while (myIterator.hasNext())
        {
            b = myIterator.next(); // pass the next object to the b variable for processing
            if (b.getTitle().equals(title))
            {
                return true;
            }
        }
        return false;
    }
}
