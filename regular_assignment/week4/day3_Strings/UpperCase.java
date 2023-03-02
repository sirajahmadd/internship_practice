// class UpperCase{
//   static void convert(String s1){
//     System.out.println(s1.toUpperCase());
//   }

//   public static void main(String args[]){
//     convert("shdgkjsdbhc");
//   }
// }


// display each char
// class UpperCase{
//   static void displayCharacter(String s1){
//     char a[]=s1.toCharArray();
//     for(int i=0;i<a.length;i++){
//       System.out.println (a[i]);
//     }
    
//   }

//   public static void main(String args[]){
//     displayCharacter("shdgkjsdbhc");
//   }
// }


// reverse
// class reverseString{
//   static void convert(String s1){
//     char a[]=s1.toCharArray();
//     String rev="";
//     for(int i=a.length-1;i>=0;i--){
//       rev=rev+a[i];
      
//     }
//     System.out.println(rev);
//   }

//   public static void main(String args[]){
//     reverseString("LeonalMessi");
//   }
// }

class UpperCase{
  static void convert(String s1){
    char a[]=s1.toCharArray();
    String rev="";
    for(int i=a.length-1;i>=0;i--){
      rev=rev+a[i];
      
    }
    System.out.println(rev);
  }

  public static void main(String args[]){
    convert("LeonalMessi");
  }
}