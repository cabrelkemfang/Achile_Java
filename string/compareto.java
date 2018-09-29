//exo 14.3
import java.util.Scanner;
public class compareto{
 public static void main(String[] agrs){
  Scanner imput=new Scanner(System.in);
  String a,b;
  System.out.println("please you tho word");
  a=imput.nextLine();
  b=imput.nextLine();
  int c;
  c=a.compareTo(b);
  if(c==0)
	  System.out.println("the word "+a+"is equal to "+b);
  else if(c<0)
	  System.out.println("the word "+a+"is less than "+b);
  else if (c>0)
	  System.out.println("the word "+a+"is greatess than "+b);
 }
 }