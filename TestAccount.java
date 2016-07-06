/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Assignment:    12
 * Program:       2
 * ProgramName:   TestAccount
 * Purpose:       To test the program Account by envoking it and creating objects and applying information
 *                to change within data fields.
 * Operation:     Program creates the accounts and makes modifications to each one, then prints the status of 
 *                each account.  
 * Input(s):      None.
 * Output(s):     None.
 * Methodology:   The program test the program account by creating multiple accounts and then preforming
 *                actions within the account. Then the program prints the account info to the user.
 *                
 */  
import java.text.NumberFormat;
 
public class TestAccount
{
   public static void main (String[] args)
   {
   
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
      /******************************************************************************
      *                                Create Objects                               *
      ******************************************************************************/
      
      Account account1 = new Account(1122, 20000); // Create the account objects.
      Account myAccout = new Account(66263, 65899);
      Account yourAccount = new Account(35199, 43711);    
      
      /******************************************************************************
      *                       Calculation/Output Section                            *
      ******************************************************************************/
      
      Account.setAnnualInterestRate(4.5); // Set interest rate.
      
      account1.withdraw(2500);
      account1.deposit(3000);             // Withdraw/deposit and print account1 as specified.
      System.out.print("\nAccount : " +  account1.getId() + "\n________________________");
      System.out.println("\nThe monthly \ninterest is:\t$" + account1.getMonthlyInterest());
      System.out.print("\nThe monthly interest \nrate is:\t" + account1.getMonthlyInterestRate() + "%\n\n");
      System.out.println(account1);
      
      // Make changes to account myAccout and print all of the results.
      System.out.print("\nAccount : " +  myAccout.getId() + "\n________________________");
      System.out.print("\nThe monthly interest is:\t$" + myAccout.getMonthlyInterest());
      System.out.print("\nThe monthly interest rate is:\t" + myAccout.getMonthlyInterestRate() + "%");
      System.out.print("\nThe annual interest rate is:\t" + myAccout.getAnnualInterestRate() + "%");
      System.out.print("\nAccount creation was on:\t" + myAccout.getDateCreated());
      System.out.print("\nChange Id to 7575757");
      myAccout.setId(7575757);
      System.out.print("\nWithdraw $4300.00 from " + fmt.format(myAccout.getBalance()));
      myAccout.withdraw(4300);
      System.out.print("\nDeposit $54930.00 into " + fmt.format(myAccout.getBalance()));
      myAccout.deposit(54930);
      System.out.print("\nWithdraw $30.00 from " + fmt.format(myAccout.getBalance()));
      myAccout.withdraw(30);
      System.out.println("\n\n" + myAccout);
      
      // Make changes to account yourAccount and print all of the results.
      System.out.print("\nAccount : " +  yourAccount.getId() + "\n________________________");
      System.out.print("\nThe monthly interest is:\t$" + yourAccount.getMonthlyInterest());
      System.out.print("\nThe monthly interest rate is:\t" + yourAccount.getMonthlyInterestRate() + "%");
      System.out.print("\nThe annual interest rate is:\t" + yourAccount.getAnnualInterestRate() + "%");
      System.out.print("\nAccount creation was on:\t" + yourAccount.getDateCreated());
      yourAccount.withdraw(1567);
      System.out.print("\nChange Id to 78888");
      yourAccount.setId(78888);
      System.out.print("\nWithdraw $1567.00 from " + fmt.format(yourAccount.getBalance()));
      yourAccount.withdraw(1567);
      System.out.print("\nDeposit $4112.00 into " + fmt.format(yourAccount.getBalance()));
      yourAccount.deposit(4112);
      System.out.print("\nWithdraw $990.00 from " + fmt.format(yourAccount.getBalance()));
      yourAccount.withdraw(990);
      System.out.println("\n\n" + yourAccount);   
   }
}