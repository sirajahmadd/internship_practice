// class StringContainsSpecialChar{
//   static void validString(String s1){
//     if(s1.contains("@")){
//       System.out.println("valid");
//     }
//     else
//       System.out.println("invalid");
//   }
//   public static void main(String args[]){
//     validString("@Lalitha");
//   }
// }
import java.util.*;
class StringContainsSpecialChar{
  static void validString(String s1){
    if(s1.contains("@")){
      System.out.println("valid - "+s1.indexOf("@"));
    }
    else
      System.out.println("invalid");
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String s1=sc.nextLine();
    // System.out.println("substring");
    // String sub=sc.nextLine();
    validString(s1);
  }
}