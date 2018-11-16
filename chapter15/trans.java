//15.4 a
public class trans{
 private int accountnumber;
 private double amountoftransaaction;
 public trans(){
	 this(0,0.0);
 }
 public trans(int accountnumber,double amountoftransaaction){
	 this.accountnumber=accountnumber;
	 this.amountoftransaaction=amountoftransaaction;
 }
 public int getaccount(){
	 return accountnumber;
 }
 public double getamount(){
	 return amountoftransaaction;
 }
 public void setAccount(int a){
	 accountnumber=a;
 }
 public void setAmount(double amount){
	 amountoftransaaction=amount;
 }
}
  