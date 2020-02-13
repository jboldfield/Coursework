//**********************************************************
//Purpose:  Manipulating Two-Dimensional Arrays
//Author:   Johnnie Oldfield
//Class:    CS1301
//Date:     10/30/2017
//
//**********************************************************
import java.util.*;
import java.io.*;
public class MyGrades9 {
   //Declaration Section
   private String courseName;       
   private String instructorName;
   private String semester;
   private int year;
   private String school;
   private int numberOfStudents;
   private int numberOfTests;
   private String [] names;         //to hold students names
   private int [][] scores;         //to hold students scores
   private char [] grades;          //to hold students grades
   private int [] studentsTotals;   //to hold students totals
   private double [] testsAverages; //to hold tests averages
   private int lowestScoreIndex;    //index of student with lowest total
   private int highestScoreIndex;   //index of student with highest total
   private Scanner infile;
        
   //*****************************************************
   //Constructor: Accepts student text file object.
   //             It reads course general information and creates 
   //             the appropriate arrays sizes.
   //             See data file format
   //
   //*****************************************************
   public MyGrades9 (Scanner scan){
      //assign scan to the global variable infile
      infile = scan;
            
      readCourseInfo();
      readRecords();
      computeStudentsTotals();
      computeGrades();
      computeTestsAverages();
      findStudentWithLowestTotal();
      findStudentWithHighestTotal();
      printHeader();
      displayStudentsRecords();
      printFooter();
   }
   //***********************************************************
   //Reads course info
   //***********************************************************  
   private void readCourseInfo(){
      //Read course general information.
      //See the first 7 lines in the data file 
      courseName = infile.nextLine();
      instructorName = infile.nextLine();
      school = infile.nextLine();
      semester = infile.nextLine();
      year = infile.nextInt();
      numberOfStudents =infile.nextInt();
      numberOfTests = infile.nextInt();
      
      //Create the appropriate arrays based on the course general information data
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents][numberOfTests];
      grades = new char [numberOfStudents];
      studentsTotals = new int [numberOfStudents];
      testsAverages = new double [numberOfTests];
   }
   
   //***********************************************************
   //Read records.
   //***********************************************************
   private void readRecords(){
      int count = 0;
      while (infile.hasNext()){
         names[count] = infile.next();
         for (int c = 0; c < scores[count].length; c++)
            scores[count][c] = infile.nextInt();
         count++;
      }//end of while loop
   }//end of readRecords

   //***********************************************************
   //Computes student totals and store them in a one-dimensional array.
   //***********************************************************
   private void computeStudentsTotals (){
      for (int r = 0; r < scores.length; r++){
         int sum = 0;
         for (int c = 0; c < scores[r].length; c++){
            sum += scores[r][c];
            studentsTotals[r] = sum;
         }
      }
   }
   
   //***********************************************************
   //Computes the test averages and stores them in testsAverages array
   //***********************************************************
   private void computeTestsAverages(){
      for (int c = 0; c < scores[0].length; c++){
         double sum = 0;
         for (int r = 0; r < scores.length; r++){   
            sum += scores[r][c];
            testsAverages[c] = sum/numberOfStudents;
         }
      }
   }
   
   //***********************************************************
   //Using the standard grading system to compute grades and 
   //stores them in the grades array.
   //***********************************************************
   private void computeGrades () {
      for (int i = 0; i < grades.length; i++){
         if (studentsTotals[i] >= 90*numberOfTests)
            grades[i] = 'A';
         else if (studentsTotals[i] >= 80*numberOfTests)
            grades[i] = 'B';
         else if (studentsTotals[i] >= 70*numberOfTests)
            grades[i] = 'C';
         else if (studentsTotals[i] >= 60*numberOfTests)
            grades[i] = 'D';
         else
            grades[i] = 'F';
      } 
   }
   
   //***********************************************************
   //Finds the student with the lowest total and stores its 
   //index in lowestScoreIndex
   //***********************************************************
   private void findStudentWithLowestTotal(){
      lowestScoreIndex = 0;
      int min = scores[0][0];
      for (int r = 0; r < scores.length; r++){
         for (int c = 0; c < scores[r].length; c++){
            if (scores[r][c] < min){
               min = scores[r][c];
               lowestScoreIndex = r; 
            }  
         }
      }
   }
   
   //***********************************************************
   //Finds the student with the highest total and stores its 
   //index in highestScoreIndex
   //***********************************************************
   private void findStudentWithHighestTotal(){
      highestScoreIndex = 0;
      int max = scores[0][0];
      for (int r = 0; r < scores.length; r++){
         for (int c = 0; c < scores[r].length; c++){ 
            if (scores[r][c] > max){
               max = scores[r][c];
               highestScoreIndex = r; 
            }
         }
      }
   }
   
   //***********************************************************
   //Prints report header with your name, current date, course 
   //name, instructor’s name, semester, year, and school name
   //***********************************************************
   private void printHeader (){
      System.out.println ("\n\tCourse Name:           \t" + "Johnnie Oldfield");
      System.out.println ("\n\tCourse Name:           \t" + courseName);
      System.out.println ("\n\tInstructor's Name:     \t" + instructorName);
      System.out.println ("\n\tSemester:              \t" + semester);
      System.out.println ("\n\tYear:                  \t" + year); 
      System.out.println ("\n\tSchool:                \t" + school);  
   }
   
   //***********************************************************
   //Prints record numbers, names, scores, totals, grades
   //***********************************************************
   private void displayStudentsRecords(){
      //Labels 
      System.out.printf  ("\n%-10s%-15s","Number","Name");
      for (int i = 0; i < numberOfTests; i++)
         System.out.printf ("%-10s", "Test" + i);
      System.out.printf ("%-10s%-10s", "Totals", "Grades");
      System.out.println ();
      //Records
      for (int r = 0; r < numberOfStudents; r++){
         //need to print record number and name
         System.out.printf ("\n%-10s%-15s", r + 1, names[r]);
         for (int c = 0; c < scores[r].length; c++){
            System.out.printf  ("%-10d",scores[r][c]);
         }
         System.out.printf ("%-10d%-10s", studentsTotals[r], grades[r]);
      System.out.println();
      }
   }
   
   //***********************************************************
   //Prints Tests averages, student complete record with the lowest
   //score, and student complete record with the highest score 
   //***********************************************************
   private void printFooter (){
      System.out.printf ("\n%-25s", "Test Average:");
      for (int i = 0; i < testsAverages.length; i++) 
         System.out.printf ("%-10.2f", testsAverages[i]);
      System.out.println ("\nStudent with the lowest score");
      System.out.printf ("%-25s", names[lowestScoreIndex]);
      for (int i = 0; i < numberOfTests; i++)
         System.out.printf ("%-10d", scores[lowestScoreIndex][i]);
      System.out.printf ("%-10d%-10s", studentsTotals[lowestScoreIndex], grades[lowestScoreIndex]);
      System.out.println ("\nStudent with the highest score");
      System.out.printf ("%-25s", names[highestScoreIndex]);
      for (int i = 0; i < numberOfTests; i++) 
         System.out.printf ("%-10d", scores[highestScoreIndex][i]);
      System.out.printf ("%-10d%-10s", studentsTotals[highestScoreIndex], grades[highestScoreIndex]);
   }
}   