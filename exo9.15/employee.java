public class employee{
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
    public employee(String firstName,String lastName,String socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
	}
      @Override 
	  public String toString(){
	       return String.format("firstName %s lastName :%s  socialSecurityNumber:%s",firstName,lastName,socialSecurityNumber); 
		  } 	
}