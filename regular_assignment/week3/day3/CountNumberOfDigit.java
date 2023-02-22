// WAP to count number of digits in a number.

import java.util.Scanner;
class CountNumberOfDigit{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n,count;
    System.out.println("enter a number");
    n=sc.nextInt();
    count=0;
    while(n!=0){
      n=n/10;    //remove last digit
      count++;   
    }
    System.out.println("the numbers of digits are "+count);
  }
}