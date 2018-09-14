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

class EmployeeTest
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee("Ashton","Dsouza",500.0); // Creating 2 new employees
    Employee e2 = new Employee("Dexter","Morgan",-500.0);
    System.out.println("The Yearly Salary for " +e1.getFirstName()+ " " +e1.getLastName()+ " before thier raise is " +e1.getYearlySalary()); //Calling Methods of class Employee and its members
    System.out.println("The Yearly Salary for " +e2.getFirstName()+ " " +e2.getLastName()+ " before thier raise is " +e2.getYearlySalary());
    
    e1.raiseSalary(10.0); // Raising thier Salaries by 10%
    e2.raiseSalary(10.0);
    
    System.out.println("The Yearly Salary for " +e1.getFirstName()+ " " +e1.getLastName()+ " After thier raise is " +e1.getYearlySalary()); //Calling Methods of class Employee and its members
    System.out.println("The Yearly Salary for " +e2.getFirstName()+ " " +e2.getLastName()+ " After thier raise is " +e2.getYearlySalary());
    
  }
}