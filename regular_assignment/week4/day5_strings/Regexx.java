import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
class Regexx{
  
  static boolean userName(String user){
    String regex="^[A-Za-z]\\w{5,29}$";
    Pattern p=Pattern.compile(regex);
    if(user==null){
      return false;
    }
    Matcher m=p.matcher(user);
    return m.matches();
  }
  
  static boolean pass(String pas){
    String regex="^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+ "(?=.*[@#$%^&+=])"+ 
        "(?=\\S+$).{8,20}$";
    Pattern p =Pattern.compile(regex);
    if(pas==null){
      return false;
    }
    Matcher m=p.matcher(pas);
    return m.matches();
  }

  
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int c;
      
    System.out.println("enter your choice");
    c=sc.nextInt();
    switch(c){
      case 1:
        System.out.println("enter user name");
        String str=sc.nextLine();
        System.out.println(userName(str));
        break;

      case 2:
        System.out.println("enter the password");
        String password=sc.nextLine();
        System.out.println(pass(password));
        break;

      default:
        System.err.println("invalid");
   }
  }
}