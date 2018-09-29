//EXO14.19
import java.util.Scanner;
public class date{
  public static void main(String[] agrs){
  Scanner imput=new Scanner(System.in);
  String[] month={"jan","feb","mar","april","may","jun","jul","aug","sept","oct","nov","dec"};
  int m,d,year;
  System.out.println("plaese enter the date month day year");
  m=imput.nextInt();
  d=imput.nextInt();
  year=imput.nextInt();
  System.out.println("you date is : "+month[m-1]+"/"+d+"/"+year);
  }
  }
  