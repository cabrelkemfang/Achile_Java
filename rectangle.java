public class rectangle {
 private float we;
 private float le;
 private float area;
 private float perimeter;
  rectangle() { 
  }
  public void set(float we,float le){
  if(we>=0.0 && we<20)
  this.we=we;
  if(le >=0.0 && le <20 )
  this.le=le;
  }
  public void get (){
    System.out.print("the weight and lenght are"+we+"  "+le);
	}
  public void fun(){
  area=we*le;
  perimeter=(le+we)*2;
  }
  public void dis(){
  System.out.print("the area is "+area+" and the perimeter is "+perimeter);
  }
  }
 