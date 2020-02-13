//*********************************************************************
//Purpose:	  	To test, print, and sort the various ship types, also
//				display certain variable totals.
//Course:     	CS1302
//Author:      	Johnnie Oldfield
//Date:        	02/05/2018
//Program:     	MyShip4.java
//********************************************************************
import java.util.Collections;
import java.util.ArrayList;
public class MyShip4{
	public static void main(String[] args){
		
		//Creates an ArrayList to hold all of the ships
		ArrayList <Ship> ships = new ArrayList<>();
		
		//Populate ArrayList with a number of ship types
		ships.add(new Ship("Basic", 1955));
        ships.add(new CargoShip());
        ships.add(new CruiseShip());
		ships.add(new CargoShip("Panama", 250));
		ships.add(new CargoShip("Valdosta", 2001, 500));
		ships.add(new CargoShip("Atlanta", 1996, 3700));
		ships.add(new CruiseShip("Paradise", 3000));
		ships.add(new Ship());
		ships.add(new CargoShip("Rio", 250));
		ships.add(new CruiseShip("Dream", 2000));
		ships.add(new CruiseShip("Future", 4500));
		ships.add(new CargoShip("Cuba", 432));
		ships.add(new Ship("George Washington", 1732));
		
		
    	//1.  Traverse the arrayList and display all ship information.
		for(int i = 0; i < ships.size(); i++) {   
		    System.out.print("\n" + (i + 1) + ").\n" + ships.get(i));
		    System.out.println();
	    }
		
		//2.  Sort all ships by year built on ascending order
	    Collections.sort(ships);

		//3.  Traverse the arrayList and display all ship information.
	    System.out.println("\nSorted Ships:");
	    for(int i = 0; i < ships.size(); i++) {   
		    System.out.print("\n" + (i + 1) + ").\n" + ships.get(i));
		    System.out.println();
	    }
		   
	    //4.  Compute the total number of passengers in all cruise ships
	    int totalPassengers = 0;
		for (int i = 0; i < ships.size(); i++) {
			if (ships.get(i) instanceof CruiseShip)
				totalPassengers += ((CruiseShip)ships.get(i)).getPassengers();
		}
		   
		//5.  Compute the total tonnage of all Cargo ships
		int totalTonnage = 0;
		for (int i = 0; i < ships.size(); i++) {
			if (ships.get(i) instanceof CargoShip)
				totalTonnage +=  ((CargoShip)ships.get(i)).getTonnage();
		}
		
		//6.  Display both total number of passengers and total tonnage
     	//    You should get the following totals:
		//    Total Tonnage for Cargo Ships      15132
		//    Total Number of Passengers         10500   
		System.out.println();
		System.out.println("Total Number of Passengers:	\t" + totalPassengers);
		System.out.println("Total Number of Tonnage:	\t" + totalTonnage);
   }
}
