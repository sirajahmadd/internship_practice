import java.util.TreeSet;

class TreeSetDemo {
  public static void main(String args[]) {
    TreeSet<String> t = new TreeSet<String>();
    t.add("hi");
    t.add("hello");
    t.add("null");
    System.out.println(t);
  }
}