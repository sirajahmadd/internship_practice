// class Ways{
 
//   static void waysTocreate(){
 
//     //1 way
//     char a[]={'a','e','i','o','u'};
//     String str=new String(a);
 
//     //2nd
//     String str1 =new String("Lalitha");
//     //3rd way
//     String str2="lalitha";  //string literal    //stored in string pool
//     System.out.println(str);
//      System.out.println(str1);
//      System.out.println(str2);
    
    
//   }
//   public static void main(String args[]){
//     waysTocreate();
//   }
// }

class Ways{
  
    static void wayOne(){
      char a[]={'a','e','e'};
      String s1=new String(a);
      System.out.println(s1);
      String s2=new String("siraj");
      System.out.println(s2);
      // String s3="siraj";
      // System.out.println(s3);
      String s3="sirajjj";
      System.out.println(s3);
    }
    public static void main(String args[]){
      wayOne();
      
  }
}