// If the user enters the correct password, they will be granted access to the system. 
//     If they enter the wrong password, they will be denied access.
import java.util.*;
class Password{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    String password;
    System.out.println("enter the  password of minimun lengthof 8 digit");
    System.out.println("password should contain atleast one special character");
    System.out.println("password should not have any spaces");
    System.out.println("password should contain atleast one number");
    System.out.println("-------------------------");
    System.out.println("enter the correct password");
    password=sc.nextLine();
    if(password.equals("messi@420")){
      System.out.println("acces granted to the system");
    }
    else
      System.out.println("access to the system is denied");
  }
}