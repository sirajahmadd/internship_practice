import java.util.*;
class ReadingArray {
  public static void main(String args[]){
    int arr[]=new int[3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<3;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("entered elemnts are");
    for(int i=0;i<3;i++){
      System.out.println("arr["+i+"]="+arr[i]);
    }
  }
}