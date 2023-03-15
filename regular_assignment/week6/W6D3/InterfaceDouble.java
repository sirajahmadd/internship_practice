interface Operation{
  void add();
  void sub();
}
interface SubOperation{
  void mul();
  void div();
  void add();
}
class Calculator implements Operation,SubOperation{
  public void add(){
    int a=10,b=20;
    System.out.println(a+b);
  }
  public void sub(){
    int a=40,b=10;
    System.out.println(a-b);
  }
  public void mul(){
    int a=10,b=5;
    System.out.println(a*b);
  }
  public void div(){
    int a=10,b=2;
    System.out.println(a/b);
  }
}
class InterfaceDouble{
  public static void main(String args[]){
    Operation op=new Calculator();
    SubOperation sp=new Calculator();
    op.add();
    op.sub();
    sp.mul();
    sp.div();
  }
}