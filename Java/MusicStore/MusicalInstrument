
/**
 * 
*McLong & Quade Music is a small store that sells a variety of musical instruments. 
* program to help the store staff keep track of inventory.  
* @author ericbrooke
* @version 1
 */
public class MusicalInstrument
{
    // instance variables - replace the example below with your own
    private String description;
    private String stockCode;
    private int quantityInStock;
    private int quantitySold;
    private double purchasePrice;
    private double sellingPrice;
    private int numberRented;


    /**
     * Constructor for objects of class MusicalInstrument
     * description: default constuctor with intialisation for the whole instance
     * @author ericbrooke
     * @version 1
     */
    public MusicalInstrument()
    {
        description ="";
        stockCode ="";
        quantityInStock = 0;
        quantitySold = 0;
        purchasePrice = 0;
        sellingPrice = 0;
        numberRented = 0;
    }
    
    /**
     * Constructor for objects of class MusicalInstrument
     * description: constuctor with some basic data validation
     * @author ericbrooke
     * @version 1
     */
    public MusicalInstrument(String newStockCode, String newDescription, double newPurchasePrice, double newSellingPrice)
    {
        // initialise instance variables
        if (newDescription == null) 
        {
            description ="";
        } else 
        {
            description = newDescription;
        }
        
        stockCode=newStockCode;
        
        if (newPurchasePrice < 0.0)
        {
            purchasePrice= 0.0;
        }
        else
        {
            purchasePrice = newPurchasePrice;
        }
        
        if (newSellingPrice < 0.0)
        {
            sellingPrice = 0.0;
        }
        else
        {
        sellingPrice= newSellingPrice;
        }
        
    }
    
// Getters
    /**
     * Gets the description
     * @return description
     * @author ericbrooke
     * @version 1
     */
    
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Gets the stockcode
     * @return stockCode
     * @author ericbrooke
     * @version 1
     */
    public String getStockCode()
    {
        return stockCode;
    }
    
    /**
     * Gets the quantity In Stock
     * @return quantityInStock
     * @author ericbrooke
     * @version 1
     */
    public int getQuantityInStock()
    {
        return quantityInStock;
    }
    
    /**
     * @return quantitySold
     * @author ericbrooke
     * @version 1
     */
    public int getQuantitySold()
    {
        return quantitySold;
    }
 
    /**
     * Gets the purchase price
     * @return purchasePrice
     * @author ericbrooke
     * @version 1
     */
    public double getPurchasePrice()
    {
        return purchasePrice;
    }

    /**
     * Gets the selling price
     * @return sellingPrice
     * @author ericbrooke
     * @version 1
     */
    public double getSellingPrice()
    {
        return sellingPrice;
    }

    /**
     * Gets the number rented
     * @return numberRented
     * @author ericbrooke
     * @version 1
     */
    public int GetNumberRented()
    {
        return numberRented;
    }

    /**
     * Allows you to add stock but only if greater then aero
     * @param addInventory
     * @author ericbrooke
     * @version 1
     */
    public void restock(int addInventory)
    {
        if (addInventory < 0)
        {
            System.out.println("that was not the right kind of number, you need a postive number");
            return;
        }
        else
        {
            quantityInStock= quantityInStock+ addInventory;
        }
    }

    /**
     * Allows you to sell instruments but only if one then 1 and less then 1000
     * @param sold
     * @author ericbrooke
     * @version 1
     */
    public void sell(int sold)
    {
        if (sold <1)
        {
            System.out.println("did you actually sell anything?");
        }
        else if (sold > 1000)
        {
            System.out.println("wow you are now rich and telling stories");
        }
        else 
        {
            System.out.println("you sold "+sold);
            quantityInStock= quantityInStock - sold;
            quantitySold = quantitySold + sold;
        }
            
    }

    /**
     * lets you change the purchase price but not if it is a negative price.
     * @param newPrice
     * @author ericbrooke
     * @version 1
     */
    public void setPurchasePriceCanadianDollars(double newPrice)
    {
        if (newPrice < 0) 
        {
            System.out.println("That is a bit cheap");
        }
        else
        {
            purchasePrice = newPrice;
        }
    }
   
     /**
     * Lets you change the selling price but only if not a negative price.
     * @param newPrice
     * @author ericbrooke
     * @version 1
     */
    public void setSellingPriceCanadianDollars(double newPrice)
    {
        if (newPrice < 0)
        {
            System.out.println("yeah thats not going to happen");
        }
        else
        {
            sellingPrice = newPrice;
        }
    }
    
    /**
     * Lets you rent instruments but only if the number represntrs 50% of your total stock
     * @param newRented
     * @author ericbrooke
     * @version 1
     */
    public void setNumberRented(int newRented)
    {
        if ((quantityInStock/2) <newRented) 
        {
            System.out.println("you need to leave some to sell!");
        }
        else
        {
         numberRented = numberRented+newRented;
        }
    }
    
     /**
     * Allows you calculate the profit for one instrument
     * @return profit
     * @author ericbrooke
     * @version 1
     */
    public double calcProfitCandianDollars()
    {
        double profit = sellingPrice - purchasePrice;
        return profit;
    }

     /**
     * Allows you to determine the total gross profit 
     * @return profitForAll
     * @author ericbrooke
     * @version 1
     */
    public double calcTotalProfitCandianDollars()
    {
        double profitForOne = calcProfitCandianDollars();
        double profitForAll = quantitySold * profitForOne;
        return profitForAll;
        
    }
    
     /**
     * Allows you get the total value of the stock based on purchasing price alone.
     * @return stockValue
     * @author ericbrooke
     * @version 1
     */
    public double calcInventoryValue()
    {
        double stockValue = quantityInStock * purchasePrice;
        return stockValue;
    }

     /**
     * Print summary
     * @author ericbrooke
     * @version 1
     */
    public void printDetails()
    {
       System.out.println ("Description: " +  description);
       System.out.println ("Stock Code: " +  stockCode);
       System.out.println ("Purchase Price in Canadian Dollars: " +  purchasePrice);
       System.out.println ("Selling Price: " +  sellingPrice);
       System.out.println ("Quantity In Stock: " +  quantityInStock);
       System.out.println ("Quantity Sold: " +  quantitySold);
       System.out.println ("Inventory Value: " +  calcInventoryValue());
       System.out.println ("Profit on Sales: " +  calcTotalProfitCandianDollars());
       System.out.println ("Number of instruments rented: " +  numberRented);
       
    }
}

