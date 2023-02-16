
// .A user is logging into a website. They can use their email address or username to log in.
//  If they use their email address, their email will be validated. If they use their username, their username will be validated.
import java.util.*;

class EmaiOrUsername {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String email, username;
    // boolean choice;
    // System.out.println("choce(mail or username)");
    // choice = sc.nextBoolean();
    // if (choice == true)
    // if(choice=="email"){}
    System.out.println("enter valid email");
    email = sc.nextLine();
    if (email.equals("sirajahmd186@gmail.com")) {
      System.out.println("valid email address");
    } else {
      System.out.println("invalid email address");
      System.out.println("-----------");
    }
    System.out.println("enter valid username");
    username = sc.nextLine();
    if (username.equals("messi")) {
      System.out.println("valid username");
    } else
      System.out.println("invalid username");
  }
}