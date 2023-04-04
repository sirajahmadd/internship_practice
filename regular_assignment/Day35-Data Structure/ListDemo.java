import java.util.*;
class ListDemo{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add(12);
    list.add("siraj");
    System.out.println(list);
    for(Object o:list){
      System.out.println(o);
    }
  }
}