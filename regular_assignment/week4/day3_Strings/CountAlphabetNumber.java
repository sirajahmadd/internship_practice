import java.util.*;

class CountAlphabetNumber {
  
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    int acount=0,dcount=0,scount=0;
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
      {
        acount++;
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        dcount++;
      }
      else{
        scount++;
      }
    }
    System.out.println("alphabets "+acount);
    System.out.println("digits "+dcount);
    System.out.println("specila character "+scount);
  }
  public static void main(String args[]){
    characterCount("admin@123");
  }
}

// // ///abs123@%
// class CountAlphabetNumber{
//   static void count(String s){
//     char a[]=s.toCharArray();
//     int charCount=0;
//     int alphaCount=0;
//     int specialCount=0;
//     for(int i=0;i<a.length;i++){
//       if((a[i]>='a'&& a[i]<='z')||(a[i]>='A'&& a[i]<='Z')){
//         charCount++;
//       }  
//       else if(a[i]>=0 && a[i]<=9){
//         alphaCount++;
//       }
//       else{
//         specialCount++;
//       }
//     }
//     System.out.println(charCount);
//     System.out.println(alphaCount);
//     System.out.println(specialCount);
//   }
//   public static void main(String args[]){
//     count("32154@!");
//   }
  
// }