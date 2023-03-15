class Animal{
  String name;
  String color;
  void walk(){
    System.out.println("the "+name+" of "+color+" color is walking");
  }
}
class Dog extends Animal{
  int legs;
  void bark(){
    System.out.println("bow bow");
  }
}
class BabyDod extends Dog{
  int ageBaby;
  void sleep(){
    System.out.println("the dog is sleeping");
  }
}
class Multilevel{
  public static void main(String args[]){
    BabyDod b=new BabyDod();
    b.name="naayi";
    b.color="red";
    b.legs=10;
    b.ageBaby=5;
    b.walk();
    b.bark();
    b.sleep();
  }
}