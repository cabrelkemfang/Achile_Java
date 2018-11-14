//exo 16.18
import java.util.LinkedList; 
import java.util.List; 
import java.util.ListIterator;
public class reverse{
    public static void main(String[] agrs){
     LinkedList<String> l=new LinkedList<String>();
	 LinkedList<String> lo=new LinkedList();
	 l.add("a");
	 l.add("b");
	 l.add("c");
	 l.add("d");
	 l.add("e");
	 l.add("f");
	 l.add("g");
	 l.add("h");
	 l.add("i");
	 l.add("j");
	 
	 ListIterator<String> li = l.listIterator();
      while(li.hasNext()) 
	  System.out.println(li.next());
  /* l.reverse();
   ListIterator <String>lu = l.listIterator();
	while(li.hasNext()) 
	  System.out.println(lu.next());
    */for( int i =l.size();i=0; ){
			lo.add(l.get(i));
	}
	ListIterator <String>lu = lo.listIterator();
	while(li.hasNext()) 
	  System.out.println(lu.next());
	
	 }
	}