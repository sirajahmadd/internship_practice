import java.util.*;
class Encryption{
  public static void main(String args[]){
    String s1="",s2="";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      if(i%2==0){
        s1=s1+s.charAt(i);
      }
      else{
        s2=s2+s.charAt(i);
      }
    }
    System.out.println("encrypted string = "+s1+s2);
  }
}

//   s = sc.next();

//     for (int i = 0; i < s.length(); i++) {

//       if (i % 2 == 0) {

//         s1 = s1 + s.charAt(i);

//       } else {

//         s2 = s2 + s.charAt(i);

//       }

//     }

//     System.out.println("Encrypted String is :" + s1 + s2);

//   }

// }