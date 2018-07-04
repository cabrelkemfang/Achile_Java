//exo 7.14
// Initializing the elements of an array to default values of zero.

import java.util.Scanner;
public class var {
    public static void main (String[] args){
        Scanner  scan = new Scanner(System.in);
        if(args.length!=3){
            int[] a=  new int[10];
            int j; /*why i can not use O before declaration inside for(O:a)
            please can you explain me again about for(int val:arrays)
            for(int k:a){
                a[k]= k*2;*/
           
            for(j=0;j< a.length;j++){
                a[j]=j*2;
                System.out.printf("%3d and the value of indxe is %5d\n" ,j,a[j]);
            }
            
        }
        /*this part does not work because i don't know how to enter the user to enter the comande line args */
        else{
            int initial=Integer.parseInt(args[1]);
            int i=Integer.parseInt(args[0]);
            int se=Integer.parseInt(args[2]);
            int[] b=new int[i];
            for(int val=0;val< b.length; val++){
                b[val]=initial+se*val;
            }
            for(int val:b){
                System.out.printf("%5d the value of index is :%4d", val,b[val]);
            }
        }
    }
}
// Initializing the elements of an array to default values of zero.