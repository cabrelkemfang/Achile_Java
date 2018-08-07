//exo 3.13
import java.util.Scanner;
public class myemploye{
	public static void main(String[] args){
	   Scanner imput=new Scanner(System.in);
	   employe first =new  employe();
	   employe second=new  employe("tagne", "toto", 5697);
 	   employe third=new employe();
         String fname,sename;
	  double t;
	 System.out.print("enter this infomation");
	  System.out.println("Mr:"+first.getf()+"  "+first.getl()+" and you salary are "+first.gets());
         System.out.print("for example\n");
	  System.out.println("Mr "+second.getf()+" "+second.getl()+" and you salary are: "+second.gets());
	 fname=imput.nextLine();
	 sename=imput.nextLine();
	 t=imput.nextInt();
	 third.setfname(fname);
	 third.setlname(sename);
	 third.setsal(t);
	 System.out.println("Mr "+third.getf()+" "+third.getl()+" and you salary are: "+third.gets());
	
	
	}
  }