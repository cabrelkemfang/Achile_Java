//exo3.14
import java.util.Scanner;
public class mydate{
	public static void main(String[] args){
	   Scanner imput=new Scanner(System.in);
	   date first =new  date();
	    date second=new date();
            int days,months,years;
	 System.out.println("enter the follow infomation for example");
	  second.display();
	 System.out.println("enter the day");
	 days = imput.nextInt();
	 first.setday(days);
	  System.out.println("enter the month");
	  months=imput.nextInt();
         first.setmonth(months);
         System.out.println("enter the year");
	 years=imput.nextInt();
	 first.setyear(years);
	 first.display();
	 System.out.println("without display today is the "+first.getday()+"/"+first.getmonth()+"/ "+first.getyear());
	
	
	}
  }