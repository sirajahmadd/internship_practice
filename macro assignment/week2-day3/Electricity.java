
//electricity bill
import java.util.*;

class Electricity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the unit");
    double unit, bill, total_bill;
    unit = sc.nextDouble();
    if (unit <= 100) {
      bill = unit * 0.50;
    } else if (unit >= 150) {
      bill = 50 * 0.50 + (unit - 50) * 0.75;
    } else if (unit <= 250) {
      bill = 50 * 0.50 + 100 * 0.75 + 100 * 0.75 + (unit - 250) * 1.20;
    } else {
      bill = 50 * 0.50 + 100 * 0.75 + 100 * 0.75 + (unit - 250) * 1.50;
    }
    total_bill = bill + bill * 0.20;
    System.out.println("the total amount is " + total_bill);
  }
}