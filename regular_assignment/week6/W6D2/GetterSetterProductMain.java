public class GetterSetterProductMain{
  public static void main(String args[]){
    Product p=new Product();
    p.setPid(10);
    p.setCost(20.25f);
    p.setName("siraj");
    System.out.println(p.getPid()+" "+p.getCost()+" "+p.getName());
  }  
}