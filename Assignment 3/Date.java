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


/************************************** Part 2 ***********************************************/

class Date
{
  private int day;
  private int month; // Declaring variables
  private int year;

  
  
  public Date(int day,int month,int year) // Constructor to initialize values.
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  // Setter for Day
  
   public void setDay(int day)
  {
    this.day = day;
  }
   
  // Setter for Month
   
  public void setMonth(int month)
  {
    this.month = month;
  }
  
  // Setter for Year
  
  public void setYear(int year)
  {
    this.year = year;
  }
 
  // Getter for Day
  
  public int getDay()
  {
    return this.day;
  }
  
  // Getter for Month
  
  public int getMonth()
  {
    return this.month;
  }
  
  // Getter for Year
  
  public int getYear()
  {
    return this.year;
  }
  
  /* The below method takes a parameter of a type int which is usually
   * the value for the current month and returns the number of days 
   * present in that month. It even takes leap years into Account */
  
  public int getNumberOfDays(int test)
  {
    int number = 0; //Taking a int variable to return an int result
    
    if (test == 1) {number = 31;} // Each month returns a fixed amount of days for instance here January always has 31 days
    if (test == 2) 
    { 
      if((getYear() % 400 == 0) || ((getYear() % 4 == 0) && (getYear() % 100 != 0))) // If the following If Condition is true then the year is a leap year so it returns 29 else just 28
      number = 29; 
      else number = 28;
    }
    
    if (test == 3) {number = 31;}
    if (test == 4) {number = 30;}
    if (test == 5) {number = 31;}
    if (test == 6) {number = 30;}
    if (test == 7) {number = 31;}
    if (test == 8) {number = 31;}
    if (test == 9) {number = 30;}
    if (test == 10) {number = 31;}
    if (test == 11) {number = 30;}
    if (test == 12) {number = 31;}
    
    return number; // returns the result
  }
  
  /* The below method first takes the month of the Date object.
   * Takes number of days in that month then decreases the month number.
   * Does the same again till the month is January.
   * Adds all the days and then returns them */
   
  public int daysSinceJan1()
  {
    int test = getMonth() - 1; // Use a variable so we can keep decreasing month 
    int count=0;
    while (test !=0) 
    {
    count = count + getNumberOfDays(test); // Get the number of days in that month and then keep going till we reach january.
    test --;
    }
    
    
    count = count + getDay(); // To get the days of the current month as well.
    return count;
  }
  
  public void displayDate() // Displays the Date in dd/mm/yyyy format just to check output
  {
    System.out.println(" The Date entered is " +getDay()+ "/"+getMonth()+ "/" +getYear());
  }
}