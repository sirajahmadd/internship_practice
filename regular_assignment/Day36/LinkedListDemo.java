import java.util.LinkedList;
class LinkedListDemo{
  public static void main(String args[]){
    LinkedList<String> s=new LinkedList<String>();
    s.add("apple 🍏");
    s.add("banana 🍌");
    s.add("🍒 cherry");
    s.add("peach 🍑");
    System.out.println(s);
  }
}