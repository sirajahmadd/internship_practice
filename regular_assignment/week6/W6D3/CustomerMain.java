
public class CustomerMain{
  public static void main(String args[]){
    Customer c=new Customer();
    c.setCid(10);
    c.setNum_Orders(20);
    c.setCname("siraj");
    System.out.println("customer id is\n"+c.getCid());
    System.out.println("number of orders are\n"+c.getNum_Orders());
    System.out.println("customer name is\n"+c.getCname());
  }
}