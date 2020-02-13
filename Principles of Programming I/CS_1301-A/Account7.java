//********************************************************************
// Purpose: Represents a bank account with basic services such as deposit
// and withdraw
// Author:  Johnnie Oldfield
// Course:  CS 1301 A
// Date:    10/13/2017
//
//  
//********************************************************************

import java.text.NumberFormat;
import java.util.Date;
public class Account7
{
   //Declare account variables to hold owner, number,
   //balance, fees, and date created
   private String name = null;
   private String accountNumber = null;
   private double originalBalance = 0;
   private double currentBalance = 0;
   private double withdrawFees = 0;
   private Date dateCreated = null;

   //Declare and initialize to 0 the static variables to hold totals for all accounts
   private static double totalFees = 0;
   private static double totalDeposits = 0;
   private static double totalWithdrawals = 0;
   private static double totalOriginalBalances = 0;
   private static double totalCurrentBalances = 0;
   
   //-----------------------------------------------------------------
   //  no-argument constructor for account. 
   //  Assign the default values to the attributes (fields above):
   //  "Unknown" to owner
   //  "99999" to number
   //  0 to balance,
   //  0 to originalBalance
   //  3 to fees
   //  current date to date created
   //-----------------------------------------------------------------
   public Account7()
   {
      name = "Unknown";
      accountNumber = "99999";
      originalBalance = 0;
      currentBalance = 0;
      withdrawFees = 3;
      dateCreated = new Date();
   }

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance, and withdrawal fees. You may 
   //  update total original balance and total current balance
   //  Also, assign current date to date created 
      //-----------------------------------------------------------------
   public Account7(String owner, String account, double initial, double fees)
   {
      name = owner;
      accountNumber = account;
      originalBalance = initial;
      currentBalance = initial;
      withdrawFees = fees;
      totalOriginalBalances = originalBalance;
      totalCurrentBalances = currentBalance;
      dateCreated = new Date();
   }

   //-----------------------------------------------------------------
   //  Deposits the specified amount into the account. Returns the
   //  new balance. You may 
   //  update total current balance and total deposits
   //-----------------------------------------------------------------
   public double deposit(double amount)
   {
      totalDeposits += amount;
      currentBalance += amount;
      totalCurrentBalances += amount;
      return currentBalance;
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account
   //  Returns the new balance.You may 
   //  update total current balance, total withdrawals, and total fees
   //-----------------------------------------------------------------
   public double withdraw(double amount)
   {
      totalWithdrawals += amount;
      currentBalance -=amount;
      totalCurrentBalances += amount;
      totalFees += withdrawFees;
      return currentBalance;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance()
   {
      return currentBalance;
   }

   //-----------------------------------------------------------------
   //  Returns all account information.
   //-----------------------------------------------------------------
   public String toString()
   {
      System.out.println ("\n\tAccount Owner:     \t" + name +
                          "\n\tAccount Number:    \t" + accountNumber +
                          "\n\tOriginal Balance:  \t" + originalBalance +
                          "\n\tCurrent Balance:   \t" + currentBalance +
                          "\n\tWithdrawal Fees:   \t" + totalFees +
                          "\n\tDate Created:      \t" + dateCreated); 
      return ""; 
   }
   
   //-----------------------------------------------------------------
   //  Display summary of all accounts: i.e., 
   //    total original balance for all accounts
   //    total current balances for all accounts
   //    total deposits for all accounts
   //    total widthraws for all accounts
   //    total fees paid for all accounts
   // -----------------------------------------------------------------
   public void displaySummaryOfAllAccounts(){
      System.out.println ("\n\tTotal Original Balances:   \t" + totalOriginalBalances +
                          "\n\tTotal Current Balances:    \t" + totalCurrentBalances +
                          "\n\tTotal Deposits:            \t" + totalDeposits +
                          "\n\tTotal Withdrawals:         \t" + totalWithdrawals +
                          "\n\tTotal Fees:                \t" + totalFees);
   }
}