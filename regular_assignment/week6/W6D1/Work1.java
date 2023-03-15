// Create a class called Person with attributes name and age. Create a subclass called Employee that inherits from Person and adds attributes salary and position. Create two subclasses, Manager and Engineer, that both inherit from Employee. Add an attribute num_reports to Manager and an attribute specialization to Engineer. Create a method in Manager called hire_employee() that increments the num_reports attribute. Create a method in Engineer called solve_problem() that prints out "Problem solved!".

class Person{
  String name;
  int age;
  void display(){
    System.out.println(name+" "+age);
  }
}
class Employee extends Person{
  double sal;
  String position;
  void show(){
    System.out.println(position+" "+sal);
  }
}
class Manager extends Employee{
  int num_reports=10;
  void hire_employee(){
    System.out.println("after increament");
    int num_reportss=num_reports++;
    System.out.println(num_reportss);
  }
}
class Engineer extends Manager{
  String specialization;
  void solve_problem(){
    System.out.println("problem solved");
  }
}
class Work1{
  public static void main(String args[]){
    Engineer e=new Engineer();
    e.name="siraj";
    e.age=10;
    e.sal=50000;
    e.position="top";
    // e.num_reports=10;
    e.specialization="security";
    e.display();
    e.show();
    e.hire_employee();
    e.solve_problem();
  }
}