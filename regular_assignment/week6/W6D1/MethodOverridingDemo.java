class Bank{
  int bid=12;
  public void rateOfInterest(){
    System.out.println("rate of interest is 10 rs");
  }
}
class SBI extends Bank{
  int bid=456;
  public void rateOfInterest(){
    super.rateOfInterest();
    System.out.println("rate of interest of SBI is 15rs ");
    System.out.println(bid);
    System.out.println(super.bid);
  }
}
class HDFC extends Bank{
  public void rateOfInterest(){
    
    System.out.println("rate of interest  of HDFX is 25rs ");
  }
}
class MethodOverridingDemo{
  public static void main(String args[]){
    SBI sb=new SBI();
    HDFC hd=new HDFC();
    sb.rateOfInterest();
    hd.rateOfInterest();
  }
}