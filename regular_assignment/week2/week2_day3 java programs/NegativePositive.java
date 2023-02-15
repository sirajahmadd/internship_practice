//negative or positive
import java.util.*;

class NegativePositive{
  public static void main(String[] args){
    int num1;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the  frst number");
    num1=sc.nextInt();
    if(num1>0){
       System.out.println("number is positive");
    }
    else if(num1<0){
      System.out.println("number is negative");
    }
    else{
      System.out.println(" number is zero");
      
    }
  }
}