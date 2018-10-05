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


import java.util.Scanner;      // To take input
import java.io.File;           // To handle files
import java.io.IOException;    // To Throw IOException


/* Main class to run the console program based on methods in MileRedeemer and Destination */
public class MileRedemptionApp
{
  public static void main(String[] args) throws IOException // Catch input/output exceptions
  {
    String fileName; // Store the filename from user
    int miles,month; // Store thier total miles and the month they travel in
    char flow = 'y'; // Character to check if they wanna continue searching
    
    
    Scanner keyScan = new Scanner(System.in); //Taking user input from system
    System.out.print("Please enter the name of the destinations file: ");
    fileName = keyScan.nextLine(); // Taking the filename
    Scanner fileScan = new Scanner(new File(fileName)); // Scanner to scan file and not the user input from keyboard
    
    System.out.println("----------------------------------------------------------------");
    System.out.println("WELCOME TO THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
    System.out.println("----------------------------------------------------------------");
    
    MileRedeemer mileRedeemer = new MileRedeemer(); // Creating an object of the type mileRedeemer.
    
    mileRedeemer.readDestination(fileScan); // Reading the inputfile
    
    String[] cityList = mileRedeemer.getCityNames(); // Getting the list of cities
    
    System.out.println("List of destination cities your client can travel to: ");
    
    for (int i = 0; i< cityList.length; i++)
    {
      System.out.println(cityList[i]); // Printing every city the client can travel to and fro.
    }
 
    
    while ( flow == 'y' ) // Repeat these steps while the user input 'y' to continue the program
    {
        
    System.out.println("----------------------------------------------------------------");
    
    System.out.println("Please enter your client's accumulated Frequent Flyer Miles:  ");
    
    miles = keyScan.nextInt(); // Taking total miles
    
    System.out.println("Please enter your client's month of departure (1-12):  ");
    
    month = keyScan.nextInt(); // Taking the travel month
    
    if(month <1 || month > 12) // Discarding any illegal value for month
    {
      throw new IllegalArgumentException( "The month you have Entered is not a valid Month ");
    }
    
   
    String[] affordableCityListStyle = mileRedeemer.redeemMiles(miles,month); // Getting the list of cities and thier flight style plans
    
    int count = 0; // Counter to check if the array returned is consisting of all null values ie Clients cant travel to them.
    
    /* Looping through the array to check if elements are null
     * add the number of null elements later to check if the array is an empty array */
    
    for (int i = 0; i< affordableCityListStyle.length; i++)
    {
    if (affordableCityListStyle[i] == null)
    {
       count++;
    }
    }
    
    
    if ( count != affordableCityListStyle.length ) // If this condition is true that means atleast one element of the array is not null. Thus array is not empty.
    {
      System.out.println("Your client's Frequent Flyer Miles can be used to redeem the following tickets: ");
      System.out.println(" ");}
    
    // Loop through the array and print the output as long as they are not null
    
    for (int i = 0; i< affordableCityListStyle.length; i++)
    {    
      if (affordableCityListStyle[i]!=null)
      System.out.println(" * A Trip to " +affordableCityListStyle[i]);
       
    }
    
    
    // If this condition is true it means that every single array element is null. Thus its an empty array. Which means the client can travel to none of the cities.
    if (count == affordableCityListStyle.length)
    { 
      System.out.println(" ");
      System.out.println("*** Your client has not accumulated enough Frequent Flyer Miles ***");
      System.out.println(" ");
    }
    
    System.out.println(" ");
    System.out.println("Your client's remaining Frequent Flyer Miles: "+mileRedeemer.getRemainingMiles()); // Get the remaining miles 
    System.out.println(" ");
    System.out.println("----------------------------------------------------------------");
    System.out.println(" ");
    System.out.println(" Do you want to continue (y/n)? ");
    System.out.println(" ");
    System.out.println("----------------------------------------------------------------");
    flow = keyScan.next().charAt(0); // Check if user entered a 'y'
    
    }
    
    System.out.println("-------------------------------------------------------------------------");
    System.out.println("THANK YOU FOR USING THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
    System.out.println("-------------------------------------------------------------------------");
    
    // Close the scanners
    
    keyScan.close(); 
    
    fileScan.close();
    
  }
}