public class piecework extends Employee{
	private double price;
	private double piece;
	public piecework(String firstName, String lastName,String socialSecurityNumber,double price,double piece){
		super(firstName,lastName,socialSecurityNumber);
		this.price=price;
		this.piece=piece;
	}
	public double getprice(){
		return price;
	}
	public double getpiece(){
	    return piece;
	}
	@Override                      
   public double getpayementamount(){
	   return getprice() * getpiece(); 
	   }
	  @Override
	  public String toString(){
		  return String.format("%s , price :%f  ,number of piece:%f ", super.toString(),price,piece); 
	  }
}
 