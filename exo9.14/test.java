public class test {
  public static void main(String[] agrs){
      comissionemployee comission=new comissionemployee("peter","jean","123",21,46);
      basepluscommissionemployee baseplus=new basepluscommissionemployee("pi","uto","323",45,67,45);
      System.out.println("employee commission infomation"+comission.toString());
     System.out.println("employe base and commission infomation"+baseplus.toString()+"and earnings"+baseplus.earnings());
  }
}