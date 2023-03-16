// class Exception1{
//   public static void main(String args[]){
//     String name=null;
//     System.out.println(name.length());
//   }
// }

class Exception1{
  public static void main(String args[]){
    String name=null;
    try{
      System.out.println(name.length());
    }
    catch(NullPointerException e){
      System.out.println(e);
    }
      System.out.println("it is null string");    
  }
}