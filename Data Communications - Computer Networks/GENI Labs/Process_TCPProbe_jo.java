import java.io.File;  
import java.io.PrintWriter;
import java.io.FileNotFoundException;  
import java.io.RandomAccessFile;  
import java.util.Scanner;
import java.io.IOException;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Iterator;;

public class Process_TCPProbe_jo {
    public static String[] getPatterns(String s1, String s2, String s3){
        String[] patterns = new String[3];
        patterns[0] = s1.replaceAll("\\D+","");
        patterns[1] = s2.replaceAll("\\D+","");
        patterns[2] = s3.replaceAll("\\D+","");
        return patterns;
    }
    public static String toComma(String s){
        String newS = s.replaceAll("\\s+", ",");
        return newS;
    }
    public static void main(String[] args){
        try{
            Scanner fileScanner = new Scanner(new File(args[0])); 
            PrintWriter fp1 = new PrintWriter(new File(args[1]));
            PrintWriter fp2 = new PrintWriter(new File(args[2]));
            PrintWriter fp3 = new PrintWriter(new File(args[3]));
            
            String[] patterns = getPatterns(args[1], args[2], args[3]);
            ArrayList<String> lines = new ArrayList<String>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.add(toComma(line));
            }
            fileScanner.close();
        
            lines.remove(lines.size()-1);

            for (int counter = 0; counter < lines.size(); counter++){
                String line = lines.get(counter);
                Pattern p1 = Pattern.compile(":"+patterns[0]);
                Matcher m1 = p1.matcher(line);
                Pattern p2 = Pattern.compile(":"+patterns[1]);
                Matcher m2 = p2.matcher(line);
                Pattern p3 = Pattern.compile(":"+patterns[2]);
                Matcher m3 = p3.matcher(line);
                
                if (m1.find()){
                    fp1.println(line);;
                }
                if (m2.find()){
                    fp2.println(line);
                }
                if (m3.find()){
                    fp3.println(line);
                }
            }
            fp1.close();
            fp2.close();
            fp3.close();
        }catch(IOException e){
			System.out.println("Error opening file.");
			System.exit(0);
        }
    }
}