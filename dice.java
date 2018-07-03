//exo7.17
import java.security.SecureRandom;
public class dice{
    public static void main (String[] args){
        SecureRandom random = new SecureRandom();
        int p,i;
        int[] b = new int[13] ;
        for(i=0;i<b.length;i++)
            b[i]=0;
        long  count= 36000000;
        while(count!=0){
           p = (1+ random.nextInt(6)) + (1+random.nextInt(6));//(int)(Math.random() * 10);
           switch(p){
               case 0:
                   b[0]++;
                   break;
               case 1:
                   b[1]++;
                   break;
               case 2:
                   b[2]++;
                   break;
               case 3:
                   b[3]++;
                   break;
               case 4:
                   b[4]++;
                   break;
               case 5:
                   b[5]++;
                   break;
               case 6:
                   b[6]++;
                   break;
               case 7:
                   b[7]++;
                   break;
               case 8:
                   b[8]++;
                   break;
               case 9:
                   b[9]++;
                   break;
               case 10:
                   b[10]++;
                   break;
               case 11:
                   b[11]++;
                   break;
               case 12:
                   b[12]++;
                   break;
               default:
                   System.out.println("error this is not foun");
                   System.exit(1);
           } 
           count--;
        }
        for(i=2;i<b.length;i++){
         
            System.out.print("a "+i+" and the frequency are "+b[i]+"\n");
        }
    }
}