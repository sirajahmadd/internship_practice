import java.util.Scanner;
class Strong{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n,rem,fact=1,sum=0;
    System.out.println("enter a number");
    n=sc.nextInt();
    int temp=n;
    while(n>0){
      rem=n%10;
      fact=1;
      for(int i=1;i<=rem;i++){
        fact=fact*i;
      }
      sum=sum+fact;
      n=n/10;
    }
    if(temp==sum)
      System.out.println("Strong number");
    else
      System.out.println("not a strong number");
  }
}