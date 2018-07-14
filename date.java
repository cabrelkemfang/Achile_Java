public class date{
 private int day;
 private int month;
 private int year;
 public void setday(int day){
   this.day=day;
    }
  public void setmonth(int month){
   this.month=month;
   }
  public void setyear(int year){
	this.year=year;
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
  public date(int day,int month,int year){
	this.day=day;
	this.month=month;
	this.year=year;
	}
  public date(){
	this.day=00;
	this.day=00;
	this.year=00;
	}
  public void display(){
	System.out.println("the date of to day are: "+day+"/"+month+"/"+year);
	}
}