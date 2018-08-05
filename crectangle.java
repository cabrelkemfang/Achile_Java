import java.util.Scanner;
 public class crectangle {
  public static void main (String [] args){
   float w,l;
   rectangle rect = new rectangle();
   Scanner imput = new Scanner(System.in);
   System.out.print("you weight and length");
   w= imput.nextFloat();
   l= imput.nextFloat();
   rect.set(w ,l);
   rect.get();
   rect.fun();
   rect.dis();
   }
 }