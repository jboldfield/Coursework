//****************************************************************************
//Purpose:	Using static methods, Date, and Scanner classes
//Input:		Reading name, course, and rectangle dimensions
//Output:	Displays rectangle information. See sample output at the bottom
//Author:	Fares
//Class:		CS1301
//Date:		8/17/2017
//Program:	Circle_Lab_8_17_2017.java
//****************************************************************************

//1.  Import the packages that have the Scanner and Date classes

import java.util.Date;
import java.util.Scanner;
public class Circle_Lab_8_17_2017 {
	//2.  Declarations
   //    Declare static variables that can be used in all the methods of the class
   //    Declare width, height, area, and perimeter of type double
   //    Declare name and course of type String
	private static String name;
   private static String course;
   private static double radius, area, perimeter;
   private static Date dateCreated;
  	
	//****************************************************************************
	//main:	invokes other methods.
   //       main methods just invokes readData, calculations, and printOutput methods
	//****************************************************************************
	public static void main (String [] args) {
	   readData();
      calculations();
      printOutput();
   }//end of main
	
	//****************************************************************************
	//readData:	Read name, course, and rectangle width and height
	//				
	//****************************************************************************
	
   //3.  Implement the readData method
   public static void readData(){
      //3.1 Create a Scanner object to help in reading name, course, height, and width from keyboard
        Scanner input = new Scanner (System.in);    
      //3.2 Reading data: name, course, and rectangle dimensions
        System.out.print ("Enter your name:  \t");
        name = input.nextLine();
        System.out.print ("Enter course name:\t");
        course = input.nextLine();
        System.out.print ("Enter radius:      \t");
        radius = input.nextDouble();  
 
   }//end of readData method
	
   //4.  Implement the calculations method
	//****************************************************************************
	//calculations:	computes area and perimeter.
   //                Also, gets date and time from the system
	//						
	//****************************************************************************
	public static void calculations (){
      //4.1 Compute perimeter and area
      area = Math.PI * Math.pow (radius, 2);
      perimeter = 2 * Math.PI * radius;
      
      //4.2 Get date and time from the system
      dateCreated = new Date();
      
	} //end of calculations method
	
	//****************************************************************************
	//printOutput:	invokes header and footer
	//					and displays rectangle  
	//					information
	//****************************************************************************

	public static void printOutput(){
		//invoke the printHeader method
      printHeader();
      
      //print width, height, area, perimeter, and color as shown in sample output
		System.out.printf ("\n\t%-20s%5.2f","Radius:", radius);
      System.out.printf ("\n\t%-20s%5.2f","Area:", area);
      System.out.printf ("\n\t%-20s%5.2f","Perimeter:", perimeter);
      //invoke printFooter method
		printFooter();
	}
	
	//****************************************************************************
	//printHeader:	Prints name, clas, and date.
   //             Use the Date class to get the date and time from the system
	//****************************************************************************
	public static void printHeader(){
		System.out.println ("\n\t******* Circle Report *************");
		System.out.printf ("\n\t%-20s%-20s", "Name:", name);
      System.out.printf ("\n\t%-20s%-20s", "Course:", course);
      System.out.printf ("\n\t%-20s%-20s", "Date:", dateCreated);
     	System.out.println ("\n\t***********************************");
	}
	
	//************************************
	//printFooter:	prints a footer line
	//************************************
	public static void printFooter(){
		System.out.println ("\n\n\t******* Have a nice day ************");
	}
   
   /*
   

   ******* Circle Report *************
	   Name:	John Smith
   	Class:	CS1301
      Date:	Mon Aug 22 09:37:41 EDT 2016
   ***********************************
      
      Width                     3.00
      Height                    4.00
      Area                     12.00
      Perimeter                14.00
            
   ******* Have a nice day ************
*/
}