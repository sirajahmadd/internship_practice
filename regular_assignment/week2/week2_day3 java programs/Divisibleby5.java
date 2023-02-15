//divisible by 5
import java.util.*;
class Divisibleby5 {
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    if(num%5==0){
      System.out.println("its is divisible by 5");
    }
    else{
      System.out.println("its is  not divisible by 5");
    }
  }
}