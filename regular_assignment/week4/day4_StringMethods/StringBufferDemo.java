import java.util.*;
class StringBufferDemo{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    String buf=sc.nextLine();
    // StringBuffer buf2=buf.append(" messi");
    // System.out.println(buf2);
    // StringBuffer buf3=buf2.replace(0, 6, "siraj");
    // System.out.println(buf3);
    // StringBuffer buf4=buf2.delete(0, 5);
    // System.out.println(buf4);
    // System.out.println(buf);
    System.out.println("enter string");
    buf.append("hey where are you from");
    System.out.println(buf.indexOf("w"));
    
  }
}