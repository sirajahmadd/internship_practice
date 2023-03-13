import java.util.Scanner;
 
class Employee {
  int eid;
  String name;
  double salary;
 
  // parameterized Constructor
  Employee(int eid, String name, double salary) {
    this.eid = eid;
    this.name = name;
    this.salary = salary;
  }
  Employee(int id){
    eid=id;
  }
  Employee(){
    eid=123;
    name="lalitha";
    salary=3000;
  }
  
  Employee(double salary)
  {
    
  }  
  Employee(int id,double salary){
    
  }
  Employee(int id,String name){
    
  }
 
  void grossSalary(double hra, double da) {
    double totalSalary = hra + da + salary;
    System.out.println(totalSalary);
  }
 
  void display() {
    System.out.println(eid + " " + name + " " + salary);
    this.grossSalary(12,34);
  }
 
}
 
public class EmployeeDemo {
  public static void main(String args[]) {
    Employee st=new Employee(1234,"lalitha");
    st.display();
   
  }
}