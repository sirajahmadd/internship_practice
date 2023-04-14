import java.util.*;
class SelectionSort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("before sort");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    System.out.println("after sorting");
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }      
      System.out.println(a[i]);
    }
  }
}