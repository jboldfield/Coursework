package prob3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberAdderTest {

	@Test
	@DisplayName("Simple Sample Example")
	void testGetSum() {
		String PATH = "src//prob3//";
		String fileName = PATH + "f1.txt";
		// Put a space between each line of file.
		String vals = "1 2 3 s3 1 2 3 4";
		// Writes vals to a file, one token per line.
		writeFile(fileName,vals);
		
		int sum = NumberAdder.getSum(fileName);
		assertEquals(10,sum);
	}
	
	private static void writeFile(String fn, String vals) {
		String[] valTokens = vals.split("\\s");
		File file = new File(fn);
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			for(String val : valTokens) {
				pw.println(val);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}
