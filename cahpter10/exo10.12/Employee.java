 public abstract class Employee {
  private final String firstName;
   private final String lastName;
    private final String socialSecurityNumber;
    private Date birthday ;	
     public Employee(String firstName, String lastName,String socialSecurityNumber,Date birthday){ 
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.socialSecurityNumber = socialSecurityNumber;
     this.birthday=birthday;	 
	 } 
 public String getFirstName(){ 
 return firstName; 
 }
  public String getLastName(){
  return lastName; 
  } 
 public Date getbirthday(){
        return birthday;
 }		
   public String getSocialSecurityNumber(){
      return socialSecurityNumber; 
	  }
	   @Override
	  public String toString(){ 
	  return String.format("%s %s%nsocial security number: %s and birthday %s ", getFirstName(), getLastName(), getSocialSecurityNumber(),getbirthday().toString()); 
	  }
	 public abstract double earnings();
	 }