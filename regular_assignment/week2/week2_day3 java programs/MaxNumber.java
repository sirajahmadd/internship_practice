//emax of a number
import java.util.*;
class MaxNumber {
  public static void main(String args[]){
    int num1,num2;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the  frst number");
    num1=sc.nextInt();
    System.out.println("enter the  second number");
    num2=sc.nextInt();
    if(num1>num2){
      System.out.println("frst number is bigger");
    }
    else{
      System.out.println("second number is bigger");
    }
  }
}