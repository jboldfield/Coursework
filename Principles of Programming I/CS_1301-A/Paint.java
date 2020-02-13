//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
import java.util.Date;
public class Paint{
   public static void main(String[] args){
      final int COVERAGE = 350;	//paint covers 350 sq ft/gal
      //declare integers length, width, and height;
      int length, width, height;
      
      //declare double totalSqFt;
      double totalSqFt;
      
      //declare double paintNeeded;
      double paintNeeded;
      
      //declare and initialize Scanner object
      Scanner scan = new Scanner (System.in);
      
      //Prompt for and read in the length of the room
      System.out.print ("\tEnter length of room as integer:\t");
      length = scan.nextInt();
      
      //Prompt for and read in the width of the room
      System.out.print ("\tEnter width of room as integer: \t");
      width = scan.nextInt();
      
      //Prompt for and read in the height of the room
      System.out.print ("\tEnter height of room as integer:\t");
      height = scan.nextInt();
      
      //Compute the total square feet to be painted--think
      //about the dimensions of each wall (Not the floor or ceiling)
      totalSqFt = 2 * (length + width) * height;
      
      //Compute the amount of paint needed
      paintNeeded = totalSqFt / COVERAGE;
      
      //Print the length, width, and height of the room and the
      //number of gallons of paint needed.
      System.out.printf ("\n\t%-50s", "****************************************************");
      System.out.printf ("\n\t\t%-25s", "Painting a room");
      
      System.out.printf ("\n\t\t%-25s", "Your name");
      System.out.printf ("\n\t\t%-25s", new Date());
      
      System.out.printf ("\n\n\t%-25s%10d", "Length:", length);
      System.out.printf ("\n\t%-25s%10d", "Width:", width);
      System.out.printf ("\n\t%-25s%10d", "Height:", height);
      System.out.printf ("\n\t%-25s%13.2f", "Area:", totalSqFt);
      System.out.printf ("\n\t%-25s%13.2f", "Gallons:", paintNeeded);
      
      System.out.printf ("\n\n\t%-50s", "*****************End of Report**********************");
      System.out.printf ("\n\t%-50s", "*****************Have a Good Day *******************");
   }
}
