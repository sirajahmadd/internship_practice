import java.util.*;
class PrimeNumbers {
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elemnts");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++){
      int count=0;
      for(int j=1;j<=arr[i];j++){
        if(arr[i]%j==0)
          count++;
      }
      if(count==2)
        System.out.println(arr[i]+" is prime number");
    }
      // else
      //   System.out.println("not prime");
  }
}