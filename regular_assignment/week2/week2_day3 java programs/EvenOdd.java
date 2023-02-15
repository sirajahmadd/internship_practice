//enven or odd
import java.util.*;
class EvenOdd {
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println("itsbeven number");
    }
    else{
      System.out.println("its odd number");
    }
  }
}