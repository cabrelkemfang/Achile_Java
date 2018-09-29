public class comissionemployee extends employee{
	private double grossSales;
	private double commissionRate;
	public double getgrosales(){
		return grossSales;
	}
	public double getcommissionrate(){
		return commissionRate;
	}
	public  comissionemployee(String firstname ,String lastname,String socialSecurityNumber, double grossSales,double commissionRate){
		super(firstname,lastname,socialSecurityNumber);
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
	}
	@Override 
	public String toString(){
		return String.format("%s commission :%f grossSales:%f ", super.toString(),commissionRate,grossSales);
	}
}