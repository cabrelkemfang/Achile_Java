
//exo 8.12
import java.util.Scanner;
public class ttime4 {
 public static void main (String[] args){
	 Scanner imput= new Scanner(System.in);
	 System.out.println("hello you date and time");
	 int a,b,c,d,e,f;
	 a=imput.nextInt();
	 b=imput.nextInt();
	 c=imput.nextInt();
	 d=imput.nextInt();
	 e=imput.nextInt();
	 f=imput.nextInt();
	 time4 t=new time4(a,b,c,d,e,f);
	 t.tick();
	 displayTime("the time after incremenetation of second",t);
}
private static void displayTime(String header, time4 t){ 
  System.out.printf("%s%n   %s%n   %s%n",header, t.toUniversalString(), t.toString());
  }
}