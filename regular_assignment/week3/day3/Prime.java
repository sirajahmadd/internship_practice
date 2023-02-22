import java.util.Scanner;
class Prime{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==2){ // to check factors 
      System.out.println("prime number");
    }
    else{
      System.out.println("not prime");
    }
  }
}