/* Johnnie Oldfield
   CS3410
   09/07/2018 
*/

import java.lang.Math;
import java.util.Arrays;
public class hw1{
   public static void main(String[] args){
      //For loop to do input values from 10 to 100000
      for (int i = 10; i <= 100000; i *= 10){
         //Create target
         int target = (int)(Math.random() * 100000) + 1;
         //Create array before time starts
         int arr[] = getArray(i);
         
         //Linear search
         System.out.println("Input size of " + i + ":");
         linearSearch(arr, target); //do search
         
         Arrays.sort(arr);  //sort for binary search
         
         //Binary search
         binarySearch(arr, target); //do search
         System.out.println("*********************");
      }//end of for loop
   }//end of main
   
   //Create and populate array
   public static int[] getArray(int s){
      int arr[] = new int[s];
      for(int i = 0; i <  s; i++)
         arr[i] = (int)(Math.random() * 100000) + 1;
      return arr;
   }//end of getArray

   public static void linearSearch(int arr[], int x){
      boolean result = false;
      long t1 = System.nanoTime();
      for (int i = 0; i < arr.length; i++){
         if (arr[i] == x)
            result = true;
      }//end of for
      long t2 = System.nanoTime();
      System.out.println("Linear Search:\t" + (t2 - t1));
      if (result == true)
         System.out.println("Search successful.");
      else
         System.out.println("Search not successful.");
   }//end of linear search
   
   public static void binarySearch(int arr[], int x){
      boolean result = false;
      int left = 0, right = arr.length - 1; 
      long t1 = System.nanoTime();
      while (left < right){ 
         int mid = (left + right)/ 2; 
         //Check if x is at mid
         if (arr[mid] == x){
            result = true;
            break;
         }
         //Check if x is greater, ignore left half 
         if (arr[mid] < x) 
            left = mid + 1; 
         //Check if x is smaller, ignore right half 
         else
            right = mid - 1; 
      }//end of while loop
      long t2 = System.nanoTime();
      System.out.println("Binary Search:\t" + (t2 - t1));
      if (result == true)
         System.out.println("Search successful.");
      else
         System.out.println("Search not successful.");
   }//end of binary search
}//end of class