//exo 16.16
import java.util.TreeSet;
 import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter a string:");
 String input = scanner.nextLine(); 
 String[] tokens = input.split(" "); 
 TreeSet<String> ts=new TreeSet<String>();
 for(int i=0;i<tokens.length;i++){
	 
 ts.add(tokens[i]);
 }
 System.out.println(ts);
}
}
