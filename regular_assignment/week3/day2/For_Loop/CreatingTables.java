import java.util.*;
class CreatingTables{
  public static void main(String args[]){
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println(("enter a number"));
    n=sc.nextInt();
    for(i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+(n*i));
    }
    System.out.println("exit");
  }
}