import java.util.Scanner;
class Factors{
  public static void main(String args[]){
    int num,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    num=sc.nextInt();
    i=1;
    while(i<=num/2){
      if(num%i==0)
        System.out.println(i);
      i++;
    }
  }
}