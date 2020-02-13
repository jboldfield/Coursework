//*************************************************************************
//Author:   Johnnie Oldfield & Christian Moore
//
//Course:   CS1301 A
//
//Date:     11/27/2017
//
//Purpose:  Uses command line arguments to create polygon
//          objects and displays perimeter and area of the polygons.
//*************************************************************************
public class MyRegularPolygon11_Tester{
   public static void main (String [] args){
      //Data fields
      int n1, n2;
      double s1, s2, x, y;
      
      //Populate with command arguments 
      n1 = Integer.parseInt(args[0]);
      s1 = Double.parseDouble(args[1]);
      
      n2 = Integer.parseInt(args[2]);
      s2 = Double.parseDouble(args[3]);
      x = Double.parseDouble(args[4]);
      y = Double.parseDouble(args[5]);
      
      //Create objects
      MyRegularPolygon11 polygon1 = new MyRegularPolygon11();
      MyRegularPolygon11 polygon2 = new MyRegularPolygon11(n1, s1);
      MyRegularPolygon11 polygon3 = new MyRegularPolygon11(n2, s2, x, y);
      
      //Display each object's perimeter and area
      System.out.print ("Polygon 1:");
      System.out.println ("\n\tPerimeter is:\t" + polygon1.getPerimeter() + " Area is:\t" + polygon1.getArea());
      System.out.println();
      System.out.print ("Polygon 2:");
      System.out.println ("\n\tPerimeter is:\t" + polygon2.getPerimeter() + " Area is:\t" + polygon2.getArea());
      System.out.println();
      System.out.print ("Polygon 3:");
      System.out.println ("\n\tPerimeter is:\t" + polygon3.getPerimeter() + " Area is:\t" + polygon3.getArea());
      System.out.println();
   }
}