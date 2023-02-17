 // create an application that takes a two values along with operator and find the value based on operator.

import java.util.*;
class Calculator{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int num1,num2;
    double result;
    char ch;
    System.out.println("enter the first number");
    num1=sc.nextInt();
    System.out.println("enter the operator (+ ,-,*,/,%)");
    ch=sc.next().charAt(0);
    System.out.println("enter the second number");
    num2=sc.nextInt();
    switch(ch){
      case '+': 
        result=num1 +num2;
        System.out.println(result);
        break;
      case '-':
        result=num1-num2;
        System.out.println(result);
        break;
      case '*':
        result=num1*num2;
        System.out.println(result);
        break;
      case '/':
        result=num1/num2;
        System.out.println(result);
        break;
      case '%':
        result=num1%num2;
        System.out.println(result);
        break;
      default:
        System.out.println("invalid choice");
    }
  }
}