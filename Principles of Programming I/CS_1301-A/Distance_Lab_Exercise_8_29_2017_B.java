//**************************************************************
//Purpose: Given coordinates of two points compute the distance.
//
//**************************************************************
public class Distance_Lab_Exercise_8_29_2017_B {

   //Main method
   public static void main(String [] args) {
   
   //Declarations
   int x1, x2, y1, y2;
   double distance, gpa;
   String name, course;
   
   //Assign command-line arguments to x1, y1, x2, y2
   x1 = Integer.parseInt (args[0]);
   y1 = Integer.parseInt (args[1]);
   
   x2 = Integer.parseInt (args[2]);
   y2 = Integer.parseInt (args[3]);
   
   name = args[4];
   course = args [5]; 
   
   gpa = Double.parseDouble (args[6]);
   //Compute distance
   distance = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
   
   //Display output
   System.out.println ("\n\tThe distance from (" + x1 + " , " + y1 + " ) to ( " + x2 + " , " + y2 + " ) is " + distance);
   
   System.out. printf ("\n\t%-30s%-20s", "Name:", name);
   System.out. printf ("\n\t%-30s%-20s", "Course:", course);
   System.out. printf ("\n\t%-30s%10.2f", "GPA:", gpa);


   }//End of main method   
}//End of class 