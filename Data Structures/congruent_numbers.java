
public class congruent_numbers{
   public static void main(String []args){
      double base, height, area;
      base = Double.parseDouble(args[0]) / Double.parseDouble(args[1]);
      height = Double.parseDouble(args[2]) / Double.parseDouble(args[3]);
      area = (base * height) / 2.0;
      
      if (area == (int)area)
         System.out.print("1");
      else
         System.out.print("0");
   }
}