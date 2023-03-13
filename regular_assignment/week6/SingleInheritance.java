class Employee{
  String name;
  String address;
  int age;
  void display(){
    System.out.println(name+" "+address+" "+age);
  }
}

class Person extends Employee{
  String eDep;
  void show(){
    System.out.println(eDep);
  }
}
class SingleInheritance{
  public static void main(String args[]){
    Person p=new Person();
    p.name="siraj";
    p.address="sirsi";
    p.age=10;
    p.eDep="sales";
    p.display();
    p.show();
  }
}