// Create an interface Shape with the following methods:
// public double area();
// public double perimeter();
// Create classes Circle, Rectangle, and Triangle that implement this interface.


// import java.util.Scanner;
// interface Shape{
//   public double area();
//   public double perimeter();
// }
// class Circle implements Shape{
//   public double area(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the radius\n");
//     float r=sc.nextFloat();
//     float pi=3.14f;
//     double area=pi*r*r;
//     return area;
//   }
//   public double perimeter(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the radius");
//     float r=sc.nextFloat();
//     float pi=3.14f;
//     double perimeter=2*pi*r;
//     return perimeter;
//   }
// }

// class Rectangle implements Shape{
//   public double area(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the length and bredth \n");
//     float l=sc.nextFloat();
//     float b=sc.nextFloat();
//     double area=l*b;
//     return area;
//   }
//   public double perimeter(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter lenth n bredth\n");
//     float l=sc.nextFloat();
//     float b=sc.nextFloat();
//     double perimeter=2*(l+b);
//     return perimeter;
//   }
// }
// class InterfaceAssignment1{
//   public static void main(String args[]){
//     Shape circle=new Circle();
//     Shape rectangle=new Rectangle();
//     circle.area();
//     System.out.println(circle.area);
//     circle.perimeter();
//     rectangle.area();
//     rectangle.perimeter();
//   }
// }

import java.util.Scanner;
interface Shape{
  public void area();
  public void perimeter();
}
class Circle implements Shape{
  public void area(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius\n");
    float r=sc.nextFloat();
    float pi=3.14f;
    double area=pi*r*r;
    System.out.println("area is "+area);
  }
  public void perimeter(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius");
    float r=sc.nextFloat();
    float pi=3.14f;
    double perimeter=2*pi*r;
    System.out.println("perimiter is "+perimeter);
  }
}

class Rectangle implements Shape{
  public void area(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length and bredth \n");
    float l=sc.nextFloat();
    float b=sc.nextFloat();
    double area=l*b;
    System.out.println("area is\n"+area);
  }
  public void perimeter(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter lenth n bredth\n");
    float l=sc.nextFloat();
    float b=sc.nextFloat();
    double perimeter=2*(l+b);
    System.out.println("perimiter is \n"+perimeter);
  }
}
class InterfaceAssignment1{
  public static void main(String args[]){
    Shape circle=new Circle();
    Shape rectangle=new Rectangle();
    circle.area();
    circle.perimeter();
    rectangle.area();
    rectangle.perimeter();
  }
}

