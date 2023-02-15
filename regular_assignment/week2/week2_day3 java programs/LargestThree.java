
//largest of three
import java.util.*;

class LargestThree{
  public static void main(String[] args){
    int num1,num2,num3;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the  frst number");
    num1=sc.nextInt();
    System.out.println("enter the  second number");
    num2=sc.nextInt();
    System.out.println("enter the  third number");
    num3=sc.nextInt();
    if(num1>num2 && num1>num3){
       System.out.println("frst number is bigger");
    }
    else if(num2>num3 && num2>num1){
      System.out.println("scnd number is bigger");
    }
    else{
      System.out.println("thrd number is bigger");
      
    }
  }
}