// to calculate sum of digits of a number
import java.util.Scanner;
class SumofDigits{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n,digit,sum=0;
    System.out.println("enter a number");
    n=sc.nextInt();
    while(n!=0){
      digit=n%10;  // get last number
      sum=sum+digit;
      n=n/10;     //remove last digit
    }
    System.out.println("the sum of digits is "+sum);
  }
}