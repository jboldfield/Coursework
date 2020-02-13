/*
 *  Johnnie Olfield
 *  CS 3750
 *  Fall 2018
 *  Assignment 2
 */
 
import java.io.*;
import java.util.Scanner;

class checksum{
   public static void main(String [] args) throws IOException{
      //Data field
      int count = 0, i = 0;
      Scanner scan = new Scanner(new FileInputStream(args[0]));
      
      //Count tokens in file      
      while (scan.hasNext()){
         count++;
         scan.next();
      }
      scan.close();  //close scanner
      
      //Long array for tokens
      long upc[] = new long[count];
      //New scanner to get tokens
      Scanner scan2 = new Scanner(new FileInputStream(args[0]));
      while (scan2.hasNext()){
         upc[i] = scan2.nextLong();
         i++;
      }
      scan2.close(); //close scanner
      
      //Loop thorugh args array
      for(i = 0; i < count; i++)
         calculateUPC(formatUPC(upc[i]));
   }//End of main
   
   //Format args into usbale int array
   public static int[] formatUPC(long upc){
      //Data field
      long temp;
      int arr[] = new int [12];
      for(int i = 11; i >= 0; i--){
         temp = (long)upc % 10;  //Grab right most number
    	   arr[i] = (int)temp;     //Put that number into array
         upc /= 10;              //Cut that number               
      }
      return arr;
   }//End of format
   
   //Calculate checksum
   public static void calculateUPC(int arr[]){
      //Data field
      int eSum = 0, oSum = 0, result,  checksum;
      //Get odd sum
      for (int i = 0; i < 12; i += 2)
         oSum += arr[i];
      //Get even sum excluding checksum 
      for (int i = 1; i < 11; i += 2)
         eSum += arr[i];
      result = (3 * oSum) + eSum;
      System.out.print("\nUPC code ");
      //Print UPC
      for(int i = 0; i < 12; i++){
         System.out.print(arr[i]);
      }
      //Check if valid
      if (result % 10 == 0){
         checksum = 0;
         System.out.print(" is valid.");
         
      }
      //Check if invalid
      else{
         checksum =  10 - (result % 10);
         arr[11] = checksum;
         System.out.print(" is invalid. The correct checksum digit is " + checksum + ".");
      }
   }//End of calculate
}//End of class