// Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.

  class Shape{
    double getArea(){
      return 0.0;
    }
  }
class Circle extends Shape{
  double getArea(){
    System.out.println("area is blank "+super.getArea());
    double areaCircle;
    double pi=3.14;
    int r=5;
    areaCircle=pi*r*r;
    return areaCircle;
  }
}
class Rectangle{
  double getArea(){
    
    double l=10.0,b=5.0,areaRectangle;
    areaRectangle= l*b;
    return areaRectangle;
  }
}
class OverridingTask1{
  public static void main(String args[]){
    Circle c=new Circle();
    Rectangle r=new Rectangle();
    System.out.println("the area is "+c.getArea());
    System.out.println("the area is "+r.getArea());
  }
}