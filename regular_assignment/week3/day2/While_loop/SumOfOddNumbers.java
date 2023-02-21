import java.util.*;
class SumOfOddNumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,n,sum=0;
    System.out.println("enter te number ");
    n=sc.nextInt();
    i=0;
    while(i<=n){
      if(i%2!=0)
        sum=sum+i;
      i++;
    }
    System.out.println(sum);
  }
}