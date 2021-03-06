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

class Invoice
{
 private String partNumber,
   partDescription;
 private int quantity;
 private double pricePerItem;
 
 
 public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem) // Constructor to intialize the variables
 {
   this.partNumber = partNumber;
   this.partDescription = partDescription;
   this.quantity = quantity;
   this.pricePerItem = pricePerItem;
 }
 
 /* Below Are the Set Methods for each variable */
 
 public void setPartNumber(String partNumber)
 {
   this.partNumber = partNumber;
 }
 
 
 public void setPartDescription(String partDescription)
 {
   this.partDescription = partDescription;
 }
 
 public void setQuantity(int quantity)
 {
   this.quantity = quantity;
 }
 
 
 public void setPricePerItem(double pricePerItem)
 {
   this.pricePerItem = pricePerItem;
 }
 
 /* Below are the Get Methods for each Variable */
 
 
 
 public String getPartNumber()
 {
   return this.partNumber;
 }
 
 public String getPartDescription()
 {
   return this.partDescription;
 }
 
 public int getQuantity()
 {
 
  return this.quantity;
 }
 
 public double getPricePerItem()
 {
   return this.pricePerItem;
 }
 
 public double getPricePerItem(double pricePerItem)
 {
   return this.pricePerItem;
 }
 
 
 
 double getInvoiceAmount() // Method that returns double value of quantity * pricePerItem
 {
   
   if (getQuantity() < 0) 
   {
     setQuantity(0);  // Sets quantity as 0 if the value is negative
   }
   
   if (getPricePerItem() < 0)
   {
     setPricePerItem(0.0); // Sets pricePerItem as 0 if the value is negative
   }
   
   return (getQuantity()*getPricePerItem()); // Returns the product of quantity and pricePerItem
 }
 
  
}