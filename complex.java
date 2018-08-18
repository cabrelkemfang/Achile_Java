public class complex{
 private float real;
 private float imagina;
   public complex(){
  this(0,0);
  }
 public complex(float real){
  this(real,0);
  }
 public complex(float real,float imagina){
  this.real=real;
  this.imagina=imagina;
  }
 public float getreal(){
  return real;
  }
  public float getimagina(){
   return imagina;
   }
}