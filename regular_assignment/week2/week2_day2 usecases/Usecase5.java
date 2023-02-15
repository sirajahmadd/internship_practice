//total bill of a customer
import java.util.*;

class Usecase5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the cost of food ");
    double cost_food= sc.nextDouble();
    System.out.println("enter the tax percentage ");
    double tax_per =sc.nextDouble();
    double tax=(cost_food*tax_per)/100;
    System.out.println("enter the tip amount");
    int tip= sc.nextInt();
    double total_bill=cost_food+tax +tip;
    System.out.println("--------");
    System.out.println("the total bill is "+total_bill);
  }
}