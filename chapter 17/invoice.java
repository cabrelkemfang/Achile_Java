public class invoice{
 private int partnumber;
 private String partdesciption;
 private int quantity;
 private double price;
 public invoice(int partnumber,String partdesciption,int quantity,double price){
	 this.partnumber=partnumber;
	 this.partdesciption=partdesciption;
	 this.quantity=quantity;
	 this.price=price;
 }
 public int getpartnumber(){
	 return partnumber;
 }
 public String getpartdesciption(){
	 return partdesciption;
 }
 public int getquantity(){
	 return quantity;
 }
 public double getprice(){
	 return price;
 }
 public double earning(){
	 return price*quantity;
  }
 public String toString(){ 
	  return String.format(" number: %d \t description: %s \t  quantity: %d \t price :%f \t total amount:%f", getpartnumber(), getpartdesciption(), getquantity(),getprice(),earning()); 
	  }
 }