//exo 16.18
import java.util.LinkedList; 
import java.util.List; 
import java.util.ListIterator;
public class riverse{
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
  /* String[] la = l;
   la.reverse();
   
   LinkedList<String> lo=la;
   
   ListIterator <String>lu = la.listIterator();
	while(li.hasNext()) 
	  System.out.println(lu.next());*/
    int i =l.size();
    while (i>0){
		i--;
		String u=l.get(i);
			lo.add(u);
	}
	ListIterator <String>lu = lo.listIterator();
	while(lu.hasNext()) 
	  System.out.println(lu.next());
	 }
	}