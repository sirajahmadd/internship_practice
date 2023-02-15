//borrowing book from library 
import java.util.*;

class Usecase4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the name of borrower ");
    String name = sc.next();
    System.out.println("enter the id number ");
    int id = sc.nextInt();
    System.out.println("enter the name of author ");
    String author = sc.next();
    System.out.println("enter the name of book ");
    String book = sc.next();
    System.out.println("---------");
    System.out.println("the details are");
    System.out.println("name -"+name);
    System.out.println("id -"+id);
    System.out.println("author name -"+author);
    System.out.println("book name -"+book);
    
  }
}