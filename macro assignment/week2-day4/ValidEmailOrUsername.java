// A user is trying to purchase an item online. If the item is in stock and they have enough funds in their account, 
// the transaction will be processed. If the item is out of stock, they will be asked to try again later. If they donot //haveenough funds,
// they will be asked to add more money to their account. 

// .A user is logging into a website. They can use their email address or username to log in.
//  If they use their email address, their email will be validated. If they use their username, their username will be validated.
import java.util.*;
class Try2{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    String email,username;
    char ch;
    System.out.println("enter the choice (E-for email, U-for username");
    ch=sc.next().charAt(0);
    if(ch=='E'){
      System.out.println("ente the email");
      email=sc.next();
      if(email.equals("sirajahmd186@gmail.com"))
        System.out.println("valid email");
      else 
      System.out.println("invalid email");
    }
    else if(ch=='U'){
      System.out.println("ente the username");
      username=sc.next();
      if(username.equals("siraj"))
        System.out.println("valid username");
      else
        System.out.println("invalid username");
    }
    else
      System.out.println("invalid choice");
  }
}