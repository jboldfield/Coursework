//*************************************************
//Purpose:  Practice with:
//          arrays
//          clone()
//          shuffle()
//          Selection sort
//          Quick sort
//          Linear search
//          Binary search
//          Recursions
//
//Author:   Fares
//Course:   CS 1302
//Date:     2/14/2018
//*************************************************
public class MyRecursion7{
   //**********************************************
   //1.  Declarations
   //**********************************************
   private static Integer [] oddList;
   private static Integer [] evenList;
   private static Integer [] randomOddList;
   private static Integer [] randomEvenList;
   private static Integer [] selectionSortOddList;
   private static Integer [] quickSortOddList;
   private static int selectionSortCount;
   private static int quickSortCount;
   private static int successfulLinearSearchCount;
   private static int unsuccessfulLinearSearchCount;
   private static int successfulBinarySearchCount;
   private static int unsuccessfulBinarySearchCount;

   //private static int binarySearchCount;
   //successfulBinarySearchCount
   private static int size;

   //**********************************************
   //2.  main: reading size as a command-line argument
   //    declare the needed arrays
   //**********************************************
   public static void main (String [] args){
      size = Integer.parseInt(args[0]);
      
      oddList = new Integer[size];
      evenList = new Integer[size];
      randomOddList = new Integer[size];
      randomEvenList = new Integer[size];
      selectionSortOddList = new Integer[size];
      quickSortOddList = new Integer[size];

      //3.  Create an object of Recursion7 class
      Recursion7 r = new Recursion7();
      
      //4.  populate oddList with values 1,3,5,...
      //    oddList is sorted
      r.populateOddList(oddList);
      //r.displayList(oddList);
      
      //5.  populate evenList with values 0,2,4,...
      //    evenList is sorted
      r.populateEvenList(evenList);
      //r.displayList(evenList);
      
      //6.  clone oddList into randomOddList
      //    randomOddList is still sorted
      randomOddList = r.cloneList(oddList);
      //r.displayList(randomOddList);
      
      //7.  clone evenList into randomOddList
      //    randomEvenList is still sorted
      randomEvenList = r.cloneList(evenList);
      //r.displayList(randomEvenList);
      
      //8.  shuffle randomOddList
      //    randomOddList is random now
      r.shuffleList(randomOddList);
      //r.displayList(randomOddList);
      
      //9.  shuffle randomOddList
      //    randomEvenList is random now
      r.shuffleList(randomEvenList);
      //r.displayList(randomEvenList);
      
      //10. Clone randomOddList into selectionSortOddList
      //    Use selection sort to sort selectionSortOddList
      selectionSortOddList = r.cloneList(randomOddList);
      selectionSortCount = r.selectionSort(selectionSortOddList);
      //r.displayList(selectionSortOddList);
     
      //11. Clone randomOddList into selectionSortOddList
      //    Use quick sort to sort quickSortOddList
      quickSortOddList = r.cloneList(randomOddList);
      quickSortCount = r.quickSort(quickSortOddList);
      //r.displayList(randomOddList);
      r.displayList(quickSortOddList);

      
      //12. Use linearSearch to search for all values in OddList in randomOddList 
      successfulLinearSearchCount = r.linearSearch(randomOddList, oddList);
      unsuccessfulLinearSearchCount = r.linearSearch(randomOddList, evenList);

      //13. Use binarySearch to search for all values in randomOddList in OddList 
      successfulBinarySearchCount = r.recursiveBinarySearch(randomOddList, oddList);
      unsuccessfulBinarySearchCount = r.recursiveBinarySearch(randomOddList, evenList);
      
      //14. Display counts
      System.out.printf ("\n\n\t1.\t%-40s%10d","List size:",size);
      System.out.printf ("\n\n\t2.\t%-40s%10d","Selection Sort Count:",selectionSortCount);
      System.out.printf ("\n\t3.\t%-40s%10d","Quick Sort Count:",quickSortCount);
  
      System.out.printf ("\n\n\t4.\t%-40s%10.2f","Successful Linear Search Average:",(double)successfulLinearSearchCount/size);
      System.out.printf ("\n\t5.\t%-40s%10.2f","UnSuccessful Linear Search Average:",(double)unsuccessfulLinearSearchCount/size);
      
      System.out.printf ("\n\n\t6.\t%-40s%10.2f","Successful Binary Search Average:",(double)successfulBinarySearchCount/size);
      System.out.printf ("\n\t7.\t%-40s%10.2f","UnSuccessful Binary Search Average:",(double)unsuccessfulBinarySearchCount/size);   
   }
}