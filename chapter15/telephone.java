//exo 15.7
import java.io.File;
import java.io.PrintStream;
import java.security.SecureRandom;
public class telephone{
   public static  void main(String[] agrs)throws Exception{
	   File file = new File("t.txt");
    PrintStream ps = new PrintStream(file);
	System.setOut(ps);
	   SecureRandom randomNumbers = new SecureRandom();
        String[] a1= {"a", "b", "c"};
        String[] a2 = {"d", "e", "f"};
        String[] a3 = {"g", "h", "i"};
        String[] a4 = {"k", "l", "m"};
		String[] a5 = {"n", "o", "p"};
		String[] a6 = {"q", "r", "s"};
		String[] a7 = {"t", "u", "v"};
		String[] a8 = {"w", "x", "y"};
		int o;
		for(o=0;o<=50;o++){
		int i=randomNumbers.nextInt(3);
		int j=randomNumbers.nextInt(3);
		int k=randomNumbers.nextInt(3);
		int l=randomNumbers.nextInt(3);
		int m=randomNumbers.nextInt(3);
		int n=randomNumbers.nextInt(3);
		int p=randomNumbers.nextInt(3);
        StringBuilder sentence = new StringBuilder();
         sentence.append(a1[i])
                .append(a2[j])
                .append(a3[k])
                .append(a4[l])
                .append(a5[m])
                .append(a6[n])
                .append(a7[p])
                .append(a8[i])
                .append(".");
        System.out.printf("%s \n", sentence);
		}
   }
}   