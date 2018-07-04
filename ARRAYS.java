//exo 17.11 b and 
import java.util.Scanner;

 public class ARRAYS{
   public static void main(String[] args){
 Scanner scanf;
 scanf=new Scanner(System.in);
 int []t;
 t=new int[10];
 int i,b,total=0;
 System.out.println("enter the element of arrays of of 10 integer");
 for(i=0;i<t.length;i++){
     t[i]=scanf.nextInt();
}
for (i=0;i< t.length;i++){
    total+=t[i];
}
System.out.println("total are\n"+total+"\n"+t.length);
}

 }

