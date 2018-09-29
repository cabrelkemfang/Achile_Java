public abstract class Employee implements payable{
	private String firstName; 
    private	String lastName;
    private	String socialSecurityNumber;
	public String getFirstName(){
		return firstName;
	}
    public String getLastName(){
		return lastName;
	}
    public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
    public Employee(String firstName,String lastName,String socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
	}
      @Override 
	  public String toString(){
	       return String.format("firstName %s lastName :%s  socialSecurityNumber:%s\n",firstName,lastName,socialSecurityNumber); 
		  } 
       	   
}