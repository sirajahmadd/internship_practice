class Animal{
  public void makeSound(){
    System.out.println("The animal makes a sound");
  }
}

 

//Add Horse class that extends Animal class
class Horse extends Animal{
  public void makeSound(){
    System.out.println("The Horse says: wee wee");
  }
}

 

//Add Cat class that extends Animal class
class Cat extends Animal{
  public void makeSound(){
    System.out.println("The Cat says: meow meow");
  }
}

 

class  AnimalInheritance {
 public static void main(String[] args){
//Add main method here

 

//Create all 3 Animal objects and add to an array 
    Animal animal[]=new Animal[3];
    animal[0] = new Animal();
    animal[1] = new Horse();
    animal[2] = new Cat();
//Loop over the array and print sound it makes
    for(int i=0;i<3;i++){
      animal[i].makeSound();
    }
    }
 }