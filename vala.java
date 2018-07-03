//exo 7.14
import java.util.Scanner;
public class vala{
    public static void prod(int...n){
      int p=n[0],j;
      for(j=0;j<n.length;j++)
          p=p*n[j];
      System.out.print("the product are "+p);
    }
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int[] b = new int[5];
        int i;
        System.out.print("hello enter you number");
        for(i=0;i< b.length;i++){
            b[i]=scan.nextInt();
        }
        prod(b[0],b[1],b[2],b[3],b[4]);
        
    }
    
}