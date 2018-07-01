/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author pahonsi
 */
import java.util.Scanner;
public class TEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        int a,b,c,s,t,d = 0;
        System.out.print("the number of you question\n");
        a = scanf.nextInt();
        while(a!=0){
            b=(int)(Math.random()*20);
            c=(int)(Math.random()*20);
            s=b+a;
            System.out.print("please answer\n"+a+"+"+b+"\n");
            t=scanf.nextInt();
            if(t==s){
                System.out.print("your answer is good\n");
                d++;
            }
            else
                System.out.print("you answer is not good\n"+"this is the good answer\n"+s);
            a--;
        }
        System.out.print("the total max are\n"+d );
        
        
    }
    
}