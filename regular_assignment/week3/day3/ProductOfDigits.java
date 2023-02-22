// calculate product of digits of a number.
import java.util.Scanner;
class ProductOfDigits{
  public static void main(String args[]){
    int product=1,n,digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    while(n>0){
      digit=n%10;
      product=product*digit;
      n=n/10;
    }
    System.out.println("the product of digitd is "+product);
  }
}