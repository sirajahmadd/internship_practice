//vowel
import java.util.*;
class VowelOrConsonent{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    char ch=sc.next().charAt(0);
    switch(ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("its an vowel");
        break;
      default:
        System.out.println("consonent");
    }
    
  }
}