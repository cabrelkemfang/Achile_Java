//exo 17.11 a
import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List;
import java.util.Map;   
import java.util.TreeMap;   
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class invoice1{
 public static void main (String[] agrs){
	 invoice[] facture ={ 
	                        new invoice(34, "choccolate", 10,450),       
							new invoice(344, "car", 1,650),         
							new invoice(37, "table", 18,850), 
							new invoice(347, "tchup", 14,400),
							};
 List<invoice> list = Arrays.asList(facture);
 System.out.println("Complete Employee list:");
 list.stream().forEach(System.out::println);
 /*Predicate<invoice> description = e -> e.getpartdesciption();
  list.stream().filter(description)                  
               .sorted(Comparator.comparing(invoice::getpartdesciption) )  
			   .forEach(System.out::println);*/
  Function<invoice, String> description = invoice::getpartdesciption;
  Comparator<invoice> order =Comparator.comparing(description);
System.out.printf(    "%n invoice in ascending order by part description:%n");
  list.stream().sorted(order)       
              .forEach(System.out::println);
 }
}