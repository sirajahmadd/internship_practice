import java.util.*;

class StringCompare{  

static void compareString(String s1,String s2){
    if(s1.equals(s2)){
      System.out.println("are equal");
    }
    else{
      System.out.println("not equal");
    }
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter striing 1");
    String s1=sc.nextLine();
    System.out.println("enter striing 2");
    String s2=sc.nextLine();
    compareString(s1,s2);
  }
}