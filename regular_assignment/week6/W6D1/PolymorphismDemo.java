class Student{
  public void read(){
    System.out.println("the name of the book is");
  }
  public void read(String name){
    System.out.println("book name is "+name);
  }
  public void copy(int num_copy){
    System.out.println("the num of copy "+num_copy);
  }
  public void both(String name,int num_copy){
    System.out.println("the name and copy is "+name+" "+num_copy);
  }
}
class PolymorphismDemo{
  public static void main(String args[]){
    Student s=new Student();
    s.read();
    s.read("siraj");
    s.copy(10);
    s.both("siraj", 10);
  }
}
