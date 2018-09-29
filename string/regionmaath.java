//exo 14.4
import java.util.Scanner;
public class regionmaath{
 public static void main(String[] agrs){
  Scanner imput=new Scanner(System.in);
  String a,b;
  System.out.println("please you tho word");
  a=imput.nextLine();
  b=imput.nextLine();
  int c;
  c=imput.nextInt();
  if(a.regionMatches(true,0,b,0,c))
	  System.out.println("the" +c+"carractere of "+a+ " and" +b+ "are match");
  else 
	  System.out.println("the"+a+"and" +b+ "is not mache");
 }
 }