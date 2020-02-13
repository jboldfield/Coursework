//*************************************************************************
//Author:   Johnnie Oldfield & Christian Moore
//
//Course:   CS1301 A
//
//Date:     11/10/2017
//
//*************************************************************************

class MyTime10 {
  private int hour;
  private int minute;
  private int second;

  public MyTime10() {
    this(System.currentTimeMillis());
  }

  public MyTime10(long elapsedTime) {
    setTime(elapsedTime);
  }

  public MyTime10(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }
  
  public void setTime(long elapsedTime) {
    // Obtain the total seconds since the midnight, Jan 1, 1970
    long totalSeconds = elapsedTime / 1000;

    // Compute the current second in the minute in the hour
    second = (int)(totalSeconds % 60);

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    minute = (int)(totalMinutes % 60);

    // Obtain the total hours
    int totalHours = (int)(totalMinutes / 60);

    // Compute the current hour
    hour = (int)(totalHours % 24);
  }
  
   //Increment seconds (No arguments) 
   public void incrementSecond(){
      second++;
      if (second == 60){
          minute++;
          second = 0;   
      }
   }
  
   //Increment minutes (No arguments)
   public void incrementMinute(){
      minute++;
      if (minute == 60){
          hour++;
          minute = 0; 
      }
   }
   //Increment hours (No arguments)
   public void incrementHour(){
      hour++;
      if (hour == 24){
         hour = 0;
      }
   }
  
   //Increment seconds with argument
   public void incrementSecond(int n){
      second+=n;
      if (second >= 60){
         minute+=1;
         second = second - 60; 
       }
   }
   
   //Increment minutes with argument
   public void incrementMinute(int n){
      minute+=n;
      if (minute >= 60) {
         hour+=1;
         minute = minute - 60; 
      }
   }

   //Increment hours with argument
   public void incrementHour(int n){
      hour+=n;
      if (hour >= 24) {
         hour = hour - 24; 
      }
   }
}
