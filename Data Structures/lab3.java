/*
 *  Johnnie Olfield
 *  CS 3410
 *  Fall 2018
 */
import java.util.Scanner;
public class lab3{
   public static void main(String[] args){
      int m, n;
      System.out.println("Enter two numbers: Ex. (35 21)");
      //Read user input
      Scanner scan = new Scanner(System.in);
      m = scan.nextInt();
      n = scan.nextInt();
      scan.close();
      gcd(m, n);
   }//end of main
   
   public static void gcd(int m, int n){
      //If n divides m with no remainder print m
      if (n % m == 0)
         System.out.println("The GCD is " + m);
      //Otherwise
      else
         gcd(n, m % n);
   }//end of gcd
}//end of class