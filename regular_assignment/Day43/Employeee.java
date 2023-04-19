class Employee{
  private String name;
  private int Id;
public String getName(){
  return name;
  
} 
  public void setName(String name){
    this.name=name;
  }
  public int getId(){
    return Id;
  }
  public void setId(int Id){
    this.Id=Id;
  }

public String toString(){
return "name : "+name+" Id : "+Id;
}
}
 class Employeee{
public static void main(String args[]){
  Employee emp=new Employee();
  emp.setName("adkuoo");
  emp.setId(123);
  System.out.println(emp);
  
}}