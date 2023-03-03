class Format{
  public static void main(String args[]){
    float d=45.254f,d2=254.325f;
    float result=d*d2;
    String result1=String.format("%.3f",result);
    System.out.println(result1);
    String result2=String.format("%14.3f",result);
    System.out.println(result2);
    System.out.println("**********");
    System.out.println("**********");
    String result3=String.format("||%.3f||%20.3f||",result,result);
    System.out.println(result3);
    String result4=String.format("||%.3f||%20.3f||",result,result);
    System.out.println(result4);
    System.out.println("**********");
    System.out.println("**********");
    String result5=String.format("||%.2f||%-1.3f||",result,result);
    System.out.println(result5);
    String result6=String.format("||%.2f||%-1.3f||",result,result);
    System.out.println(result6);
    System.out.println("**********");
    System.out.println("**********");
    String result7=String.format("||%.50f||%-20.3f||",result,result);
    System.out.println(result7);
    String result8=String.format("||%.50f||%-20.3f||",result,result);
    System.out.println(result8);
    
  }
}

// import java.util.*;
// class StringDemo{
// public static void main(String args[]){
//   float n1=23.56f,n2=345.67f;
//   float result=n1*n2;
//   //System.out.println(result);  
//   String result1=String.format("%-12.2f%-12.2f%-12.2f",result,result,result);
//     System.out.println(result1);  
//   String result2=String.format("%-12.2f%-12.2f%-12.2f",result,result,result);
//       System.out.println(result2);
// }
// }