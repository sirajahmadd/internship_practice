// Write a Java program to create a new array list, add some colors (string) and print out the collection
import java.util.*;
class Colors {
  public static void main(String args[]){
    List<String> colors=new ArrayList<String>();
    colors.add("red");
    colors.add("black");
    colors.add("green");
    colors.add("yellow");
    System.out.println(colors.indexOf("red"));
    System.out.println(colors);
  }
}