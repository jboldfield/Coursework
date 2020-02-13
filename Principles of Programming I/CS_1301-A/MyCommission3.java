//*****************************************************************************
//Purpose:	Calculates your sales commission based on the sales commission rate
//Name:     Johnnie Oldfield 
//Class:		CS1301A
//Date:		8/30/2017
//Program:	MyCommission3.java
//*****************************************************************************
//Import Scanner and Date
import java.util.Scanner;
import java.util.Date;

public class MyCommission3 {

   //Declarations 
   public static double salesAmount, commissionRate, commission;

   //Main method 
   public static void main (String args []) {
      readData();
      calculations();
      printOutput();
   }//End of main

   //Read data (monthly sales)
   public static void readData(){ 
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter monthly sales amount: ");
      salesAmount = scan.nextDouble();
   }
   
   //Calculations
   public static void calculations (){   
      //If-else
      if (salesAmount < 10000)
         commissionRate = 0.05;
      else if (salesAmount < 15000)
         commissionRate = 0.10;
      else if (salesAmount < 18000)
         commissionRate = 0.12;
      else if (salesAmount < 22000)
         commissionRate = 0.14;
      else
         commissionRate = 0.16;
   
      //Commission
      commission = salesAmount * commissionRate;
   }//End of calculations 
   
   public static void printOutput(){
      printHeader();
      printTable();
      System.out.printf ("\n%-50s","***************************************************");
      System.out.printf ("\n%-20s%23s%.2f","Your monthly sales:", "$", salesAmount);
      System.out.printf ("\n%-20s%30.2f%1s","Your commission rate:", commissionRate * 100, "%");
      System.out.printf ("\n%-20s%14s%.2f","Your commission for the month:", "$", commission);
      printFooter();
   }//End of print output
   
   //Header
   public static void printHeader(){
	   System.out.println ("\n\t***** Commission Report ****");
	   System.out.printf ("\n\t%-20s", "Johnnie Oldfield");
      System.out.printf ("\n\t%-20s", "CS1301A");
      System.out.printf ("\n\t%-20s", new Date());
  	   System.out.println ("\n\t****************************");
   }//End of header
   
   //Print table 
   public static void printTable(){
      System.out.printf ("\n%-20s%31s","Sales this month:", "Commission rate:");
      System.out.printf ("\n%-20s%31s","Less than $10,000", "5%");
      System.out.printf ("\n%-20s%27s","Less than $10,000-14,999", "10%");
      System.out.printf ("\n%-20s%27s","Less than $15,000-17,999", "12%");
      System.out.printf ("\n%-20s%27s","Less than $18,000-21,999", "14%");
      System.out.printf ("\n%-20s%26s","Less than $22,000 or more", "16%");
   }//End of print table 

   //Footer
   public static void printFooter(){
	   System.out.println ("\n***************** Have a nice day *****************");
	}//End of footer   
   
}//End of class
