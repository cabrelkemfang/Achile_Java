import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List;
import java.util.Map;   
import java.util.TreeMap;   
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class invoice3{
 public static void main (String[] agrs){
	 invoice[] facture ={ 
	                        new invoice(34, "choccolate", 10,450),       
							new invoice(344, "car", 1,650),         
							new invoice(37, "table", 18,850), 
							new invoice(347, "tchup", 14,400),
							};							
 List<invoice> list = Arrays.asList(facture);
 tum ap =(l)-> {
            	 String lo=l.getpartdesciption();
                  int lu=l.getquantity() ;
				  HashMap<String,int> li=new HashMap<String,int>();
                 return li.put(lo,lu);
				             };/*
				System.out.println("%nEmployees in descending order by last name then first:%n", Map.stream().sorted(Comparator.comparing(invoice::getquantity))
				                                                                                              .forEach(System.out::println));
 /*list.stream().sorted(Comparator.comparing(map) )  
			   .forEach(System.out::println);
 /*System.out.println("Complete Employee list:");
 list.stream().forEach(System.out::println);*/
System.out.printf("Original strings: %s%n",list.stream().map(ap)
                           .collect(Collectors.toMap(list)));
		
 }
}