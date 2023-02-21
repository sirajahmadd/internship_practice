import java.util.Scanner;
class NToOne{
  public static void main(String args[]){
    int n,i=1;
    Scanner sc =new Scanner (System.in);
    n=sc.nextInt();
    for(i=n;i>=1;i--){
      System.out.println(i);
    }
  }
}