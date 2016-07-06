/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Assignment:    12
 * Program:       2
 * ProgramName:   Account
 * Purpose:       To be used as a test program to create accounts and have methods for getting and setting
 *                different attributes of the account.
 * Operation:     Program has constructor method and getting and setting methods for accessing and modifiying 
 *                the objects.  
 * Input(s):      None.
 * Output(s):     Output method that returns a string contaning all the info about the object.
 * Methodology:   The program constructs objects, and has getting setting and toString methods that 
 *                can be implemented by the test program..
 *                
 */

public class Account
{
   public double[] Salaries;
   
   /******************************************************************************
   *                        Declare/Initialize Variables                         *
   ******************************************************************************/

   Account()   // No arg constructor.
   {
      dateCreated = new Date();
   }

   Account(int newId, double newBalance)  // Arg constructor for ID and balance.
   {
      id = newId;
      balance = newBalance;
      dateCreated = new Date();
   }

   public void setId(int newId)  // Set a new id.
   {
      id = newId;
   }

   public void setBalance(double newBalance) // Method to set a new balance.
   {
      balance = newBalance;
   }

   public static void setAnnualInterestRate(double newRate) // Set a new rate.
   {
      annualInterestRate = (newRate / 100);
   }
   
   public int getId()   // Get the id.
   {
      return id;
   }

   public double getBalance() // Get the balance.
   {
      return balance;
   }

   public static double getAnnualInterestRate() // Get the intereset rate.
   {
      return annualInterestRate * 100;
   }

   public double getMonthlyInterestRate() // Get the monthly intereset rate.
   {
      return (annualInterestRate / 12 * 100);
   }

   public double getMonthlyInterest()  // Get the amount of monthly intereset.
   {
      return balance * getMonthlyInterestRate();
   }
   
   public Date getDateCreated()  // Get the date of the account created.
   {
      return dateCreated;
   }
   
   public void withdraw(double amount) // Withdraw action.
   {
      balance = balance - amount;
   }

   public void deposit(double amount)  // Deposit action.
   {
      balance = balance + amount;
   }

   public String toString()   // Converts all the attributes of the object to a string and returns it.
   {
      return ("Account ID:\t" + id + "\nAccount Balance\t" + fmt.format(balance) + "\nInterest Rate:\t" 
         + annualInterestRate * 100 + "%" + "\nDate Opened:\t" + dateCreated); 
   }
}

