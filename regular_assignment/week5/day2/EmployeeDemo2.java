// import java.util.Scanner;
// class EmployeeDemo2{
//   int eid;
//   String name;
//   double salary;
//   //parameterized Constructor
//   Employee(int id,String n,double sal){
//     eid=id;
//     name=n;
//     salary=sal;
//   }
 
//   void grossSalary(double hra,double da){
//     double totalSalary=hra+da+salary;
//     System.out.println(totalSalary);
//   }
 
//   void display(){
//     System.out.println(eid+" "+name+" "+salary);
//   }
  
// }
 
// public class EmployeeDemo{
//     public static void main(String args[]){
//     System.out.println("enter employee information");
//     Scanner sc=new Scanner(System.in);
//     Employee emp[]=new Employee[5];
      
//       for(int i=0;i<5;i++){
//         System.out.println("enter employee "+(i+1)+ " details");
//         emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
//       }
  
//     System.out.println("********Employee Information*********");
//       for(int i=0;i<5;i++){
//       emp[i].display();
//         System.out.println("enter hra and Da Details");
//       emp[i].grossSalary(sc.nextDouble(), sc.nextDouble());
//       }
      
//   }
// }


import java.util.Scanner;
class EmployeeDemo2{
  String name;
  int id;
  double sal;

  EmployeeDemo2(String n,int i,double s){
    name=n;
    id=i;
    sal=s;
  }

  void calculation(double da,double hra){
    System.out.println("the gross salary is :");
    double gross=sal+da+hra;
    System.out.println(gross);
  }
  
  void display(){
    System.out.println("employee name "+name+"\nemployee id"+id+"\nemployee sal"+sal);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    EmployeeDemo2 e[]=new EmployeeDemo2[1];
    for(int i=0;i<1;i++){
      System.out.println("employee"+(i+1)+"details are:");
      System.out.println("enter the name\n");
      String name=sc.next();
      System.out.println("enter the id\n");
      int id=sc.nextInt();
      System.out.println("enter the salary\n");
      double sal=sc.nextDouble();
      e[i]=new EmployeeDemo2(name,id,sal);
    }

    System.out.println("displaying employee details");
    for (int i=0;i<1;i++){
      System.out.println("enter da and hra");
      e[i].calculation(sc.nextDouble(), sc.nextDouble());
      e[i].display();
    }
  }
}