// to check whether a number is palindrome or not

import java.util.Scanner;
class Palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n,temp,rem,sum=0 ;
    System.out.println("enter a number");
    n=sc.nextInt();
    temp=n;
    while(n>0){
      rem=n%10;
      sum=(sum*10)+rem;
      n=n/10;
    }
    if(temp==sum)
      System.out.println("palindrome");
    else
      System.out.println("not palindrome");
  }
}