//exo 15.8
import java.io.FileNotFoundException;    
 import java.lang.SecurityException; 
 import java.util.Formatter;   
 import java.util.FormatterClosedException;
 import java.util.NoSuchElementException ;
 import java.util.Scanner;                 
 public class CreateTextFile  { 
   private static Formatter output;
   public static void main(String[] args){ 
   openFile(); 
   addRecords(); 
   closeFile(); 
   } 
   public static void openFile() { 
   try { 
   output = new Formatter("number.txt");
   } 
   catch (SecurityException securityException){ 
   System.err.println("Write permission denied. Terminating."); 
   System.exit(1); 
   }       
   catch (FileNotFoundException fileNotFoundException){ 
   System.err.println("Error opening file. Terminating."); 
   System.exit(1); 
   } 
   }    
   public static void addRecords() {
   Scanner input = new Scanner(System.in); 
   System.out.printf("please enter your sequence of number"); 
   while (input.hasNext())  { 
   try  {  
   output.format("%d ", input.nextInt());
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
	  } 
	  } 
	  public static void closeFile() { 
	  if (output != null) 
     output.close();
	 }
	 }