//*************************************************
//Purpose:  Implement and compare sorting and
//          searching algorithms to each other.
//
//Author:   Johnnie Oldfield
//          Charles Samuel
//Course:   CS 1302
//Date:     2/23/2018
//*************************************************
import java.util.Collections;
import java.util.Arrays;
public class Recursion7 {
	//Used to count comparisons
	public static int counts;
	
	//No argument constructor
	public Recursion7 () {
	
	}
	
	//Populate the array with even values starting at 0
	public void populateEvenList (Integer [] list) {
		for (int i = 0; i < list.length; i++) {
			   list[i] = i * 2;
		}
	}
	
	//Populate the array with odd values starting at 1
	public void populateOddList (Integer[] list) {   
		for (int i = 0; i < list.length; i++) {
		    list[i] = 2 * i + 1;
		}
	}
	
	//Create clone of list and return clone
	public Integer [] cloneList (Integer[] list) {
	   Integer [] clone = list.clone();
      return clone;
	}
	
	//Shuffle list
	public void shuffleList (Integer [] list) {
		Collections.shuffle(Arrays.asList(list));
	}
	
	//Uses selection sort, counts, and returns comparisons
	public int selectionSort (Integer [] list) {
      counts = 0;
      //Move through list
      for (int i = 0; i < list.length - 1; i++){
         //Find the minimum element
         int min = i;
         for (int j = i + 1; j < list.length; j++){
            //Compare
            counts++;
            if (list[j] < list[min]){
               min = j;
            }
         }
         //Swap min with first element
         int temp = list[min];
         list[min] = list[i];
         list[i] = temp;
	   }
      return counts;
   }
	
	//Uses quick sort, counts, and returns comparisons
	public int quickSort (Integer [] list) {
      counts = 0;
	   int first = 0;
      int last = list.length - 1;
      quickSort(list, first, last);
      return counts;
	}
	
	//Private method
	private void quickSort (Integer [] list, int first, int last) {
      if (first < last){
         int pi = partition(list, first, last);
         //Sorts before and after partition 
         quickSort(list, first, pi - 1);
         quickSort(list, pi + 1, last);
      }
   }//end of method
	
	//Private method to help find and return partition index
	private int partition (Integer [] list, int first, int last) {
      int pivot = list[last]; 
      int i = (first - 1);//Index of smaller element
      for (int j = first; j < last; j++){
         //Compare
         if (list[j] <= pivot){
            i++;
            //Swap
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
         }
         counts++;
      }
      //Swap
      int temp = list[i + 1];
      list[i + 1] = list[last];
      list[last] = temp;
      return i + 1;
   }
	
	//Searches all numbers in both lists and counts the comparisons
	public int linearSearch (Integer[] list1, Integer[] list2) {
      counts = 0;
      int key = 0;
      for (int i = 0; i < list1.length; i++){
         key = list1[i];
	 	   for(int j = 0; j < list2.length; j++){
            counts++;
            if(key == list2[j]){
               break;
            }
            else
               continue;
         }
      }
      return counts;
	}
	
	//Searches all values in list1 against list2 and returns comparisons
	public int recursiveBinarySearch (Integer [] list1, Integer [] list2) {
      counts  = 0;
	   int low = 0;
      int high = list1.length - 1;
      for (int i = 0; i < list1.length; i++){
         int key = list1[i];	
	      recursiveBinarySearch (list2, key, low, high);
      }
      return counts;
   }
	
	//Invoked by recursiveBinarySearch to increment number of comparisons
	private void recursiveBinarySearch (Integer [] list, int key, int low, int high) {
      if (low > high) {
         counts++;
         return;
      }
      int mid = (low + high) / 2;
      if (key < list[mid]) {
         counts++;
         recursiveBinarySearch(list, key, low, mid - 1);
      }
      else if (key == list[mid]) {
         counts++;
      }
      else {
         counts++;
         recursiveBinarySearch(list, key, mid + 1, high);
      }
	}
	
	//Displays array 8 values per line 
	public void displayList(Integer [] list) {
		for (int i = 0; i < list.length; i++){
         System.out.print (list[i] + " ");
      }
      System.out.println();
	}
  
}//End of class
