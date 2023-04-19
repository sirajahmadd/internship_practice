class Animal{
  String color;
  int no_legs;
}
  class Dog extends Animal{
    void bark(){
      System.out.println("barking");
    }}
    class BabyDog extends Dog{
      void weep(){
        System.out.println("weeping");
      }}
      class Cat extends Animal{
        void meow(){
        System.out.println("meow");
      }}
      class Animall{
        
      public static void main(String args[]){
        Cat c=new Cat();
        BabyDog b=new BabyDog();
        Dog d=new Dog();
        d.bark();
        b.weep();
        c.meow();
      }
    }