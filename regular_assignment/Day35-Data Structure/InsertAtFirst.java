// Write a Java program to insert an element into the array list at the first position
import java.util.*;
class InsertAtFirst{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Integer> l=new ArrayList<Integer>();
    for(int i=0;i<3;i++){
      l.add(sc.nextInt());
    }
    System.out.println(l);
    l.set(0, 91);
    System.out.println(l);
  }
}