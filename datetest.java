//EXO8.8import java.util.Scanner;
public class datetest{
 public static void main(String[] agrs){
  Scanner imput=new Scanner(System.in);
  System.out.print("please enter you date ");
  int a,b,c;
  a=imput.nextInt();
  b=imput.nextInt();
  c=imput.nextInt();
  Date8 date1=new Date8(a,b,c);
  System.out.print("you date is ");
  //date1.toString();
  date1.nextday();
 /* System.out.print("after incrementation of month the new  date is \n");
  date1.toString();*/
  }
 }