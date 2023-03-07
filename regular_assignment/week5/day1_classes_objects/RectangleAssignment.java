import java.util.Scanner;
class RectangleAssignment{
  int length,width,area,perimeter;

  void area(){
    System.out.println("the area of rectangle is :");
    area=length*width;
    System.out.println(area);
  }

  void perimeter(){
    System.out.println("the perimeter of rectangle is :");
    perimeter=2*length + 2* width;
    System.out.println(perimeter);
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Rectangle r[]=new Rectangle[2];
    for(int i=0;i<2;i++){
      r[i]=new Rectangle();
      System.out.println("enter the length of rectangle ");
      r[i].length=sc.nextInt();
      System.out.println("enter the width of the rectangle ");
      r[i].width=sc.nextInt();
      r[i].area();
      r[i].perimeter();
    }
  }
}