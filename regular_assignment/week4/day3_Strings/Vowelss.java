import java.util.*;
class Vowelss{
 
  static void checkSubString(String str1,String subString ){
    if(str1.contains(subString)){
      for(int i=0;i<subString.length()-1;i++){
        if(subString.charAt(i)=='a'||subString.charAt(i)=='e'||subString.charAt(i)=='i'||subString.charAt(i)=='o'||subString.charAt(i)=='u'){
          
          System.out.print(subString.charAt(i));
          
        }
      }  
    }
    else{
      System.out.println("invalid");
    }
  }
 
  
  public static void main(String args[]){  
    checkSubString("welcome to bitlabs","bitlabs");
    
  }
}


// class Vowelss{
//   static void vowel(String s1){
//     char a[]=s1.toCharArray();
//     int count=0;
//     for(int i=0;i<a.length;i++){
//       if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
//         count++;
//       }
//     }
//     System.out.println(count);
//   }
//   public static void main(String args[]){
//     vowel("lional messi Argentina/barcelona");
//   }
// }
