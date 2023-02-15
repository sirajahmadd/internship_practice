
//check Digit_Special_Alphabet
import java.util.*;

class Digit_Special_Alphabet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the character");
    char ch = sc.next().charAt(0);
    if (Character.isDigit(ch))
      System.out.println("it is a Digit");
    else if (Character.isAlphabetic(ch))
      System.out.println("it is an Alphabet");
    else
      System.out.println("it is a Special Character");

  }
}