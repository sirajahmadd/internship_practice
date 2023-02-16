// Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.


import java.util.*;
class EmployeeSalaryTax{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    double basic_sal,annual_sal,tax=0,net_sal;
    System.out.println("enter the basic salary");
    basic_sal=sc.nextDouble();
    System.out.println("annual salary is : ");
    annual_sal=basic_sal*12;
    System.out.println(annual_sal);
    if(annual_sal<300000)
      System.out.println("no tax");
    else if(annual_sal>300000 && annual_sal<600000){
      System.out.println("5% of tax is applied");
      tax=annual_sal*0.05;
    }
    else if(annual_sal>600000 && annual_sal<900000){
      System.out.println("10% of tax is applied");
      tax=annual_sal*0.10;
    }
    else if(annual_sal>900000 && annual_sal<1200000){
      System.out.println("15% of tax is applied");
      tax=annual_sal*0.15;
    }
    else if(annual_sal>1200000 && annual_sal<1500000){
      System.out.println("20% of tax is applied");
      tax=annual_sal*0.20;
    }
    else
      tax=annual_sal*0.30;
    System.out.println("the tax is "+tax);
    net_sal=annual_sal-tax;
    System.out.println("your net salary is : "+net_sal);
    
  }
}