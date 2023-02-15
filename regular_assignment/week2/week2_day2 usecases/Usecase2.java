//total cost of customer
import java.util.*;

class Usecase2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the room amount ");
    double room_rate = sc.nextDouble();
    System.out.println("enter the number of nights ");
    short nights = sc.nextShort();
    double total_cost = room_rate * nights;
    System.out.println("the total cost is " + total_cost);
  }
}