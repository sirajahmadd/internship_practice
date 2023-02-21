import java.util.*;
class OddEvenUsingForLoop{
  public static void main(String args[]){
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println(("enter a number"));
    n=sc.nextInt();
    System.out.println("even numbes are");
    for(i=1;i<=n;i++){
      if(i%2==0)
        System.out.println(i);
    }
    System.out.println("odd numbes are");
    for(i=1;i<=n;i++){
      if(i%2!=0)
        System.out.println(i);
  }
  }
}