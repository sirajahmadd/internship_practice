import java.util.*;

class StringEqualsMethod{
  
  
  static void checkString(String subString,String s1){
    if(s1.contains(subString)){      
        System.out.println("valid");
        System.out.println(subString.length());
    }
    else
      System.out.println("invalid");
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter striing 1");
    String s1=sc.nextLine();
    System.out.println("enter substring");
    String sub=sc.nextLine();
    checkString(sub,s1);
  }
}

