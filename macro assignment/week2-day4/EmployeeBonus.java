// A company gives its employees a bonus based on their performance. 
//   If an employee's performance is rated as "Excellent", they will receive a bonus of 10% of their salary.
//   If their performance is rated as "Good", they will receive a bonus of 5% of their salary. 
//   If their performance is rated as "Average", they will receive a bonus of 2% of their salary. If their performance is rated as "Poor", they will receive no bonus.

import java.util.*;
class EmployeeBonus{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    char performance;
    double bonus,salary;
    System.out.println("enter the performance of employee");
    performance=sc.next().charAt(0);
    System.out.println("enter the salary");
    salary=sc.nextDouble();
    if(performance=='E' || performance=='e'){
      bonus=salary*0.10;
      System.out.println("the bonus is " +bonus);
    }
    else if(performance=='G' || performance=='g'){
      bonus=salary*0.05;
      System.out.println("the bonus is " +bonus);
    }
    else if(performance=='A' || performance=='a'){
      bonus=salary*0.02;
      System.out.println("the bonus is " +bonus);
    }
    else
      System.out.println("improve the performance for bonus");
  }
}
