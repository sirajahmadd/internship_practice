import java.util.*;
class PrintNnumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,n;
    System.out.println("enter te number ");
    n=sc.nextInt();
    i=1;
    while(i<=n){
      System.out.println(i);
      i++;
    }
  }
}