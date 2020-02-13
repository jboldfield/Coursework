//********************************************************************************
//Purpose:  A driver to pass student files of different number of records 
//          and tests, in order to compute grades and display students records
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     3/20/2017
//
//Program:  MyGrades9_Tester.java
//*********************************************************************************

import java.util.*;
import java.io.*;
public class MyGrades9_Tester {
   public static void main (String [] args ) throws Exception {
      Scanner scan = new Scanner (new File ("data9A.txt"));
      MyGrades9 mc = new MyGrades9 (scan);
      Scanner scan2 = new Scanner (new File ("data9B.txt"));
      MyGrades9 mc2 = new MyGrades9 (scan2);
   }
}