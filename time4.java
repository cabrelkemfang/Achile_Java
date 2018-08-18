public class time4{
  private int hour; 
  private int minute; 
  private int second; 
  private int month; 
  private int day; 
  private int year;
  private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
 /* public time2(){
  this(0,0,0);
  }
  public time2(int hour){
  this(hour,0,0);
  }
  public time2(int hour,int minute){
  this(hour,minute,0);
  }*/
   public time4( int day,int month ,int year,int hour,int minute,int second) {      
   if (hour < 0 || hour >= 24) 
   throw new IllegalArgumentException("hour must be 0-23");
   if (minute < 0 || minute >= 60)
   throw new IllegalArgumentException("minute must be 0-59");
   if (second < 0 || second >= 60) 
   throw new IllegalArgumentException("second must be 0-59");
    if (month <= 0 || month > 12) 
   throw new IllegalArgumentException( "month (" + month + ") must be 1-12");
   if (day <= 0 ||  (day > daysPerMonth[month] && !(month == 2 && day == 29))) 
   throw new IllegalArgumentException("day (" + day +  ") out-of-range for the specified month and year"); 
   if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
   throw new IllegalArgumentException("day (" + day +  ") out-of-range for the specified month and year"); 
   this.month = month; 
   this.day = day; 
   this.year = year;
   this.hour = hour;
   this.minute = minute; 
   this.second = second;
   //System.out.printf("You date and time is   %s%n",this);
   }
   /*public time2(time2 time){
   this(time.gethour,time.getminute,time.getsecond);
   }*/
   public void setTime(int hour, int minute, int second){
   if (hour < 0 || hour >= 24)
   throw new IllegalArgumentException("hour must be 0-23"); 
   if (minute < 0 || minute >= 60) 
   throw new IllegalArgumentException("minute must be 0-59"); 
   if (second < 0 || second >= 60)
   throw new IllegalArgumentException("second must be 0-59"); 
   this.hour = hour; 
   this.minute = minute; 
   this.second = second; 
   } 
   public void setHour(int hour){
   if (hour < 0 || hour >= 24) 
   throw new IllegalArgumentException("hour must be 0-23"); 
   this.hour = hour; 
   } 
   public void setMinute(int minute){ 
   if (minute < 0 && minute >= 60) 
   throw new IllegalArgumentException("minute must be 0-59"); 
   this.minute = minute; 
   }  
   public void setSecond(int second){ 
   if (second >= 0 && second < 60) 
   throw new IllegalArgumentException("second must be 0-59");
   this.second = second; 
   } 
   public int getHour(){
   return hour;  
   } 
   public int getMinute(){
   return minute; 
   }
   public int getSecond(){
   return second;  
   } 
   public int getday(){
   return day;  
   }
   public int getmonth(){
   return month;  
   }
   public int getyear(){
   return year;  
   }
 public String toUniversalString(){
 return String.format("%02d:%02d:%02d-%02d:%02d:%02d", getHour(), getMinute(), getSecond(),getday(),getmonth(),getyear()); 
 } 
 public String toString() {
 return String.format("%d:%02d:%02d %s-%02d:%02d:%02d", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"),getday(),getmonth(),getyear()); 
 }
  public void nextday(){
  day +=1;
  if (day >daysPerMonth[month]){
    day= 1;
    month+=1;
	if(month>12){
		month=1;
	    year+=1;
	}
   }
  }
public void tick(){
  second=second+1;
   if(second>59){
      minute+=1;
      second=0;
       if(minute>59){
         hour+=1;
          minute=0;
		  if (hour>23){
	    	hour=0;
		    nextday();
	       }
	   }
   }
 //System.out.printf("after incrementation of OF second is %s%n",this);   
} 
public void increminute(){
	minute+=1;
	if (minute>59){
		hour+=1;
		minute=0;
		if (hour>24){
		hour=0;
		nextday();
	}
	}
	//System.out.printf("after incrementation of OF minute is %s%n",this);
}
public  void increhour(){
	hour+=1;
	if (hour>24){
		hour=0;
		nextday();
	}
//System.out.printf("after incrementation of OF second is %s%n",this);
	}
}