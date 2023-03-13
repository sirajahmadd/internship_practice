import java.util.Scanner;
class RectangleParamaterizedCostructor{
  int length,width,area,perimeter;

  RectangleParamaterizedCostructor(int l,int w){
    length=l;
    width=w;
  }

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
    RectangleParamaterizedCostructor r=new RectangleParamaterizedCostructor(10,20);
    r.area();
    r.perimeter();
    }
  }