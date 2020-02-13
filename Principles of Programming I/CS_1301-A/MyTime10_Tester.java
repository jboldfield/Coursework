//*************************************************************************
//Purpose:  Practice with Classes and Objects.
//          Invokes the TimeSkeleton class methods
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     3/27/2017
//
//*************************************************************************
public class MyTime10_Tester{
  public static void main(String[] args) {
  
    //1.  Create a Time object using the no-argument constructor
    MyTime10 time1 = new MyTime10();
   
    //2. Display time1
    System.out.println( " time1 Original values:" +
                        " Hour: " + time1.getHour() + 
                        " Minute: " + time1.getMinute() + 
                        " Second: " + time1.getSecond());


    //3. Create a seond Time object using the overloaded constructor with 
    //   a specific time in milliseconds
    MyTime10 time2 = new MyTime10(555550000);
    
    //4. Display time2
    System.out.println( " time2 Original values:" +
                        " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());
                        
    //5. Invoke incrementSecond method                       
    time2.incrementSecond();
    System.out.println (" Added values:\n" +
                        " Hour + 0 "+
                        "Minute + 0 " +
                        "Second + 1 \n" );
    
    //6. Display time2 after incrementing 1 second  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());

    //7.  incrementMinute method                          
    time2.incrementMinute();
    System.out.println (" Added values:\n" +
                        " Hour + 0 "+
                        "Minute + 1 " +
                        "Second + 0 \n" );


    //8. Display time2 after incrementing 1 minute  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());
                       
    
    //9.  Invoke incrementHour method                          
    time2.incrementHour();
    System.out.println (" Added values:\n" +
                        " Hour + 1 "+
                        "Minute + 0 " +
                        "Second + 0 \n" );

    //10. Display time2 after incrementing seconds, minutes, and hours by several values  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());
                        
    //11.  Invoke incrementSecond method with several seconds                          
    time2.incrementSecond(13);
    System.out.println (" Added values:\n" +
                        " Hour + 0 "+
                        "Minute + 0 " +
                        "Second + 13 \n" );

    //10. Display time2 after incrementing seconds, minutes, and hours by several values  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());
  
    //11.  Invoke incrementSecond method with several minutes                          
    time2.incrementMinute(50);
    System.out.println (" Added values:\n" +
                        " Hour + 0 "+
                        "Minute + 50 " +
                        "Second + 0 \n" );

    //12. Display time2 after incrementing seconds, minutes, and hours by several values  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());
   
   //13.  Invoke incrementSecond method with several hours                          
   time2.incrementHour(13);
   System.out.println (" Added values:\n" +
                        " Hour + 13 "+
                        "Minute + 0 " +
                        "Second + 0 \n" );

    //14. Display time2 after incrementing seconds, minutes, and hours by several values  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());

   //15.  Invoke incrementing seconds, minutes, and hours by several values          
   time2.incrementHour(10);
   time2.incrementMinute(50);
   time2.incrementSecond(13);
    System.out.println (" Added values:\n" +
                        " Hour + 10 "+
                        "Minute + 50 " +
                        "Second + 13 \n" );

    //10. Display time2 after incrementing seconds, minutes, and hours by several values  
    System.out.println( " Hour: " + time2.getHour() + 
                        " Minute: " + time2.getMinute() + 
                        " Second: " + time2.getSecond());
  }

}
