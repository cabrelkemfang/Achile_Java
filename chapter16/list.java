//exo 16.12
 import java.util.List;
import java.util.Arrays;  
 import java.util.LinkedList; 
 import java.util.ListIterator; 
 public class list{
 public static void main(String[] args){ 
 String[] colors ={"black", "yellow", "green", "blue", "violet", "silver"}; 
 List<String> list1 = Arrays.asList(colors);  
 String[] colors2 ={"gold", "white", "brown", "blue", "gray", "silver"}; 
 List<String> list2 = Arrays.asList(colors2);
  ListIterator li = list1.listIterator();
      while(li.hasNext())
	  System.out.println(li.next());
	   ListIterator la = list2.listIterator();
      while(la.hasNext()) 
	  System.out.println(la.next());
}
}           