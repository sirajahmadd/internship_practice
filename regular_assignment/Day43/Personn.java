class Person{
  private String name;
  private Int age;
 

public Person(String name,Int age){
  this.name=name;
  this.age=age;
}}


  class Address{
  private  String street;
  private String city;
  private String state;
  private Int zip;
  
   public Address(String street,String city,String state,int zip){
    this.street=street;
    this.city=city;
    this.state=state;
    this.zip=zip;
   }}
 public class Personn{
  public static void main(String args[]){
    Person p=new Person();
    p.name="amul";
    p.age=123;
    Address add=new Address();
    add.street="manglre";
    add.city="kundapura";
    add.state="karnataka";
    add.zip=12345;
     System.out.println("name: " + p.name);
        System.out.println("age: " + p.age);
        System.out.println("street: " + p.add.street);
        System.out.println("City: " + p.add.city);
        System.out.println("state: " + p.add.state);
        System.out.println("zip: " + p.add.zip);
    }
}