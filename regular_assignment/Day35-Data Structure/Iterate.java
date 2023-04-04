// Write a Java program to create a new array list, add some colors (string) and print out the collection
// Write a Java program to iterate through all elements in a array list

import java.util.*;
class Iterate{
  public static void main(String args[]){
    List<String> s=new ArrayList<String>();
    s.add("red");
    s.add("orange");
    s.add("cherry");
    System.out.println(s);
    for(String str:s){
      System.out.println(str);
    }
  }
}