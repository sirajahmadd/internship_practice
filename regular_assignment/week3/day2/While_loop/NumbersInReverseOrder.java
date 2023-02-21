import java.util.*;
class NumbersInReverseOrder{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,n;
    System.out.println("enter the number ");
    n=sc.nextInt();
    i=n;
    while(i>=1){
      System.out.println(i);
      i--;
    }
  }
}