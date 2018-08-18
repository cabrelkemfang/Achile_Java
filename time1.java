//exo 8.7
import java.util.Scanner;
public class time1{
 public static void main(String[] args){
	 Scanner imput=new Scanner(System.in);
	 System.out.println("hello enter the different parameter of time");
	 int h,m,s;
	 h=imput.nextInt();
	 m=imput.nextInt();
	 s=imput.nextInt();
	 time2 ti = new time2(h,m,s);
	 displayTime("the time before the icrementation",ti);
	 ti.tick();
	 ti.increminute();
	 ti.increhour();
	 displayTime("the time after incremenetation",ti);
 }
  private static void displayTime(String header, time2 t){ 
  System.out.printf("%s%n   %s%n   %s%n",header, t.toUniversalString(), t.toString());
  } 
}
	 
	 