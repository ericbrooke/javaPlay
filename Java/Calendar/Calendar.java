class Calendar
{
   private Date[] dates;

   public Calendar()
   {
       dates = new Date[15];

       dates[0]  = new Date(1914, 1, 15);
       dates[1]  = new Date(2012, 3, 10);
       dates[2]  = new Date(2001, 9, 11);
       dates[3]  = new Date(1974, 9, 30);
       dates[4]  = new Date(2017, 4, 1);
       dates[5]  = new Date(1840, 9, 1);
       dates[6]  = new Date(1988, 5, 20);
       dates[7]  = new Date(1900, 6, 26);
       dates[8]  = new Date(1970, 11, 15);
       dates[9] = new Date(1992, 2, 29);
       dates[10] = new Date(1980, 9, 19);
       dates[11] = new Date(1940, 2, 28);
       dates[12] = new Date(1887, 7, 31);
       dates[13] = new Date(1999, 12, 31);
       dates[14] = new Date(1966, 5, 2);        
   }

   public void listAllDates()
   {
       if (dates != null)
       {
           for (int i = 0; i < dates.length; i++)
           {
               if (dates[i] != null)
               {
                   System.out.println(dates[i].getMonthStringFromInt() + " " + dates[i].getDay() + ", " + dates[i].getYear() + ": " + dates[i].getDayOfTheWeek());
               }
           }
       }
   }

   public void displayDatesThatFallOn(String dayOfTheWeek)
   {
       if (dates != null)
       {
           for (int i = 0; i < dates.length; i++)
           {
               if (dates[i] != null)
               {
                   if (dates[i].getDayOfTheWeek() != null)
                   {
                     if (dates[i].getDayOfTheWeek().equalsIgnoreCase(dayOfTheWeek))
                     {
                         System.out.println(dates[i].getMonthStringFromInt() + " " + dates[i].getDay() + ", " + dates[i].getYear() + ": " + dates[i].getDayOfTheWeek());
                     }
                 }
               }
           }
       }
   }
}
