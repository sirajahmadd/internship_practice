// class Exception2{
//   public static void main(String args[]){
//     System.out.println("hello");
//     int a[]={1,23,56,78};
//     System.out.println(a[10]);
//   }
// }

class Exception2{
  public static void main(String args[]){
    System.out.println("hello");
    int a[]={1,23,56,78};
    try{
      System.out.println(a[10]);
    }
    catch(ArrayIndexOutOfBoundsException  e){
      System.out.println(e);
    }  
    System.out.println("out of bond");
  }
}