//EXO17.11 B
import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List;
import java.util.Map;   
import java.util.TreeMap;   
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class invoice2{
 public static void main (String[] agrs){
	 invoice[] facture ={ 
	                        new invoice(34, "choccolate", 10,450),       
							new invoice(344, "car", 1,650),         
							new invoice(37, "table", 18,850), 
							new invoice(347, "tchup", 14,400),
							};
 List<invoice> list = Arrays.asList(facture);
 System.out.println("Complete invoice list:");
 list.stream().forEach(System.out::println);
 fun description=(e)-> e.getprice();
//Function<invoice ,double > description = (invoice e) -> e.getprice(); the is first way
  list.stream().sorted(Comparator.comparing(invoice::getprice) )  
			   .forEach(System.out::println);
 //Function<invoice, double> price = invoice::getprice; the is other way to do it
 /* Comparator<invoice> order =Comparator.comparing(invoice::getprice);
System.out.printf(    "%n invoice in ascending order by part description:%n");
  list.stream().sorted(order)       
              .forEach(System.out::println);*/
 }
}