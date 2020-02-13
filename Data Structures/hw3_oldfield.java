/*
 * Johnnie Oldfield
 * CS 3410 Homework 3
 * Fall 2018
 */
import java.util.Scanner;
import java.util.Stack;
public class hw3_oldfield{
   public static void main(String args[]){
      //Get user input
      System.out.println("Enter sentence: ");
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      //Split the string into array of words
      String[] words = input.split("\\s+");
      //Reverse with stack
      for(int i = 0; i < words.length; i++)
         stackReverse(words[i]);
   }//end of main
   
   public static void stackReverse(String word){
      //Make chracter stack
      Stack<Character> stack = new Stack<Character>();
      //Put characters of string into stack
      for(int i = 0; i < word.length(); i++)
         stack.push(word.charAt(i));
      //Pop and print stack
      while(!stack.empty())
         System.out.print(stack.pop());
      System.out.print(" ");
   }//end of stackReverse
}//end of class