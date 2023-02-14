class TypeCasting {
  public static void main(String args[]) {
    byte b = 123;
    int i = b; // widening
    System.out.println(i);
    short s = 123;
    byte v = (byte) s;// narrowing
    System.out.println(v);
    float f = 2553.2584f;
    int r = (int) f; // narrowing (explicit)
    System.out.println(r);
  }
}
