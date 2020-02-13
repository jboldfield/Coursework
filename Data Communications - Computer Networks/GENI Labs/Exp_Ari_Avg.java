import java.io.File;  
import java.io.PrintWriter;
import java.io.FileNotFoundException;  
import java.util.Scanner;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
//import java.util.ArrayList;  
import java.io.IOException;  
import java.util.Random;

public class Exp_Ari_Avg{  	 
	 public static double expAvg(double preExpAvg, int newSample){
		double a = 0.125;
		double eRTT = (1 - a) * preExpAvg + a * newSample;
	 	return eRTT;
	 }
	 
	 public static double ariAvg(double preAriAvg, int newSample, int n){
		double eRTT = ((n-1)/(double)n) * preAriAvg + ((1/(double)n)*newSample);
	 	return eRTT;
	 }
	 
	 public static void sampleRTT2EstimatedRTT(Scanner in, PrintWriter out)throws IOException{ 
		// Initial values
		double expAvg = (int)(Math.random()*100);
		double ariAvg = (int)(Math.random()*100);
		int n = 1;
		while (in.hasNextLine()) {
			// Grab data
			String line = in.nextLine();
			Pattern p = Pattern.compile("time=([0-9]+)");
			Matcher m = p.matcher(line);
			int newSample = 0; 
			if (m.find()){
				String time = m.group(1);
				try{
					newSample = Integer.parseInt(time);
				}
				catch(Exception e){
					continue;
				}

				// Get RTTs
				double EstRTT1 = expAvg(expAvg, newSample);
				double EstRTT2 = ariAvg(ariAvg, newSample, n);

				// Output data
				out.println(newSample + "\t" + EstRTT1 + "\t" + EstRTT2);

				// Set previous averages
				expAvg = EstRTT1;
				ariAvg = EstRTT2;
				// Increment n 
				n++;
			}
			else continue;
		}
		in.close();
		out.close();
	 }
	 public static void main (String[] args){ 
	 	try{
			
			Scanner fileScanner = new Scanner(new File("data.txt")); 
			PrintWriter filePrinter = new PrintWriter(new File("output.txt"));
			
			filePrinter.print("SampleRTTs\tExpAvgs\tAriAvgs");
			filePrinter.println();
			
			sampleRTT2EstimatedRTT(fileScanner, filePrinter);
			
			fileScanner.close();
			filePrinter.close();
	
		}catch(IOException e){
			System.out.println("Error opening file.");
			System.exit(0);
		}
		
		
	 }
}  