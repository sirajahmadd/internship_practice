import java.util.*;
class SplitString{
  static void wordsSplit(String str){
   String words[]= str.split(" ");
   for(int i=0;i<words.length;i++){
     if(words[i].length()==3){
       System.out.println(words[i]);
     }
   } 
  }
  public static void main(String args[]){
    wordsSplit("hi how are you");
  }
}

// hi how are you 
// class SplitString{
//   static void splitt(String s){
//     String word[]=s.split(" ");
//     for(int i=0;i<word.length;i++){
//         System.out.println(word[i]);
//     }
//   }
//   public static void main(String args[]){
//     splitt(" hi lional andres messi");
//   }
// }