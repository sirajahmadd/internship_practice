 // Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.

class InvalidExpressionException extends Exception{
  InvalidExpressionException(String str){
    super(str);
  }
}
class Calculator{
  char op;int result,a=10,b=5;
  //addition
  void add(char op) throws InvalidExpressionException{
    if(op=='+'){
      result=a+b;
      System.out.println("after adding the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  //substraction
  void sub(char op) throws InvalidExpressionException{
    if(op=='-'){
      result=a-b;
      System.out.println("after substracting the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  //multiplication
  void mul(char op) throws InvalidExpressionException{
    if(op=='*'){
      result=a*b;
      System.out.println("after multiplying the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
  //division
  void div(char op) throws InvalidExpressionException{
    if(op=='/'){
      result=a/b;
      System.out.println("after dividing the result is "+result);
    }
    else{
      throw new InvalidExpressionException("enter valid operator");
    }
  }
}
class CustomExceptionTask3{
  public static void main(String args[]){
    Calculator operator=new Calculator();
    //addition
    try{
      operator.add('+');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    //substraction
    try{
      operator.sub('-');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    //multiplication
    try{
      operator.mul('*');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
    //division
    try{
      operator.div('/');
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
  }
}



// import java.util.Scanner;
// class InvalidExpressionException extends Exception{
//   InvalidExpressionException(String str){
//     super(str);
//   }
// }
// class Calculator{
//   Scanner s=new Scanner(System.in);
//  void operations(int a,int b) throws InvalidExpressionException{
//    System.out.println("1.Addition (+)");
//     System.out.println("2.subtraction (-)");
//     System.out.println("3.Multiplication  (*)");
//     System.out.println("4.Division  (/)");
//    System.out.println("Enter your choice");
//    char ch=s.next().charAt(0);
//    switch(ch){
//      case '+': int add=a+b;
//              System.out.println("sum is:"+add);
//        break;
//      case '-': int sub=a-b;
//              System.out.println("difference is:"+sub);
//        break;
//      case '*': int mul=a*b;
//              System.out.println("Product is:"+mul);
//        break;
//      case '/': try{
//        double div=a/b;
//        System.out.println("division is:"+div);
//      }
//        catch(ArithmeticException e){
//          System.out.println(e);
//        }
            
//        break;
//      default: throw new InvalidExpressionException("Invalid choice");
//    }
  
//  }
// }
// class Calculatorr{
//   public static void main(String args[]){
//     Calculator c=new Calculator();
   
//     try{
//     c.operations(5,5);
//     }
//     catch(InvalidExpressionException e){
//       System.out.println(e);
//     }
//   }
// }