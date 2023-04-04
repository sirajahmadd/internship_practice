// Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Rectangle implements Comparable<Rectangle>{
  int width,height,area;

  public int compareTo(Rectangle r){
    if(perimeterRectangle()>r.perimeterRectangle()){
      return 1;
    }
    else if(perimeterRectangle()<r.perimeterRectangle()){
      return -1;
    }
    else{
      return 0;
    }
  }

  Rectangle(int width,int height){
    this.width=width;
    this.height=height;
  }
  int areaRectangle(){
    return width*height;
  }
  int perimeterRectangle(){
    return 2*(width+height);
  }
}

class AreaComparator implements Comparator <Rectangle>{
  public int compare(Rectangle r1,Rectangle r2){
    if(r1.areaRectangle()>r2.areaRectangle()){
      return 1;
    }
    else if(r1.areaRectangle()<r2.areaRectangle()){
      return -1;
    }
    else{
      return 0;
    }
  }
}


class RectangleArea{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the widtha nd height of two rectangles");
    ArrayList<Rectangle> r=new ArrayList<Rectangle>();
    for(int i=0;i<2;i++){
      r.add(new Rectangle(sc.nextInt(),sc.nextInt()));
    }
    Collections.sort(r, new AreaComparator());
    System.out.println("the area of rectangles in ascending order are:");
    for(Rectangle rect:r){
      System.out.println(rect.areaRectangle());
    }

    Collections.sort(r);
    System.out.println("sorted perimeters in ascending order ");
    for(Rectangle rect:r){
      System.out.println(rect.perimeterRectangle());
    }
  }
}
