public class employe{
 private String first_name;
 private String last_name;
 private double salary;
 public void setfname(String first){
   this.first_name=first;
    }
  public void setlname(String last){
   this.last_name=last;
   }
  public void setsal(double s){
	this.salary=s;
		}
  public String getf(){
	return first_name;
	}
  public String getl(){
	return last_name;
	}
   public double gets(){
	return salary;
	}
  public employe(String first,String last,double s){
	this.first_name=first;
	this.last_name=last;
	this.salary=s;
	}
  public employe(){
	this.first_name=("you first name");
	this.last_name=("you last name");
	this.salary=0;
	}
}