import java.util.*;

class TestCase {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter integer value");
    int n1 = sc.nextInt();
    System.out.println("enter double value");
    double n2 = sc.nextDouble();
    System.out.println("enter boolean value");
    boolean n3 = sc.nextBoolean();
    System.out.println("enter char value");
    char ch = sc.next().charAt(0);
    System.out.println("integer" + n1);
    System.out.println("double " + n2);
    System.out.println("boolean " + n3);
    System.out.println("character " + ch);

  }
}
