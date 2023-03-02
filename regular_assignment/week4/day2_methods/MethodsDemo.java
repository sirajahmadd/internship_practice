class MethodsDemo{   // without returntype and without parameters
  static void add(){
    int a=10,b=50;
    System.out.println(a+b);
  }
  public static void main(String args[]){
    add();
    
  }
}

class MethodsDemo{    //without returntype and with parameters
  static void add2(int a,int b){
    int sum=a+b;
    System.out.println(sum);
  }
  public static void main(String args[]){
    add2(100,20);
  }
}

class MethodsDemo{   // with returntype and without parameters
  static int add3(){
    int a=10,b=200;
    return a+b;
  }
  public static void main(String args[]){
    int sum=add3();
    System.out.println(sum);
  }
}

class MethodsDemo{   // with returntype and with parameters
  static int add4(int a,int b){
    return a+b;
  }
  public static void main(String args[]){
    int sum=add4(10,100);
    System.out.println(sum);
  }
}
