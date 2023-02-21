import java.util.*;
class Tables{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,n;
    System.out.println("enter te number ");
    n=sc.nextInt();
    i=1;
    while(i<=10){
      System.out.println(n+"*"+i+"="+(i*n));
      i++;
    }
  }
}