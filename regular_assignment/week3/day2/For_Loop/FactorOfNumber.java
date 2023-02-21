import java.util.Scanner;
class FactorOfNumber{
  public static void main(String args[]){
    int num,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    num=sc.nextInt();
    for(i=1;i<=num/2;i++){
      if(num%i==0)
        System.out.println(i);
    }
  }
}