// Employee Management: Create a class called Employee that represents an employee and a class called Company that represents a company. The company class should have methods to add, remove, and display employees. You can also create a custom exception called InvalidSalaryException to throw when an employee's salary is below the minimum wage.
import java.util.Scanner;
class InvalidSalaryException extends Exception{
  InvalidSalaryException(String str){
    super(str);
  }
}
class Employee {
  int employee=10,tot_employee;
  double min_wage=20000;
  String name;
  int eid;
  String dep;
  void display(String name,int eid,String dep){
    System.out.println("employee name, id, and department\n");
    System.out.println(this.name=name);
    System.out.println(this.eid=eid);
    System.out.println(this.dep=dep);
  }
}
class Company extends Employee{
  void addEmployee(){
    System.out.println("\nadd two employees");
    tot_employee=employee+2;
    System.out.println("the total number of emplyees after addition is "+tot_employee);
  }
  void removeEmployee(){
    System.out.println("\nremove 2 employees");
    tot_employee=tot_employee-2;
    System.out.println("after removing 2 employe "+tot_employee);
  }
  void CustomException(double mi_wage) throws InvalidSalaryException{
    Scanner sc=new Scanner(System.in);
    System.out.println("\nenter the employee salary");
    double sal=sc.nextDouble();
    if(sal>min_wage){
      System.out.println("valid salary");
    }
    else{
      throw new InvalidSalaryException("increase the salary");
      
    }
  }
}
class CustomExceptionTask4{
  public static void main(String args[]){
    Employee e=new Employee();
    Company c=new Company();
    e.display("siraj", 10, "cse");
    c.addEmployee();
    c.removeEmployee();
    try{
      c.CustomException(20000);
    }
    catch(InvalidSalaryException f){
      System.out.println(f);
    }
  }
}



// import java.util.Scanner;
// class InvalidSalaryException extends Exception{
//   InvalidSalaryException(String str){
//     super(str);
//   }
// }
// class Employee{
//   String ename;
//   int salary;
// }
// class Company{
//   int n=3;
//   int min=10000;
//   Employee e[]=new Employee[n];
//   Scanner s=new Scanner(System.in);
//   void add() {
//      for(int i=0;i<e.length;i++){
//          e[i]=new Employee();
     
//         System.out.println("enter employee name");
//         e[i].ename=s.next();
//          System.out.println("enter Employee");
//         e[i].salary=s.nextInt();
   
     
//   }
//   }
//   void checkSalary() throws InvalidSalaryException{
//     for(int i=0;i<e.length;i++){
//     if(e[i].salary<min){
//          throw new InvalidSalaryException("Minimum slary of "+e[i].ename);
//        }
//   }
      
//   }
//   void display(){
//     for(int i=0;i<n;i++){
//         System.out.println((i+1)+". "+e[i].ename+" "+e[i].salary);
       
//       }
//   }
//   void remove(){
//      int index=-1;
   
//     System.out.println("enter employee name to remove");
//     String rem=s.next();
//     for(int i=0;i<e.length;i++){
//       if(rem.equals(e[i].ename)){
//         index=i;
//         break;
//       }
//     }
//     if(index>=0){
//       for(int i=index;i<e.length-1;i++){
//         e[i]=e[i+1];
//       }
//       n--;
//       display();
     
//     }
//     else {
//       System.out.println("Invalid name");
     
//     }
//   }
//   }
// class Calculatorr{
//   public static void main(String args[]){
   
//     Company c=new Company();
//     c.add();
//     try{
//      c.checkSalary();
//     }
//     catch(InvalidSalaryException e){
//       System.out.println(e);
//     }
//     c.remove();
//   }
// }