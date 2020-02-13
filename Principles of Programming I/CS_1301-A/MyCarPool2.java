//*******//****************************************************************************
//Purpose:	Write an application that calculates your daily driving cost, so that you can estimate how much money could be saved by car-pooling.
//Input:		The user's cost for driving per day.
//Output:	Displays car-pooling report

//Author:	Johnnie Oldfield
//Class:		CS1301A
//Date:		8/23/2017
//Program #2:	MyCarPool2.java
//****************************************************************************
//Import date and scanner
import java.util.Date;
import java.util.Scanner;
public class MyCarPool2 {
   //Declarations
	private static String name;
   private static String course;
   private static Date dateCreated;
   private static double milesDriven, gallonCost, averageMiles, parkingFees, tollCost, dailyCost, threePassengers, twoPassengers, onePassenger, noPassenger;
   //Main
	public static void main (String [] args) {
	   readData();
      calculations();
      printOutput();
   }//End of Main
   
   //readData Method 
   public static void readData(){
        Scanner input = new Scanner (System.in);    
        
        System.out.print ("Wlecome to the Daily Driving Cost calculator:              \t");
        System.out.print ("\nEnter the number of miles you drive per day:             \t");
        milesDriven = input.nextDouble();
        System.out.print ("Enter the cost per gallon of gas (ie, 2.25):               \t");
        gallonCost = input.nextDouble();  
        System.out.print ("Enter the average miles per gallon of gas of your vehicle: \t");
        averageMiles = input.nextDouble();
        System.out.print ("Enter the parking fees per day:                            \t");
        parkingFees = input.nextDouble();
        System.out.print ("Enter the tolls per day:                                   \t");
        tollCost = input.nextDouble();
   }//End of readData method
   
   //Calculations method
	public static void calculations (){
      dailyCost = gallonCost * (milesDriven / averageMiles) + parkingFees + tollCost;
      threePassengers = dailyCost / 4;
      twoPassengers = threePassengers * 2;
      onePassenger = threePassengers * 3;
      noPassenger = threePassengers * 4;
   }//End of calculations method
   
   //Print output method
   public static void printOutput(){
     
      System.out.printf ("\n\t%-50s", "****************** Car Pooling Report **************************");
           
      System.out.printf ("\n\t\t%-25s", "Name:       \tJohnnie Oldfield");
      System.out.printf ("\n\t\t%-25s", "Course:     \tCS1301A");
      System.out.printf ("\n\t\t%-25s", new Date());
      System.out.printf ("\n\t%-50s", "****************************************************************");
   
      System.out.printf ("\n\n\t%-25s%13.2f", "Daily Miles Driven:", milesDriven);
      System.out.printf ("\n\t%-25s%13.2f", "Cost per gallon:", gallonCost);
      System.out.printf ("\n\t%-25s%13.2f", "Average miles per gallon:", averageMiles);
      System.out.printf ("\n\t%-25s%13.2f", "Parking fees:", parkingFees);
      System.out.printf ("\n\t%-25s%13.2f", "Toll cost:", tollCost);
      
      System.out.printf ("\n\n\t%-25s%11.2f", "Daily trip cost with three other passengers:", threePassengers);
      System.out.printf ("\n\t%-25s%13.2f", "Daily trip cost with two other passengers:", twoPassengers);
      System.out.printf ("\n\t%-25s%14.2f", "Daily trip cost with one other passenger:", onePassenger);
      System.out.printf ("\n\t%-25s%11.2f", "Daily trip cost without any other passenger:", noPassenger);
      System.out.printf ("\n\t%-50s", "********************* Have a nice day **************************");

      
	}//End of print output

   /*
   Sample Output:
   ****************** Car Pooling Report **************************
		Name:		John Smith
		Course:	CS1301
		Date:		1/12/2017

	****************************************************************


	Daily Miles Driven:                        100
	Cost per gallon:                             2.25
	Average Miles Per Gallon:                   21.00
	Parking fees:                                8.75
	Toll cost:                                  11.25

	Daily Trip Cost with three other passengers:           7.68
	Daily Trip Cost with two other passengers:            15.36
	Daily Trip Cost with one other passenger:             23.04
	Daily Trip Cost without any other passengers:         30.71
	****************** Have a nice day ****************************

*/
}