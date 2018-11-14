//exo 16.17
import java.util.LinkedList; 
import java.util.List; 
import java.util.ListIterator;
import java.security.SecureRandom;
  public class element{
    public static void main(String[] agrs){
     List la=new LinkedList();
	 SecureRandom randomNumbers = new SecureRandom();
	 int i,k;
	 for( i=0;i<25;i++){
	 int j=randomNumbers.nextInt(100);
	 la.add(j);
	 }
	// ListIterator<String> li = l.listIterator();
	 ListIterator li = la.listIterator();
      while(li.hasNext()) System.out.println(li.next());
	 }
	}
  
	 