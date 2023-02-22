// WAP to find sum of first and last digit of a number.

// WAP to find first and last digit of a number.

import java.util.Scanner;
class FindSumOfFirstAndLastNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int first_digit,last_digit,n,sum=0 ;
    System.out.println("enter a number");
    n=sc.nextInt();
    last_digit=n%10;
    System.out.println("last digit is "+last_digit);
    first_digit=0;
    while(n!=0){
      first_digit=n%10;
      n=n/10;
    }
    System.out.println("first digit is "+first_digit);
    sum=first_digit+last_digit;
    System.out.println("the sum of frst and last digit is "+sum);
  }
}