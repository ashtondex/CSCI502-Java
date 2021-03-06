/************************************************************
 *                                                          *
 *  CSCI 502          Assignment 4           Fall 2018      *                                             
 *                                                          *
 *  Programmer: Ashton Dsouza (Z1828205)                    *  
 *                                                          *
 *  Date Due:   10/05/2018  11.59pm                         *                          
 *                                                          *
 *  Purpose:    To create a java console program            *
 *              to be able to book flights                  *
 *                                                          *
 *                                                          * 
 ***********************************************************/

/* Class to hold the data present in the text file */

public class Destination
{ 
  // Initialiazing the private instance variables.
  
  private String destinationCity; // The destination City
  private int normalMiles;        // The Miles required to reach the destination city when it is not frequent flyer season 
  private int frequentMiles;      // The Miles required to reach the destination city when it is not frequent flyer season 
  private int additionalMiles;    // The Miles required to upgrade from economy class to First Class
  private int startMonth;         // Start month of the frequent flyer season for that destination city
  private int endMonth;           // End month of the frequent flyer season for that destination city
  
  
  /* Contructor to initialize the variables */
  
  public Destination(String destinationCity, int normalMiles, int frequentMiles, int additionalMiles, int startMonth, int endMonth)
  {
    this.destinationCity = destinationCity; 
    this.normalMiles = normalMiles;
    this.frequentMiles = frequentMiles;
    this.additionalMiles = additionalMiles;
    this.startMonth = startMonth; 
    this.endMonth = endMonth;
  }
  
  /* A method to just check if the strings are being split properly . Just for testing purposes no use in main program */
  
  public void printdest()
    
  {
    System.out.println(this.destinationCity + " " + this.normalMiles + " " + this.frequentMiles + " " + this.additionalMiles + " " + this.startMonth + " " + this.endMonth);
  }
  
  /*************** Getters *********************/
  
    public String getDestinationCity() 
  {
    return this.destinationCity;  // Returns the destination City
  }
  
    public int getNormalMiles()
  {
    return this.normalMiles; // Returns the normal Miles
  }
   
    public int getFrequentMiles()
  {
    return this.frequentMiles; // Returns the frequent Miles
  }
    
    public int getAdditionalMiles()
  {
    return this.additionalMiles; // Returns the additional Miles
  }
    
     public int getStartMonth()
  {
    return this.startMonth; // Returns the start month
  }
     
    public int getEndMonth()
  {
    return this.endMonth; // Returns the end month
  }
    
  
    /*************** Setters ******************/
    
    
     public void setDestinationCity(String destinationCity)
    {
      this.destinationCity= destinationCity; // Sets the Destination City to the parameter passed into it.
    }
    
     public void setNormalMiles(int normalMiles)
    {
      this.normalMiles= normalMiles;  // Sets the normal miles to the parameter passed into it.
    }
     
     public void setFrequentMiles(int frequentMiles)
    {
      this.frequentMiles= frequentMiles;  // Sets the frequent miles to the parameter passed into it.
    }
     
     public void setAdditionalMiles(int additionalMiles)
    {
      this.additionalMiles = additionalMiles;  // Sets the additional miles to the parameter passed into it.
    }
     
     public void setStartMonth(int startMonth)
    {
      this.startMonth = startMonth; // Sets the start month to the parameter passed into it.
    }
     
     public void setEndMonth(int endMonth)
    {
      this.endMonth = endMonth; // Sets the end month to the parameter passed into it.
    }
     
}