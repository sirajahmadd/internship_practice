// Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.

class Sample {
  public void add(int num1, int num2) {
    int res = num1 + num2;
    System.out.println("the result is" + res);
  }

  public void add(double a, double b) {

    double res = a + b;
    System.out.println("the result is" + res);
  }

  public void add(int a, int b, long c) {
    long res = a + b + c;
    System.out.println("the result is" + res);
  }
}

class Polymorphism1 {
  public static void main(String args[]) {
    Sample s = new Sample();
    s.add(1, 2);
    s.add(2.5, 4.6);
    s.add(1, 2, 3);
  }
}
// class Sample {
//   public int  add(int a,int b){
//     return a+b;
    
//   }

//   public void add(double c, double d) {
//     double res = c+d;
//     System.out.println("the result is" + res);
//   }

//   public void add(int a, int b, long c) {
//     long res = a + b + c;
//     System.out.println("the result is" + res);
//   }
// }

// class Polymorphism1 {
//   public static void main(String args[]) {
//     Sample s = new Sample();
//     s.add(1, 3);
//     s.add(2.5, 4.9);
//     s.add(1, 2, 3);
//   }
// }