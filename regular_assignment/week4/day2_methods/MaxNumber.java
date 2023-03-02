import java.util.Scanner;
class MaxNumber{
  static int maxNumber(int num1,int num2){
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String args[]){
    int max=maxNumber(12, 45);
    System.out.println(max);
  
  }
}


// import java.util.Scanner;
// class ArrayDemo{
//   static void maxNumber(int num1,int num2){
//     if(num1>num2){
//       System.out.println("num1 is big");
//     }
//     else{
//       System.out.println("num2 is big");
//     }
//   }
//   public static void main(String args[]){
//     ArrayDemo.maxNumber(12, 45);
  
//   }
// }


// class MaxNumbers{
//   static int max(){
//     int a=10,b=20;
//     if(a>b)
//       return a;
//     else 
//       return b;
//   }
//   public static void main(String args[]){
//     int result= max();
//     System.out.println("max number is "+result);
//   }
//}

// import java.util.Scanner;
// class MaxNumber{
//   static void maxNumber(){
//     int a=20,b=10;
//     if(a>b){
//       System.out.println(a);
//     }
//     else{
//       System.out.println(b);
//     }
//   }
//   public static void main(String args[]){
//     maxNumber();
  
//   }
// }