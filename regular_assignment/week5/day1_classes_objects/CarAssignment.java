import java.util.Scanner;
class CarAssignment{
  String name,model,color;
  int year;

  void carAttributes(){
    System.out.println("the car attributes are \n*********\n ");
    System.out.println("the name of the car is -"+name);
    System.out.println("the model of the car is -"+model);
    System.out.println("the color of the car is -"+color);
    System.out.println("the car launched in the year -"+name);
      System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Car c[]=new Car[4];
    for(int i=0;i<4;i++){
      c[i]=new Car();
      System.out.println("enter the name of the car ");
      c[i].name=sc.next();
      System.out.println("enter the model of the car ");
      c[i].model=sc.next();
      System.out.println("enter the color of the car ");
      c[i].color=sc.next();
      System.out.println("enter the year car was launched ");
      c[i].year=sc.nextInt();
      System.out.println("------------");
      
      c[i].carAttributes();
    }
  }
}