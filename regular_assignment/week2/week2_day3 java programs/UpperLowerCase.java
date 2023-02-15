//upper or lower case
import java.util.*;
class UpperLowerCase {
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the character");
    ch=sc.next().charAt(0);
    if(Character.isUpperCase(ch))
      System.out.println("its upper case");
    else
      System.out.println("its lower case");
      
  }
}