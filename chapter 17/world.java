
//exo 17.12
import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class world{
 public static void main(String[] agrs){
	 Scanner scanner =new Scanner(System.in);
	 String input = scanner.nextLine();
	 System.out.println("you sentence");
	 String[] tokens = input.split(" ");
	 System.out.printf("strings in uppercase: %s%n",
	 Arrays.stream(tokens)
	      .map(String::toUpperCase)
		  .sorted()
		  .distinct()
	     .collect(Collectors.toList()));
 }
}
  