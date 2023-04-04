// Write a Java program to create a HashMap and add key-value pairs to it

import java.util.HashMap;
import java.util.Map;
class MapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(10,"siraj");
    map.put(100,"messi");
    map.putIfAbsent(10, "siraj");
    map.putIfAbsent(101, "sirajj");
    System.out.println(map);
    for(Map.Entry m:map.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
  }
}