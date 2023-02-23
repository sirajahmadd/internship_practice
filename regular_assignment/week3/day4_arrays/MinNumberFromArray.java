import java.util.*;
class MinNumberFromArray {
  public static void main(String args[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();  
    }
    int min=arr[0];
    for(int i=0;i<5;i++){
      if(arr[i]<min)
        min=arr[i];
    }
    System.out.println("min number is:"+min);
  }
}