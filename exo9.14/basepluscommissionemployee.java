public class basepluscommissionemployee extends comissionemployee{
	private double base ;
	public basepluscommissionemployee(String firstname ,String lastname,String socialSecurityNumber, double grossSales,double commissionRate,double base){
	super(firstname,lastname,socialSecurityNumber,grossSales,commissionRate);
	this.base=base;
    }
   public double earnings(){
	   return base+super.getgrosales()+super.getcommissionrate();
   }
}
