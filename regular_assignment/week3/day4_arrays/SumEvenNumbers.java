//print postive numbers from an arra
import java.util.*;
class SumEvenNumbers {
  public static void main(String args[]){
    int sum=0;
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("sum of even numbers is:");
    for(int i=0;i<5;i++){
      if(arr[i]%2==0){
        sum=sum+arr[i];
        System.out.println(sum);
      }
    }
  }
}