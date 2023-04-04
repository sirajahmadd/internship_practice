// Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.*;
class RetrieveElement{
  public static void main(String args[]){
    List<Integer> l=new ArrayList<Integer>();
    l.add(10);
    l.add(20);
    l.add(30);
    l.set(0, 100);
    System.out.println(l);
    System.out.println(l.indexOf(100));
  }  
}