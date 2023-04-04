// Write a Java program to check if a particular key is present in a Map

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
class MapDemo{
  public static void main(String args[]){
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
    map.put(10,100);
    map.put(100,100);
    map.putIfAbsent(10, 100);
    map.put(20,200);
    if(map.containsKey(100)){
      System.out.println("found");
    }
    else{
      System.out.println("not found");
    } 
  }
}