//Author:	Johnnie Oldfield
//Date:		1/12/2018
//Course:	CS1302A
//**********************************************************
import java.util.Scanner;
public class QuadraticEquation1_Tester {
	//Main method
	public static void main(String[] args) {
		//Equation 1 with default coefficients
	    QuadraticEquation1 equation1 = new QuadraticEquation1();
	    System.out.println ("\n\tThe original equation is:\t" + equation1.toString());
	    double discriminant = equation1.getDiscriminant();
	    System.out.println("\tDiscrimiant:\t" + equation1.getDiscriminant());
	    if (discriminant < 0) {
	      System.out.println("\tNo real roots");
	    }
	    else if (discriminant == 0) {
	      System.out.println("\tThe root is " + equation1.getRoot1());
	    }
	    else {
	      System.out.println("\tThe roots are " + equation1.getRoot1() 
	        + " and " + equation1.getRoot2());
	    }
	    
	    //**************************************************
		//User inputs coefficients
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter coefficients (a, b, c): ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
	    
	    //****************************************************
	    //Equation 2 with user input
	    QuadraticEquation1 equation2 = new QuadraticEquation1(a, b, c);
	    System.out.println ("\n\tThe second equation is:\t\t" + equation2.toString());
	    discriminant = equation2.getDiscriminant();
	    System.out.println("\tDiscriminant:\t" + equation2.getDiscriminant());
	    if (discriminant < 0) {
	      System.out.println("\tNo real roots");
	    }
	    else if (discriminant == 0) {
	      System.out.println("\tThe root is\t " + equation2.getRoot1());
	    }
	    else {
	      System.out.println("\tThe roots are\t " + equation2.getRoot1() 
	        + " and " + equation2.getRoot2());
	    }
	    
	    //***************************************************
	    //Updates original equation with 1 root outcome
	    equation1.setA(1);
	    equation1.setB(2);
	    equation1.setC(1);
	    System.out.println ("\n\tThe updtated original equation is:\t" + equation1.toString());
	    discriminant = equation1.getDiscriminant();
	    System.out.println("\tDiscrimiant:\t" + equation1.getDiscriminant());
	    if (discriminant < 0) {
	      System.out.println("\tNo real roots");
	    }
	    else if (discriminant == 0) {
	      System.out.println("\tThe root is " + equation1.getRoot1());
	    }
	    else {
	      System.out.println("\tThe roots are " + equation1.getRoot1() 
	        + " and " + equation1.getRoot2());
	    }
	    
	    //***************************************************
	    //Updates original equation with no root outcome
	    equation1.setA(1);
	    equation1.setB(2);
	    equation1.setC(3);
	    System.out.println ("\n\tThe updtated original equation is:\t" + equation1.toString());
	    discriminant = equation1.getDiscriminant();
	    System.out.println("\tDiscrimiant:\t" + equation1.getDiscriminant());
	    if (discriminant < 0) {
	      System.out.println("\tNo real roots");
	    }
	    else if (discriminant == 0) {
	      System.out.println("\tThe root is " + equation1.getRoot1());
	    }
	    else {
	      System.out.println("\tThe roots are " + equation1.getRoot1() 
	        + " and " + equation1.getRoot2());
	    }
	    
	    //*****************************************************
	}//End of main
}//End of tester
