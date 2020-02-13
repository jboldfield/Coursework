//Author:	Johnnie Oldfield
//Date:		1/12/2018
//Course:	CS1302A
//**********************************************************
public class QuadraticEquation1 {
//Data Fields
	private double a, b, c;
	
	//No arguments-constructor that sets the coefficients to a default of 1
	public QuadraticEquation1() {
		a = 1;
		b = 1;
		c = 1;
	}
	
	//Constructor with arguments 
	public QuadraticEquation1(double newA, double newB, double newC) {
		a = newA;
		b = newB;
		c = newC;
	}
	//********************************
	
	//Gettors
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	//********************************
	//Settors
	public void setA(double newA) {
		this.a = newA;
	}
	
	public void setB(double newB) {
		this.b = newB;
	}
	
	public void setC(double newC) {
		this.c = newC;
	}
	//*********************************
	//Return discriminant and roots
	public double getDiscriminant() {
		return ((b*b)-(4*a*c));
	}
	
	public double getRoot1() {
		return ((-b+Math.sqrt(b*b-4*a*c))/2*a);
		
	}
	
	public double getRoot2() {
		return ((-b-Math.sqrt(b*b-4*a*c))/2*a);
	}
	//************************************
	// toString
	public String toString() {
		return (a + "X^2 +" + b + "X +" + c);
	}
}
