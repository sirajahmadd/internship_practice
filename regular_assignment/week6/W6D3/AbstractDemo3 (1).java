// Write an abstract class "Vehicle" with an abstract method "start()" which will be implemented by its two subclasses "Car" and "Bike". Implement these classes and demonstrate how they start.

abstract class Vehicle{
  abstract void Start();
}
class Car extends Vehicle{
  void Start(){
    System.out.println("car moves");
  }
}
class Bike extends Vehicle{
  void Start(){
    System.out.println("bike moves");
  }
}
class AbstractDemo3{
  public static void main(String args[]){
    Vehicle v=new Bike();
    v.Start();
    Vehicle c=new Car();
    c.Start();
  }
}