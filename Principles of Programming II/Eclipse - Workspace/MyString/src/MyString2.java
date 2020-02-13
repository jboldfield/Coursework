//*********************************************************************************
//Purpose:	A program that uses the String class to do various things 
//
//Author:	Johnnie Oldfield
//
//Course:	CS1302A
//
//Date:		1/19/2018
//
//Program:	MyString2
//********************************************************************************
import java.util.Arrays;

public class MyString2 {
	//Data field
	private char buffer[];
	
	//Constructor. It uses the string size to create the buffer array
	//and it copies the chars in the string to buffer.
	public MyString2(String s) {
		buffer = s.toCharArray();
	}
	
	//Constructor. It copies the chars in s into buffering to buffer.
	public MyString2(char [] s) {
		buffer = Arrays.copyOf(s, s.length);
	}
	
	//It compares strings with the characters in buffer and returns -1
	//if first string comes first, 0, if they are identical, +1 if 
	//first string is higher than second string.
	public int compare(String s) {
		String charS = new String(buffer);
		return s.compareTo(charS);
      
	}
	
	//It returns the char at location index in the buffer.
	public char charAt(int index) {
		return buffer[index];
	}
	
	//It copies the substring characters from start to end -1 position in
	//string and returns that string the characters from start to end – 1.
	public String substring(int start, int end) {
      String charS = new String(this.buffer);
		return charS.substring(start, end);
	}
	
	//It copies the substring characters from start to end of string to 
	//a string and returns that string.
	public String substring(int begin) {
		String charS = new String(this.buffer);
		return charS.substring(begin);
	}
	
	//It converts the characters in buffer to upper case using 
	//Character.toUpperCase(c: char) method. When done it returns the 
	//new MyString2 by using: return this.
	public MyString2 toUpperCase() {
		for (int i = 0; i < buffer.length; i++){
         buffer[i] = Character.toUpperCase(buffer[i]);
      }
		return this;
	}
	
	//It converts the characters in buffer to lower case using 
	//Character.toLowerCase(c: char) method. When done it returns the
	//new MyString2 by using: return this.
	public MyString2 toLowerCase() {
      for (int i = 0; i < buffer.length; i++){
         buffer[i] = Character.toLowerCase(buffer[i]);
      }
		return this;
	}
	
	//It compares MyString2 s with characters in buffer and returns 
	//true if identical, otherwise, it returns false.
	public boolean equals(String s) {
		String charS = new String(buffer);
		return s.equals(charS);
	}
	
	//It copies buffer to one dimensional array of type char and 
	//returns that array
	public char[] toChars() {
		char [] copy = Arrays.copyOf(buffer, buffer.length);
		return copy;
	}
	
	//Returns the number chars in buffer
	public int length() {
		return buffer.length;
	}
	
	//It reverses the characters in buffer.
	public MyString2 reverse() {
      String charS = new String(buffer);
      StringBuilder s = new StringBuilder(charS);
      s.reverse();
		return this;
	}
	
	//It returns the characters in the buffer as a string
	public String toString() {
		String charS = new String(buffer);
		return charS;
	}
}
