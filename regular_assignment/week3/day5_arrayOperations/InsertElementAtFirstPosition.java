// insert at first postion

import java.util.*;
class InsertElementAtFirstPosition{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of elements");
    int n=sc.nextInt();
    System.out.println("enter elemnts in array");
    int arr[]=new int[n+1];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int pos=1,newValue=100;
    for(int j=(n-1);j>=(pos-1);j--){
      arr[j+1]=arr[j];
    }
    arr[pos-1]=newValue;
    System.out.println("elements after operation ");
    for(int i=0;i<arr.length;i++){
      System.out.println("arr["+i+"]="+arr[i]);
    }
  }
}