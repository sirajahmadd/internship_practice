
// calculate gross salary
import java.util.*;

class GrossSalary {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double basic_salary, gross_salary;
    System.out.println("enter the basic salary");
    basic_salary = sc.nextDouble();
    if (basic_salary <= 10000) {
      gross_salary= basic_salary + (basic_salary *0.2) + (basic_salary*0.8);
      System.out.println(gross_salary);
    } 
    else if (basic_salary <= 20000) {
      gross_salary = basic_salary + (basic_salary *0.25) + (basic_salary* 0.9);
      System.out.println(gross_salary);
    } 
    else {
      gross_salary = basic_salary + (basic_salary *0.3) + (basic_salary*0.95);
      System.out.println(gross_salary);
    }
  }
}