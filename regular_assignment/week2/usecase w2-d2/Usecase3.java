//students grade
import java.util.*;

class Usecase3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the garede of subject one ");
    int s1 = sc.nextInt();
    System.out.println("enter the garede of subject two ");
    int s2 = sc.nextInt();
    System.out.println("enter the garede of subject three ");
    int s3 = sc.nextInt();
    int avg=(s1+s2+s3)/3;
    System.out.println("the avg garede is "+avg);
  }
}