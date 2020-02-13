//****************************************************************************
//Purpose:	Create a game of rock, paper, scissors! 
//Name:     Johnnie Oldfield 
//Class:		CS1301A
//Date:		9/5/2017
//Program:	MySRP4.java
//****************************************************************************
//Imports
import java.util.Scanner; 
import java.util.Date;

//Class
public class MySRP4 {

   //Main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      
      //Header
      System.out.println ("\n*************** Welcome to Rock, Paper, Scissors! **************");
	   System.out.printf ("\n\t%-20s", "Johnnie Oldfield");
      System.out.printf ("\n\t%-20s", "CS1301A");
      System.out.printf ("\n\t%-20s", new Date());
  	   System.out.println ("\n****************************************************************");
      
		//Computer picks random number between 1 and 3
		int computer = (int)(Math.random() * 3);

		//Promt input from user to pick a number 
		System.out.print("\nScissors (0), Rock (1), Paper (2): ");
		int user = input.nextInt();

      //Display what the computer and user chose
		System.out.print("The computer chose ");
		switch (computer) {
			case 0: System.out.print("Scissors."); 
            break;
			case 1: System.out.print("Rock."); 
            break;
			case 2: System.out.print("Paper.");
		}

		System.out.print(" You chose ");
		switch (user) {
			case 0: System.out.print("Scissors"); 
            break;
			case 1: System.out.print("Rock"); 
            break;
			case 2: System.out.print("Paper");
		}

		//Win conditions/display results 
		if (user == computer)
			System.out.println(" too. It is a draw.");
		else {
			boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
			if (win)
				System.out.println(". You won!");
			else
				System.out.println(". You lose.");
		}//End of results
      
   System.out.println ("\n************************ Try again *****************************");   
   
	}//End of main
   
}//End of class
