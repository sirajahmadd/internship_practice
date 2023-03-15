// interface Shape{
//   void draw();  //abstract method
//   }
// class Rectangle implements Shape{
//   public void draw(){
//     System.out.println("rectangle");
//   }
// }
// class Circle implements Shape{
//   public void draw(){
//     System.out.println("rcircle");
//   }
// }
// class Interfacee{
//   public static void main(String args[]){
//     Shape s=new Rectangle();
//     s.draw();
//   }
// }

interface Shape{
  void draw();
}
class Square implements Shape{
  public void draw(){
    System.out.println("this is square");
  }
}
class Cube implements Shape{
  public void draw(){
    System.out.println("this is cube");
  }
}
class Interfacee{
  public static void main(String args[]){
    Shape square=new Square();
    Shape cube=new Cube();
    square.draw();
    cube.draw();
  }
}