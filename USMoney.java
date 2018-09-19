/************************************************************
 *                                                          *
 *  CSCI 502          Assignment 3           Fall 2018      *                                             
 *                                                          *
 *  Programmer: Ashton Dsouza (Z1828205)                    *  
 *                                                          *
 *  Date Due:   09/21/2018  11.59pm                         *                          
 *                                                          *
 *  Purpose:    To Study Classes, Objects, and Methods      *                            *
 *                                                          *
 *                                                          * 
 ***********************************************************/


/************************************** Part 1 ***********************************************/

class USMoney
{
  private int dollars; // Initiating Variables dollars and cents.
  private int cents;

  
  /* Constructor to intialize the values correctly */
  
  public USMoney(int dollars,int cents) 
  {
    int count;
    
    // If cents are more than hundred add the appropriate amount to the dollars 
    
    if (cents > 99)
    {
      count = cents/100;
      this.dollars = dollars + count; // Count variable to deal with cents more than even 200 so $5 and 200 cents will give me $7
      this.cents = cents-(100*count); // Reducing the cents amount after they have been added to the dollars count.
    }
    
    else if(cents <0)
    {
      count = (-cents)/100;
      this.dollars = dollars - count; // Count variable to deal with cents more than even 200 so $5 and -200 cents will give me $3
      this.cents = cents+(100 * (count)); // Reducing the cents amount after they have been added to the dollars count.
    }
    
    
    else 
    {
      this.dollars = dollars; // Else just setting the regular values.
      this.cents = cents;
    }
      
  }
  
  // Set the Dollars
  public void setDollars(int dollars)
  {
    this.dollars= dollars;
  }
  
  // Set the Cents
  public void setCents(int cents)
  {
    this.cents = cents;
  }
  
  // Get Dollars
  public int getDollars()
  {
    return this.dollars;
  }
  
  // Get Cents
  public int getCents()
  {
    return this.cents;
  }
  
  /* The below method take an object of the type USMoney and returns an object of the type USMoney as well 
   * It adds 2 an object of the type USMoney to another similar object ( Technically adds thier private variables )*/
  
  public USMoney plus(USMoney amount)
  {
    
    
    int x = this.getDollars() + amount.getDollars(); // Adds the 2 objects dollars variables
    int y = this.getCents() + amount.getCents(); // Adds the 2 object cents variables
    return new USMoney(x,y); // Returns the USMoney object
    
  }
  
  /* This method basically exists to print the variables of the object of type USMoney and to check my output */  
  public void print()
  {
    System.out.print(" The Amount is " +getDollars()+ " Dollars and " +getCents()+ " Cents ");
  }
  
 
  
}
