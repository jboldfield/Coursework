//****************************
//Purpose:
//
//
//****************************
import java.util.Date;
public class Methods_Loops_Selections_Example{
   //Data fields or attributes
   private String name = "Unknown";
   private String course = "Unknown";
   private Date dateCreated = new Date();
   
   //***************************************
   //No-argument constructor
   //***************************************
   public Methods_Loops_Selections_Example(){
   }
   
   //***************************************
   //overloaded constructor. accepts name and course
   //                        and assigns to class name and course
   //***************************************
   public Methods_Loops_Selections_Example(String n, String c){
      name = n;
      course = c;
   }
   
   //****************************************
   //toString: Returns a string of name, course and date
   //****************************************
   public String toString(){
      String result;
      result = "\n\tName is:     \t" + name +
               "\n\tCourse is    \t" + course +
               "\n\tDate Created \t" + dateCreated;
      return result;
   }//end of method
   
   //********************************************
   //getMonthName.   Accepts month number and returns month name
   //********************************************
   public String getMonthName (int monthNumber){
      String result;
      switch (monthNumber){
         case 1:  result = "January";
                  break;
         case 2:  result = "February";
                  break;
         case 3:  result = "March";
                  break;
         case 4:  result = "April";
                  break;
         case 5:  result = "May";
                  break;
         case 6:  result = "June";
                  break;
         case 7:  result = "July";
                  break;
         case 8:  result = "August";
                  break;
         case 9:  result = "September";
                  break;
         case 10:  result = "October";
                  break;
         case 11:  result = "November";
                  break;
         case 12:  result = "December";
                  break;
         default: result = "Invalid month number:\t" + monthNumber;
      }//end of switch
      return result;
   
   }//end of method
   
   //********************************************
   //getNumberOfDigits: Accepts a string and returns the 
   //                   number of digits in it
   //********************************************
   public int getNumberOfDigits (String s){
      int count = 0;
      for (int i = 0; i < s.length(); i++){
         if (Character.isDigit(s.charAt(i)))
            count++;
      }//end of for 
      return count;
   }//end of method
   
    //********************************************
   //sumOfDigits: Accepts a string and returns the 
   //             sum of digits in a string
   //********************************************
   public int sumOfDigits (String s){
      int sum = 0;
      char c;
      for (int i = 0; i < s.length(); i++){
         if (Character.isDigit(s.charAt(i)))
            sum += (s.charAt(i) - '0');
      }//end of for 
      return sum;     
   }//end of method
   
}//end of class

   