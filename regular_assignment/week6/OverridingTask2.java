// [15:45] Lalitha Ujjaneni
//     Write a program that demonstrates the use of the super keyword in method overriding. Define a superclass called Animal with a method called speak() that prints "Animal speaks". Define a subclass called Dog that extends Animal and overrides the speak() method to print "Dog barks". In the Dog class, call the speak() method of the Animal class using the super keyword.
// ​[15:50] jaipaul palaparthi (Guest)
//     yes

class Animal{
  void  speak(){
    System.out.println("animal speaks");
  }
}
class Dog extends Animal{
  void  speak(){
    super.speak();
    System.out.println("dog barks");
  }
  
}
class OverridingTask2{
  public static void main(String args[]){
    Dog d=new Dog();
    d.speak();
  }
}



//  class Animal{​​​​​​​
//   void speak(){​​​​​​​
//     System.out.println("Animal speaks");
//   }​​​​​​​
// }​​​​​​​
// class Dog extends Animal{​​​​​​​
//   void speak(){​​​​​​​
//     super.speak();
//     System.out.println("Dog barks");
//   }​​​​​​​
// }​​​​​​​
// class Practice2{​​​​​​​
//   public static void main(String args[]){​​​​​​​
//     Dog d=new Dog();
//     d.speak();
//   }​​​​​​​
// }