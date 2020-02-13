//********************************************************************
//  MyAccount.java       
//  Name:      Johnnie Oldfield
//  Course:    CS1301A
//  Date:      10/3/2017
//  Purpose:   Represents a bank account with basic services such as
//  deposit and withdraw.
//********************************************************************

import java.text.DecimalFormat;
import java.util.Date;

public class MyAccount{
   private String name = null;
   private long accountNumber = 0;
   private double originalBalance = 0;
   private double currentBalance = 0;
   private double totalDeposits = 0;
   private double totalWithdrawals = 0;
   private Date dateCreated = null;
   
   //-----------------------------------------------------------------
   //  1.   Sets up the account by defining default values for the 
   //  account.  (No-argument constructor) 
   //-----------------------------------------------------------------
   public MyAccount(){
      name = "Unknown";
      accountNumber = 99999;
      originalBalance = 0;
      currentBalance = 0;
      dateCreated = new Date();
   }

   //-----------------------------------------------------------------
   //  2.   Sets up the account by defining its owner, account number,
   //  and initial balance.  (Overloaded constructor) 
   //-----------------------------------------------------------------
   public MyAccount(String owner, long account, double balance){
      name = owner;
      accountNumber = account;
      originalBalance = balance;
      currentBalance = balance;
      dateCreated = new Date();
   }

   //-----------------------------------------------------------------
   //  3.   getName:   returns name.
   //-----------------------------------------------------------------
   public String getName(){
      return name;
   }
   
   //-----------------------------------------------------------------
   //  4.   getAccountNumber:   returns account number.
   //-----------------------------------------------------------------
   public long getAccountNumber(){
      return accountNumber;
   }

   //-----------------------------------------------------------------
   //  5.   Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance(){
      return currentBalance;
   }

   //-----------------------------------------------------------------
   //  6.   Updates name
   //-----------------------------------------------------------------
   public void setName(String newName){
      name = newName;
   }

   //-----------------------------------------------------------------
   //  7.   Updates account number
   //-----------------------------------------------------------------
   public void setAccountNumber(long newAccountNumber){
      accountNumber = newAccountNumber;  
   }

   //-----------------------------------------------------------------
   //  8.   Deposits the specified amount into the account. Returns the
   //  new balance.
   //-----------------------------------------------------------------
   public double deposit(double amount){
      totalDeposits += amount;
      currentBalance += amount;
      return currentBalance;
   }

   //-----------------------------------------------------------------
   //  9.   Withdraws the specified amount from the account and return the new balance.
   //-----------------------------------------------------------------
   public double withdraw(double amount){
      totalWithdrawals += amount;
      currentBalance -=amount;
      return currentBalance;
   }

   
   //-----------------------------------------------------------------
   //  10.  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString(){
      DecimalFormat fmt = new DecimalFormat("$###,##0.00");
      System.out.println ("\n\tName:              \t" + name +
                          "\n\tAccount Number:    \t" + accountNumber +
                          "\n\tOriginal Balance:  \t" + originalBalance +
                          "\n\tTotal Deposits:    \t" + totalDeposits +
                          "\n\tTotal Withdrawls:  \t" + totalWithdrawals +
                          "\n\tCurrent Balance:   \t" + currentBalance +
                          "\n\tDate Created:      \t" + dateCreated); 
      return "";              
   }
}
