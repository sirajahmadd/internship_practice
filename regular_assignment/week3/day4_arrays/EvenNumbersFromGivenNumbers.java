import java.util.*;
class EvenNumbersFromGivenNumbers {
  public static void main(String args[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("even elements are");
    for(int i=0;i<5;i++){
      if(arr[i]%2==0){
        System.out.println("arr["+i+"]="+arr[i]);
      }
    }
  }
}