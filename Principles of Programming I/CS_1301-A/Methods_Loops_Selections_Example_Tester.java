//****************************
//Purpose:
//
//****************************
public class Methods_Loops_Selections_Example_Tester{
   public static void main (String [] args){
        //Create an object of Methods_Loops_Selections_Example
        Methods_Loops_Selections_Example mlse1 = new Methods_Loops_Selections_Example();
        System.out.println (mlse1);
        Methods_Loops_Selections_Example mlse2 = new Methods_Loops_Selections_Example("Fares", "CS 1301 A");
        System.out.println (mlse2);
        
        //invoke getMonthName method
        System.out.println ("\n\tThe month name for month 3 is:\t" + mlse2.getMonthName(3));
        System.out.println ("\n\tThe month name for month 0 is:\t" + mlse2.getMonthName(0));

        System.out.println ("\n\tNumber of digits in CS 1301 A is:\t" + mlse2.getNumberOfDigits("CS 1301 A"));
        System.out.println ("\n\tSum of digits in CS 1301 A is:\t" + mlse2.sumOfDigits("CS 1301 A"));
        System.out.println ("\n\tSum of digits in CS 1301 A Fall 2017 is:\t" + mlse2.sumOfDigits("CS 1301 A Fall 2017"));
      


 

   
   
   }//end of main
}//end of class