// increament

class Increaments {
  public static void main(String args[]) {
    int a = 10;
    int y=a++ + a++ + --a + ++a;
    System.out.println(a);
    System.out.println(y);
  }
}