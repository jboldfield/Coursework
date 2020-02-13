import java.util.*;
public class Lab_String_Character_9_5_2017{
   public static void main (String[] args){
      String str1 = "Johnnie Oldfield";
      String str2 = "Valddosta State University";
      String str3, str4, str5;
      int m, n;
      //See sample output below
      System.out.println ("\n\tFollow the instructions below\n");
      
      //1.  Display the length of str1
      System.out.printf ("\n\t%-45s%10d", "Length of str1:", str1.length());
          
      //2.  Display the first character of str1
      System.out.printf ("\n\t%-45s%10c", "First character of  str1:", str1.charAt(0));
     
      //3.  Display the last character of str1
      System.out.printf ("\n\t%-45s%10c", "Last character of  str1:", str1.charAt(str1.length()-1));

      //4.  Display the middle character of str1
      System.out.printf ("\n\t%-45s%10c", "Middle character of  str1:", str1.charAt(str1.length()/2));

      //5.  Display str1 in upper case
      System.out.printf ("\n\t%-45s%10s", "str1 in upper case:", str1.toUpperCase());
    
      //6.  Display whether str1 is equal to str2
      System.out.printf ("\n\t%-45s%10b", "Is str1 equal to str2?:", str1.equals(str2));
      
      //7.  Display charcters 1 to 5 (5 is not included ) in str1
      System.out.printf ("\n\t%-45s%10s", "1-4 characters of str1:", str1.substring(1,5));
      
      //8.  Display first, middle, and lasr charcters in str1.
      String temp = "" + str1.charAt(0) + str1.charAt(str1.length()/2) + str1.charAt(str1.length()-1);
      System.out.printf ("\n\t%-45s%10s", "First, middle, and last characters of str1:", temp);
      //Use other String and Character methods. See Chapter4 

      /*
      
      1	Original str1 is:             Valdosta            
   	2	First character of str1 is:   V                   
   	3	Last character of str1 is:    a                   
   	4	Middle character of str1 is:  o                   
   	5	str1 in upper case:           VALDOSTA            
   	6	Is str1 equal to str2?:       false               
   	7	characters 1-4 in str1:       aldo  
        
      */
   }
}