interface Operation{
  void add();
  void sub();
  void mul();
  void div();
}
class Cal implements Operation{
  public void add(){
    int a=10,b=20;
    System.out.println(a+b);
  }
  public void sub(){
    int a=40,b=10;
    System.out.println(a-b);
  }
  public void mul(){
    int a=10,b=3;
    System.out.println(a*b);
  }
  public void div(){
    int a=10,b=2;
    System.out.println(a/b);
  }
}
class InterfaceCalculator{
  public static void main(String args[]){
    Operation op=new Cal();
    op.add();
    op.sub();
    op.mul();
    op.div();
  }
}