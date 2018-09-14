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


/************************************** Question 3.13 ***********************************************/


class Employee
{
  private String firstName;
  private String lastName;
  private Double salary;
  
  
  public Employee(String firstName, String lastName, Double salary) // Constructor to initialize variables
  {
    this.firstName = firstName;
    this.lastName = lastName;
    if (salary > 0)
    {this.salary = salary;}
    else this.salary = 0.0;
  }
  
  /* Below are the set methods for the variable */
  
  public void setFirstName(String firstName)
 {
   this.firstName = firstName;
 }
  
  
  public void setLastName(String lastName)
 {
   this.lastName = lastName;
 }
  
  
  public void setSalary(Double salary)
 {
     this.salary = salary;
  
 }
  
  /* Below are the get methods for the variables */
  
  public String getFirstName()
 {
   return this.firstName;
 }
  
  public String getLastName()
 {
   return this.lastName;
 }
  
  public Double getSalary()
 {
   return this.salary;
 }
  
   public void raiseSalary(double raise) // Method to raise their Salaries.
 {
   double newSalary = ((raise/100) * getSalary()); // Variable to store the raised salary
   
   setSalary(getSalary()+newSalary); // Set the new Salary.
 }
   
 public double getYearlySalary() // Method to get Yearly Salary 
  {
    return (12*getSalary());
   
  }
 

  
}