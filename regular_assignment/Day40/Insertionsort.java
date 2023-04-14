import java.util.*;
class Insertionsort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i,j;
    int a[]={10,2,1,4,5};
    for( i=1;i<a.length;i++){
      for( j=i;j>0 && a[j-1]>a[j];j--){
        int temp=a[j];
        a[j]=a[j-1];
        a[j-1]=temp;
      }
    }
    System.out.println("after sorting");
    for(i=0;i<a.length;i++){
      System.out.println(a[i]); 
    }
  }
}