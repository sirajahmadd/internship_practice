import java.util.*;
class OddAndEvenNumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,n;
    System.out.println("enter te number ");
    n=sc.nextInt();
    i=1;
    System.out.println("odd numbers are");
    while(i<=n){
      if(i%2!=0)
        System.out.println(i);
      i++;
    }
    System.out.println("even numbers are");
    i=1;
    while(i<=n){
      if(i%2==0)
        System.out.println(i);
      i++;
    }
  }
}