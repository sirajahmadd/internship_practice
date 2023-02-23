//print postive numbers from an arra
import java.util.*;
class PositiveNumbers {
  public static void main(String args[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("positive elemnts are");
    for(int i=0;i<3;i++){
      if(arr[i]>0)
      System.out.println("arr["+i+"]="+arr[i]);
    }
  }
}