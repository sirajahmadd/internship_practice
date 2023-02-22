// WAP to find first and last digit of a number.

// import java.util.Scanner;
// class FirstAndLastDigit{
//   public static void main(String args[]){
//     Scanner sc=new Scanner (System.in);
//     int first_digit,last_digit,n ;
//     System.out.println("enter a number");
//     n=sc.nextInt();
//     last_digit=n%10;
//     System.out.println("last digit is "+last_digit);
//     first_digit=0;
//     while(n!=0){
//       first_digit=n%10;
//       n=n/10;
//     }
//     System.out.println("first digit is "+first_digit);
//   }
// }

import java.util.*;
class FirstAndLastDigit  {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int lastdigit=n%10;
    while(n>10){
      n=n/10;
    }
    int firstdigit=n;
    System.out.println("firstdigit "+firstdigit);
    System.out.println("lastdigit "+lastdigit);
  }
}