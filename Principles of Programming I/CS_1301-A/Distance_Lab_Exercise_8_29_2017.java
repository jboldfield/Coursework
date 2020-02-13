//**************************************************************
//Purpose: Given coordinates of two points compute the distance.
//
//**************************************************************
//Import scanner and date
import java.util.Scanner;
//date
public class Distance_Lab_Exercise_8_29_2017 {

   //Main method
   public static void main(String [] args) {
   
   //Declarations
   int x1, x2, y1, y2;
   double distance;
   Scanner scan = new Scanner (System.in);
   
   //Read input values
   System.out.print ("\tEnter two integers values for x1 and y1:\t");
   x1 = scan.nextInt ();
   y1 = scan.nextInt ();
   
   System.out.print ("\tEnter two integers values for x2 and y2:\t");
   x2 = scan.nextInt ();
   y2 = scan.nextInt ();
   
   //Compute distance
   distance = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
   
   //Display output
   System.out.printf ("\n\tThe distance from (" + x1 + " , " + y1 + " ) to ( " + x2 + " , " + y2 + " ) is " + distance);
   
   }//End of main method   
}//End of class 