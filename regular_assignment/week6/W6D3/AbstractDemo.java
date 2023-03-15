abstract class Shape{
  int l,b;
  Shape(int l,int b){
    this.l=l;
    this.b=b;
  }
 
  //abstrat methods
  abstract void draw();
   // abstract void run();
   // abstract void area();
 
 
  //non abstarct method
  void display(){
    System.out.println(l+" "+b);
  }
  
}
class Rectangle extends Shape{
  Rectangle(int l,int b){
    super(l,b);
  }
  void draw(){
    System.out.println("rectangle");
  }
  
}
class Circle extends Shape{
  Circle(int l,int b){
    super(l,b);
  }
  void draw(){
    System.out.println("circle");
  }
}
class AbstractDemo{
  public static void main(String args[]){
    Shape s=new Rectangle(12,13);
    Shape s1=new Circle(12,34);
   s.draw();
    s1.draw();
    s.display();
  }
}