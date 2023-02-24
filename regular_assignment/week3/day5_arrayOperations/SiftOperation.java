import java.util.Scanner;
class SiftOperation{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.println("enter array elements");
    for(int j=0;j<n;j++){
      arr[j]=sc.nextInt();
    }
    int pos=2,newValue=30;
    for(int i=(n-1);i>=(pos-1);i--){
      arr[i+1]=arr[i];
    }
    arr[pos-1]=newValue;
    System.out.println("after shift operation:\n");
    for(int j=0;j<arr.length;j++){
      System.out.println(arr[j]);
    }
  }
  
}