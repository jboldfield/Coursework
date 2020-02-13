//********************************************************************************
//Purpose:  Reads input file informaiton and assigns it accordingly. It creates 
//          grade array base off of score array.  Then prints all information
//          as a list.
//
//Author:   Johnnie Oldfield
//                
//Course:   CS 1301 A
//
//Date:     10/20/17
//
//Program:  MyCourse8.java
//********************************************************************************

import java.util.Scanner;
public class MyCourse8 {
   //Declarations
   private String courseName;
   private String instructorName;
   private int numberOfStudents;
   private String school;
   private String semester;
   private int year;
   private String [] names;
   private int [] scores;
   private char [] grades;
   private double testAverage;
   private int lowestScoreIndex;
   private int highestScoreIndex;
   
   //Constructor
   public MyCourse8 (Scanner scan){
       
      //reading course information
      courseName = scan.nextLine();
      instructorName = scan.nextLine();
      this.numberOfStudents = scan.nextInt();
      this.school = scan.next();
      this.semester = scan.next();
      this.year = scan.nextInt();
                 
      //declaring needed arrays
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents];
      grades = new char [numberOfStudents];
      
      
      //reading students records
      for (int i = 0; i < numberOfStudents; i++){
         names [i] = scan.next();
         scores[i] = scan.nextInt();
         
      }//end of for
      
      //Invoke the following methods to compute grades, test average, and find the 
      //indexes of highest and lowest scores in the class
      computeGrades();
      computeTestAverage ();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      
      //Printing output.
      displayOutput();
   }
   
   public void computeGrades (){
      for (int i = 0; i < scores.length; i++){
         if (scores[i] >= 90)
            grades[i] = 'A';
         else if (scores[i] >= 80)
            grades[i] = 'B';
         else if (scores[i] >= 70)
            grades[i] = 'C';
         else if (scores[i] >= 60)
            grades[i] = 'D';
         else
            grades[i] = 'F';
      }
   }

    public void computeTestAverage(){
      double total = 0;
      for (int i = 0; i < scores.length; i++)
         total += scores[i];
      testAverage = total/numberOfStudents;
    }

   public void findStudentWithHighestTotal(){
    highestScoreIndex = 0;
    int max = scores[0];
    for (int i = 0; i < scores.length; i++)
      if (scores[i] > max){
         max = scores[i];
         highestScoreIndex = i; 
      }
   }

   public void findStudentWithLowestTotal(){
      lowestScoreIndex = 0;
      int min = scores[0];
      for (int i = 0; i < scores.length; i++)
         if (scores[i] < min){
            min = scores[i];
            lowestScoreIndex = i; 
         }  
   }
   
   public void displayOutput(){
   
      displayHeader();
      displayStudentsRecords ();
      displayFooter ();
   }
   
   public void displayHeader(){
      System.out.println ("\n*****************************************************"); 
      System.out.println ("\n\tCourse Name:           \t" + courseName);
      System.out.println ("\n\tInstructor's Name:     \t" + instructorName);
      System.out.println ("\n\tSemester:              \t" + semester);
      System.out.println ("\n\tYear:                  \t" + year); 
      System.out.println ("\n\tSchool:                \t" + school);  
      System.out.println ("\n*****************************************************");
   }

   public void displayStudentsRecords(){
      //display labels
      System.out.printf  ("\n%10s  %-15s %-15s %-15s","Number","Name", "Score", "Grade");
      System.out.println ();
        
      //display students records
      for (int i = 0; i <= numberOfStudents - 1; i++){
         System.out.printf  ("\n%10s  %-15s %-15s %-15s", i + 1, names[i], scores[i], grades[i]);
         System.out.println ();
      }
   }
   
   public void displayFooter (){
      System.out.printf ("\n%-30s%10.2f", "Test Average:", testAverage);  
      System.out.println ("\nStudent with the lowest score");
      System.out.printf ("%-15s %-15s %-15s", names[lowestScoreIndex], 
                        scores[lowestScoreIndex], grades[lowestScoreIndex]);
      System.out.println ("\nStudent with the highest score");
      System.out.printf ("%-15s %-15s %-15s", names[highestScoreIndex], 
                        scores[highestScoreIndex], grades[highestScoreIndex]);

   }// end of displayFooter
 
   
}//end of class