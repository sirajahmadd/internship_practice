import java.util.Scanner;
class PrintReverseOfNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n,reverse=0,remainder;
    System.out.println("enter a number");
    n=sc.nextInt();
    while(n>0){
      remainder=n%10;
      reverse=(reverse*10)+remainder;
      n=n/10;
    }
    System.out.println("reverse of a number is "+reverse);
  }
}