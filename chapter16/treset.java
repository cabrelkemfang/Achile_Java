//exo 16.20
import java.util.Arrays;
import java.util.Set; 
import java.util.TreeSet;
import java.util.Scanner;
public class treset{
 public static void main(String[] agrs){
	 Scanner scanner = new Scanner(System.in); 
	 System.out.println("Enter a string:"); 
	 String input = scanner.nextLine();      
	 String[] tokens = input.split(" ");
	  TreeSet<String>tree = new TreeSet<>(Arrays.asList(tokens));
	   for (String s : tree) 
		   System.out.printf("%s ", s);
 }
}
 