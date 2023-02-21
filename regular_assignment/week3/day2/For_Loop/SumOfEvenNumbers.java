import java.util.*;
class SumOfEvenNumbers{
  public static void main(String args[]){
    int i,n,even=0;
    Scanner sc=new Scanner(System.in);
    System.out.println(("enter a number"));
    n=sc.nextInt();
    for(i=0;i<=n;i=i+2){
      even=even+i;
    }
    System.out.println(even);
  }
}