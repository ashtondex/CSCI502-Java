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



import java.util.Scanner; // Imported so I can get user input

class USMoneyDemo
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in); // creating an instance of the Scanner class
    
    System.out.println(" Enter the Dollars and Cents for the first amount ");
    int dollar1 = sc.nextInt();
    int cent1 = sc.nextInt(); // Taking input for first amount from user
    
    USMoney amount1 = new USMoney(dollar1,cent1); // Creating a new object of the type USMoney with the values entered by the user
    
    amount1.print(); // Checking to see the amount
    
    System.out.println(" Enter the Dollars and Cents for the second amount ");
    int dollar2 = sc.nextInt();
    int cent2 = sc.nextInt(); // Taking input for second amount from user
    
    USMoney amount2 = new USMoney(dollar2,cent2); // Creating a new object of the type USMoney with the values entered by the user
    
    amount2.print(); // Checking to see the amount
    
    
    USMoney amount3 = amount1.plus(amount2); // Using the method plus to add the 2 USMoney objects initialized before and storing it in an another object of the type USMoney.
    
    amount3.print(); // Checking to see the amount
    
    sc.close(); // Closing the scanner
  }
}