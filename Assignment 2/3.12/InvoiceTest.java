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


/************************************** Question 3.12 ***********************************************/

class InvoiceTes
{
  public static void main(String[] args)
  {
    Invoice invoice1 = new Invoice("123","Bolt",-5,5); // Creating an Object of the class Invoice
    Invoice invoice2 = new Invoice("123","Bolt",5,5);
    System.out.println("THe Invoice amount is "+invoice1.getInvoiceAmount());  // Invoking the Class Invoice method called getInvoiceAmount()
    System.out.println("THe Invoice amount is "+invoice2.getInvoiceAmount());
  }
}