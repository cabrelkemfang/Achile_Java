 //15.8
import java.io.IOException; 
 import java.lang.IllegalStateException; 
 import java.nio.file.Files; 
 import java.nio.file.Path; 
 import java.nio.file.Paths; 
 import java.util.NoSuchElementException; 
 import java.util.Scanner;  
import java.io.FileNotFoundException;    
 import java.lang.SecurityException; 
 import java.util.Formatter;   
 import java.util.FormatterClosedException;
public class stud{ 
 private static Scanner input;
 private static Formatter output;
  public static void main(String[] args) {
	  int i;
	  int[] responses = new int[11];
	  try{
    input= new Scanner(Paths.get("number.txt"));
	  for(i=0 ; i < responses.length ;i++){
		  responses[i]=input.nextInt();
	  }
	  }
     catch (IOException ioException){ 
	 System.err.println("Error opening file. Terminating."); 
	 System.exit(1); 
     }	  	
  
  int[] frequency=new int[responses.length];
  input.close();
  try { 
   output = new Formatter("result.txt");
   } 
   catch (SecurityException securityException){ 
   System.err.println("Write permission denied. Terminating."); 
   System.exit(1); 
   }       
   catch (FileNotFoundException fileNotFoundException){ 
   System.err.println("Error opening file. Terminating."); 
   System.exit(1); 
   } 
	
  for(int answer=0;answer<responses.length; answer++){
     try {        
	 ++frequency[responses[answer]];   
	 }                              
	 catch (ArrayIndexOutOfBoundsException e) {
	 System.out.println(e); 
	 System.out.printf(" responses[%d] = %d%n%n",answer, responses[answer]);          
	 }   
	 }
  System.out.printf("%s%10s%n", "Rating", "Frequency"); 
  for (int rating = 1; rating < frequency.length; rating++) 
  System.out.printf("%6d%10d%n", rating, frequency[rating]); 
  int o=0 ;
   while (o<responses.length)  { 
   o++;
   try  {  
   for (int rating = 1; rating < frequency.length; rating++) 
   output.format("%6d%10d%n", rating, frequency[rating]);
      } 
	 catch (FormatterClosedException formatterClosedException) 
      { 
	  System.err.println("Error writing to file. Terminating."); 
	  break;   
	  }         
	  catch (NoSuchElementException elementException){ 
	  System.err.println("Invalid input. Please try again."); 
	  input.nextLine(); 
	  } 
	  System.out.print("? ");	
	   if (output != null) 
     output.close();
  }
}
  }  