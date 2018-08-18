import java.util.Scanner;
 public class complexnumber{
  public static void main (String[] args){
    Scanner imput = new Scanner(System.in);
	System.out.println("enter you real and imagina parth of complex number");
	float a,b;
	a=imput.nextFloat();
	b=imput.nextFloat();
	complex number = new complex(a,b);
	complex number1 = new complex(4,6);
	System.out.println(" you complexnumber is "+number.getreal()+"+"+number.getimagina()+"i  and my comples are"+number1.getreal()+"+"+number1.getimagina()+"i");
	sustraction(number,number1);
	addition(number,number1);
	}
  public static void addition(complex t,complex d){
  float r,e=t.getreal()+d.getreal();
  r= t.getimagina()+d.getimagina();
  System.out.println("the addition of you complex number and my is  "+e+"+"+r+"i");
  }
  public static void sustraction(complex t,complex d){
	  float r,e ;
	  e=t.getreal() - d.getreal();
      r= t.getimagina() - d.getimagina();
  System.out.println("the sustraction of you complex number and my is "+e+"+"+r+"i");
  
  }
 }