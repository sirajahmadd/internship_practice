import java.util.*;
class CountEvenNumbers{
  public static void main(String args[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<5;i++){
      if(arr[i]%2==0){
        count++;
      }
    }
    System.out.println("the number of even numbers are "+count);
  }
}

