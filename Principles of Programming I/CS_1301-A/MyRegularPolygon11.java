//*************************************************************************
//Author:   Johnnie Oldfield & Christian Moore
//
//Course:   CS1301 A
//
//Date:     11/27/2017
//
//Purpose:  Creates n-sided polygons and get it's perimeter and area.
//*************************************************************************

public class MyRegularPolygon11{
   //Data fields
   private int n = 3;
   private double side = 1;
   private double x = 0;
   private double y = 0;
   
   //No argument constructor
   public MyRegularPolygon11(){
   }
   
   //Constructor with number of sides and length of sides
   public MyRegularPolygon11(int n, double side){
      this.n = n;
      this.side = side;
   }
   
   //Constructor with all data fields 
   public MyRegularPolygon11(int n, double side, double x, double y){
      this.n = n;
      this.side = side;
      this.x = x;
      this.y = y;
   }
   
   //Accsesors
   public int getN(){
      return n;
   }
   
   public double getSide(){
      return side;
   }
   
   public double getX(){
      return x;
   }
   
   public double getY(){
      return y;
   }
   
   //Mutators 
   public void setN(int newN){
      n = newN;
   }
   
   public void setSide(double newSide){
      side = newSide;
   }
   
   public void setX(double newX){
      x = newX;
   }
   
   public void setY(double newY){
      y = newY;
   }
   
   //Get perimeter of polygon (Sum of all sides)
   public double getPerimeter(){
      return side * n;
   }
   
   //Get area of polygon
   public  double getArea(){
      return (n*side*side)/(4*Math.tan(Math.PI/n));
   }
}
