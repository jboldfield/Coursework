//*********************************************************************************
//Purpose:	Test MyString2
//
//Author:	Johnnie Oldfield
//
//Course:	CS 1302A     
//
//Date:		/01/19/2018
//
//Program:	MyString2_Tester
//********************************************************************************
public class MyString2_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString2 ms1 = new MyString2 (new char[] {'C', 'S', ' ', '1', '3', '0', '2', ' ', 'B'});
		MyString2 ms2 = new MyString2 ("Valdosta State University");
  		
		System.out.println("\n1.\tOriginal Char array:                   \t" + ms1.toString());
		System.out.println("\n2.\tOriginal String:                       \t" + ms2.toString());
		System.out.println("\n3.\tchar at entry 3 in Original Char array:\t" + ms1.charAt(3));
		System.out.println("\n4.\tSize of Original String:               \t" + ms2.length());
		System.out.println("\n5.\tsubstring (0,3) in Original Char array:\t" + ms1.substring(0,3));
		System.out.println("\n6.\tsubstring (2) in Original String:      \t" + ms2.substring(2));
		System.out.println("\n7.\tOriginal Char array in upper case:     \t" + ms1.toUpperCase());
		System.out.println("\n8.\tOriginal Char array in lower case:     \t" + ms1.toLowerCase());
		System.out.println("\n9.\tOriginal string in lower case:         \t" + ms2.toLowerCase());
		System.out.println("\n10.\tis string1 equals to string2:         \t" + ms1.equals(ms2));
	   //System.out.println("\n11.\tcompare string1 to string2:           \t" + ms1.compare(ms2));
		//System.out.println("\n12.\tcompare string1 to string1:           \t" + ms1.compare(ms1));
      char[] temp = ms2.toChars();
      System.out.println ("\n13.\ttoChars ms2:                        \t" + String.valueOf(temp));
      ms2.reverse();
		System.out.println("\n14.\tms2 in reverse:                      \t" + ms2);
	}
}
