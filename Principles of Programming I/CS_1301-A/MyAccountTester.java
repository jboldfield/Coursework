//******************************************************************************
//Purpose:  A driver to test MyAccount
//
//Author:   Fares
//
//Course:   CS 1301
//
//Date:     2/13/2017
//
//Program:  MyAccountTester.java
//******************************************************************************
public class MyAccountTester{
   public static void main (String [] args){
      
      //1.  Create an object of MyAccount class using the no-argument constructor
      MyAccount account1 = new MyAccount();
      
      //2.  Create an object of MyAccount with name, account number, and original balance
      MyAccount account2 = new MyAccount("John Smith", 123456, 1000);
      
      //3.  Display account1 and account2 information by invoking the toString method
      System.out.println (account1.toString());
      System.out.println (account2.toString());
      
      //4.  Update account1 by setting the name and account number
      account1.setName("Kira Jones");
      account1.setAccountNumber (654321);
      
      //5.  Get account2 name and current balance
      System.out.println ("\n\n\tAccount2 owner's name:    \t" + account2.getName());
      System.out.println ("\n\tAccount2 Current Balance: \t" + account2
      .getBalance());

      //6.  Deposit/withdraw money into/from account1 and account2
      account1.deposit (500);
      account1.withdraw (25);
      account1.withdraw (15);
      
      account2.deposit (50);
      account2.deposit (75);
      account2.withdraw (250);
     
     //7.  Display account1 and account2 information by invoking the toString method
      System.out.println (account1.toString());
      System.out.println (account2.toString());      
   }
}

      