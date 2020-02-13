/*  Johnnie Oldfield
 *  CS 4345 (Operating Systems)
 *  Spring 2019
 *  Assignment - 1
 */

import java.util.*;
import java.io.*;

public class Thread_ArraySum {
    public static void main (String[] args){    
        String fileName = args[0];
        // Make the array:
        // Make Scanner to read file
        try{
            Scanner scan = new Scanner(new File (fileName));
            // Data field
            int rows = 0; 
            int columns = 0;
            
            while(scan.hasNextLine()){
                // Count rows
                ++rows; 
                scan.nextLine();
            }
            
            // New Scanner to read columns
            scan = new Scanner(new File(fileName));
            scan.nextLine();
            String line = scan.nextLine();
            
            //System.out.println(colScan.nextLine()); // Checks if line is correct
            // Count columns
            String[] ary = line.split("\\s+");
            columns = ary.length;
            //System.out.println(Arrays.toString(ary)); // Checks if array is correct
    

            // Populate 2D array
            //System.out.println("Rows: " + rows + "\n" + "Columns: " + columns); // Checks if rows and columns are correct
            int[][] arr = new int [rows][columns];
            scan.close();

            scan = new Scanner(new File (fileName));
            for(int i = 0; i < rows; ++i){
                for(int j = 0; j < columns; ++j){
                    if(scan.hasNextInt()){
                        arr[i][j] = scan.nextInt();
                    }
                }
            }
            scan.close();
            
            //System.out.println(Arrays.deepToString(arr)); // Prints 2D array

            // Create and run Threads
            for(int i = 0; i < rows; i++){
                rowSum r = new rowSum(arr, rows, columns, i);
                Thread t1 = new Thread(r);
                t1.start();
            }
            for(int i = 0; i < columns; i++){
                colSum c = new colSum(arr, rows, columns, i);
                Thread t2 = new Thread(c);
                t2.start();
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}
// Class to get sum of row i
class rowSum implements Runnable{
	int[][] arr;
    int rows;    // Number of rows
    int columns; // Number of columns
    int curr;    // Current thread #
    int sum = 0; // Row sum
    
    public rowSum(int[][] arr, int r, int c, int t){ this.arr = arr; rows = r; 
                                                     columns = c; curr = t;}
	
	public void run(){
        for(int i = 0; i < columns; i++){
            sum += arr[curr][i];
        }
        curr++;
        System.out.println("\tThread " + curr + " calculates row-" + curr + " sum as " + sum + ".");
    }
}
// Class to get sum of column j
class colSum implements Runnable{
    int[][] arr;    
    int rows;    // Number of rows
    int columns; // Number of columns
    int curr;    // Currenth thread #
    int sum = 0;
	
    public colSum(int[][] arr, int r, int c, int t){ this.arr = arr; rows = r;
                                       columns = c; curr = t; }
	
	public void run(){
        for(int i = 0; i < rows; i++){
            sum += arr[i][curr];
        }
        curr += rows + 1;
        System.out.println("\tThread " + curr + " calculates column-" + (curr - rows) + " sum as " + sum + ".");
    }
}