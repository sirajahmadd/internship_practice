// class Exception4{
//   public static void main(String args[]){
//     System.out.println("gfdgd");
//    int a=10,b=0;
//     System.out.println((a/b));
//   }
// }


  class Exception4{
  public static void main(String args[]){
    System.out.println("gfdgd");
   int a=10,b=0;
    try{
      System.out.println((a/b));
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    System.out.println("divisible by zero error");
  }
}