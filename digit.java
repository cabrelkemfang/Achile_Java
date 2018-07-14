//EXO 2.30 chapter 2
import java.util.Scanner;
 public class digit{
    public static void main (String[] args){
         Scanner imput=new Scanner(System.in);
      int c;
       long a,d=0;
        System.out.print("you number\n");
        a=imput.nextInt();
        System.out.print("the different digit are:");
        while(a!=0){
        c=(int) (a%10);
        a=a/10;
        d=d+c;
            System.out.print("\n"+c+"\n");
        }
             System.out.print("the sum of digit are\t"+d+"\n");
}
}