// person is eligible for vote or not

import java.util.*;
class VoteEligibility {
  public static void main(String args[]) {
    int age;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter age");
    age = sc.nextInt();
    if (age>=18){
      System.out.println("eligible");
    }
    else{
      System.out.println("not eligible");
    }
  }
}
