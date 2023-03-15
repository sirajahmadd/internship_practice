class Demo {
  private int a = 10;
  private String s = "abc";
  public int c = 10;
  public String s1 = "siraj";
  char c1 = 'a';
  protected int p = 25;
  protected String s3 = "protected";

}

class DemoProtected extends Demo { // subclass for protected
  void display() {
    System.out.println("this is protected string--" + p);
    System.out.println("this is protected string--" + s3);
  }
}

class AccessModifier {
  public static void main(String args[]) {
    DemoProtected d = new DemoProtected();
    Demo d1 = new Demo(); // for private
    System.out.println("this is private-" + d1.c);
    System.out.println("this is private String-" + d1.s1);
    System.out.println("this is public-" + d.c);
    System.out.println("this is public-" + d.s1);
    System.out.println("this is default- " + d.c1);
    d.display();
  }
}