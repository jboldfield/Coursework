import java.util.ArrayList;

//Name:			Johnnie Oldfield
//Program Name:	Diner
//Date:			02/09/2018
//Purpose:		A program that manages food stocks
//				and estimates income for diner.
//************************************************
public class Diner {
	//Data fields
	private static int countFamily, countCouple,countInd,
					   countGroup, totalOrders, totalIncome;
	static ArrayList<Guest> guests = new ArrayList<Guest>();
	static Kitchen k = new Kitchen();
	
	public static void main(String[] args) {
		runDiner();
		printReport();
	}//End of main

	//Run diner
	public static void runDiner(){
		//Create random number tied to types of guests.
		Guest g;
		while (k.checkStock()){
			int guest = (int)(Math.random() * 4);
			switch (guest){
			case 0:
				g = new Family();
				countFamily++;
				totalIncome += 65;
				break;
			case 1:
				g = new Couple();
				countCouple++;
				totalIncome += 30;
				break;
			case 2:
				g = new Individual();
				countInd++;
				totalIncome += 12;
			case 3:
				g = new Group();
				countGroup++;
				totalIncome += 72;
				break;
			default: 
				g = new Individual();
			}//End of switch
			totalOrders++;
			k.updateStock(g.getOrder());
			guests.add(g);
		}//End of loop
	}//End of runDiner

	//Print report
	public static void printReport(){
		System.out.println("******* Total income for the day: " +  "$" + totalIncome + " *******" +
				   "\n** Guest type count **" +
				   "\nFamily: " + countFamily +
				   "\nCouple: " + countCouple +
				   "\nIndividual: " + countInd +
				   "\nGroup: " + countGroup +
				   "\n" +
				   "\n******* Total number of orders: " + totalOrders + " *******" +
				   "\n** Closing stock **" +
				   "\nDrink: " + k.stock[0] +
				   "\nSoup: " + k.stock[1] +
				   "\nSalad: " + k.stock[2] +
				   "\nEntree: " + k.stock[3] +
				   "\nDessert: " + k.stock[4]);
	}//End of printReport
}//End of class
