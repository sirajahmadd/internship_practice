class ReverseMethod{
  static void reverseString(String s){
    StringBuffer buf=new StringBuffer(s);
    System.out.println(buf.reverse());
  }
  public static void main(String args[]){
    reverseString("messi jaris");
  }
}