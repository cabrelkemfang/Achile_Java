//16.3
import java.util.List; 
import java.util.Arrays;
import java.util.HashSet; 
import java.util.Set;
import java.util.Collection; 
import java.util.Scanner;
public class dublicate { 
   public static void main(String[] args){
   Scanner imput=new Scanner(System.in);
   int i;
   String[] name = new String[6];
   for(i=0;i<name.length;i++){
   name[i]=imput.nextLine();
   }
   List<String> list=Arrays.asList(name);
   System.out.printf("List: %s%n", list);       
   printNonDuplicates(list); 
   }
   private static void printNonDuplicates(Collection<String> values){
     Set<String> set = new HashSet<>(values);
	 System.out.printf("%nNonduplicates are: "); 
	 for (String value : set) 
	 System.out.printf("%s ", value); 
	 System.out.println(); 
	 } 
	 } 