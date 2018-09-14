/************************************************************
 *                                                          *
 *  CSCI 502          Assignment 2           Fall 2018      *                                             
 *                                                          *
 *  Programmer: Ashton Dsouza (Z1828205)                    *  
 *                                                          *
 *  Date Due:   09/14/2018  11.59pm                         *                          
 *                                                          *
 *  Purpose:    To Study Classes, Objects, Methods and      *
 *              Strings                                     *
 *                                                          *
 *                                                          * 
 ***********************************************************/


/************************************** Question 3.14 ***********************************************/

class Date
{
  private int month; // Declaring variables
  private int day;
  private int year;
  
  public Date(int month,int day,int year) // Constructor to initialize values.
  {
    this.month = month;
    this.day = day;
    this.year = year;
  }
  
  /* Below are the set methods for the variables */
  
  public void setMonth(int month)
  {
    this.month = month;
  }
  
  public void setDay(int day)
  {
    this.day = day;
  }
  
  public void setYear(int year)
  {
    this.year = year;
  }
 
  /* Below are the get methods for the variables */
  
  public int getMonth()
  {
    return this.month;
  }
  
  public int getDay()
  {
    return this.day;
  }
  
  public int getYear()
  {
    return this.year;
  }
  
  public void displayDate() // Displays the Date in mm/dd/yyyy Format
  {
    System.out.println(" The Date entered is " +getMonth()+ "/"+getDay()+ "/" +getYear());
  }
}