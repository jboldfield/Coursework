package prob3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberAdder {
	
	private static final String IN_FILE_NAME = "src\\prob3\\values.txt";

	public static void main(String[] args) throws FileNotFoundException {
		
		String inFileName = IN_FILE_NAME;
		// In case file name is passed in, not sure why I made it ==2
		if(args.length == 2) {
			inFileName = args[0];
		}

		System.out.println("Sum=" + getSum(inFileName));
	}
	
	public static int getSum(String inFileName) {
		Scanner input=null;
		try {
			File f = new File(inFileName);
			input = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int sum = 0;

		while( input.hasNext() ) {
			String line = input.nextLine();
			
			if( line.charAt(0)=='s') {
				line = line.substring(1);
				int skipNum = Integer.parseInt(line);
				//System.out.println("skip num=" + skipNum);
				
				for(int j=0; j<skipNum; j++) {
					if(!input.hasNext()) break;
					input.nextLine();
				}
			}
			else {
				sum += Integer.parseInt(line);
			}
		}		
		input.close();
		return sum;
	}
	
}
