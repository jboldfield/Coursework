/*
 *  Johnnie Olfield
 *  CS 3410
 *  Fall 2018
 */
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;
public class hw2{
   public static void main(String []args){
      System.out.print("\nMethod\t\t\t");
      for(int i = 1; i <= 10; i++)
         System.out.printf("\tRun%-7d", i);
      System.out.print("\nLinear:\t");
      //10 runs for linear search
      for(int i = 0; i < 10; i++){
         int arr[] = createArray();
         int size = arr.length;
         int target = (int)(Math.random() * 1000000) + 1;
         long t1 = System.nanoTime();  //start time 
         linSearch(arr, target, 0, size - 1);
         long t2 = System.nanoTime();  //end time
         System.out.printf("\t%10d", (t2 - t1));
      }//end of first loop
      System.out.print("\nBinary:\t");
      //10 runs for binary search
      for(int i = 0; i < 10; i++){
         int arr[] = createArray();
         int size = arr.length;
         int target = (int)(Math.random() * 1000000) + 1;
         Arrays.sort(arr); //sort array
         long t3 = System.nanoTime();
         binSearch(arr, target, 0, size - 1);
         long t4 = System.nanoTime();
         System.out.printf("\t%10d", (t4 - t3));
      }//end of second for loop
   }//end of main
   
   public static int[] createArray(){
      int arr[] = new int[(int)Math.pow(2, 20)];
      for(int i = 0; i <  arr.length; i++)
         arr[i] = (int)(Math.random() * 1000000) + 1;
      return arr;
   }//end of createArray
   
   public static int binSearch(int arr[], int target, int left, int right){
      if (right >= left){
         //set mid
         int mid = left + (right - left)/2;
         //If target is at mid
         if (arr[mid] == target)
            return mid;
         //If target is smaller than mid 
         //then ignore right
         if(arr[mid] > target)
            return binSearch(arr, target, left, mid - 1);
         //If target is greater than mid
         //then ignore left
         else
            return binSearch(arr, target, mid + 1, right);
      }//end of if
      //If target can not be found
      return -1;
   }//end of binSearch
   
   public static int linSearch(int arr[], int target, int left, int right){
      //If target can not be found
      if (right < left)
         return -1;
      //If target is at left
      if(arr[left] == target)
         return left;
      //Finds target
      return linSearch(arr, target, left + 1, right);
   }//end of linSearch
 }//end of class