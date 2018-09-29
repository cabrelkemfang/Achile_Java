public class piecework extends Employee{
	private double price;
	private double piece;
	public piecework(String firstName, String lastName,String socialSecurityNumber,Date birthday,double price,double piece){
		super(firstName,lastName,socialSecurityNumber,birthday);
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
   public double earnings(){
	   return getprice() * getpiece(); 
	   }
	  @Override
	  public String toString(){
		  return String.format("%s  wage :%f piece:%f ", super.toString(),getpiece(),getprice()); 
	  }
}
 