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

import java.util.Scanner; // To use Scanner Class to take user input.


class DateDemo
{

  public static void main(String[] args)
  {
    int day,month,year; // The variables to hold the User Inputs
    
    Scanner sc = new Scanner(System.in);// Creating instance of class Scanner to take user input
    
    System.out.println(" Enter the day "); // Taking user Input
    day = sc.nextInt();
    System.out.println(" Enter the month ");
    month = sc.nextInt();
    System.out.println(" Enter the year ");
    year = sc.nextInt();
    
    Date date1 = new Date(day,month,year); // Create an instance of the class Date with user input
    
    date1.displayDate(); // Calling the print Method from class Date
    
    
    System.out.println("The number of Days since January 1 are : "+date1.daysSinceJan1()); // Invoking the daysSinceJan1() method of the class Date
    
    sc.close(); // Closing Scanner
  }

}