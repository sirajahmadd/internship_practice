
// Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.
import java.util.Comparator;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Rectangle implements Comparable<Rectangle> {
  private double width;
  private double height;

  public int compareTo(Rectangle r) {
    if (getPerimeter() > r.getPerimeter()) {
      return 1;
    } else if (getPerimeter() < r.getPerimeter()) {
      return -1;
    } else {
      return 0;
    }
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * width + 2 * height;
  }
}

class AreaComparator implements Comparator<Rectangle> {
  public int compare(Rectangle r1, Rectangle r2) {
    if (r1.getArea() > r2.getArea()) {
      return 1;
    } else if (r1.getArea() < r2.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }
}

class RectangleComparator {
  public static void main(String args[]) {
    ArrayList<Rectangle> Rec = new ArrayList<Rectangle>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
      Rec.add(new Rectangle(sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(Rec, new AreaComparator());
    System.out.println("sorted Area in ascending order ");
    for (Rectangle Rect : Rec) {
      System.out.println(Rect.getArea());
    }

    Collections.sort(Rec);
    System.out.println("sorted Perimeter in ascending order ");
    for (Rectangle rect : Rec) {
      System.out.println(rect.getPerimeter());
    }

  }
}
