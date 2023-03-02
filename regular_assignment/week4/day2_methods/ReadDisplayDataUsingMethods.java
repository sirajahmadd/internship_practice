// import java.util.Scanner;
// class ReadDisplayDataUsingMethods{
  
//   static void read(int size,int arr[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter array elements");
//     for(int i=0;i<size;i++){
//       arr[i]=sc.nextInt(); 
//     }
//   }
  
//   static void display(int n,int abc[]){
//     System.out.println("****elements****");
//     for(int i=0;i<n;i++){
//       System.out.println(abc[i]);
//     }
//   }
  
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the size");
//     int n=sc.nextInt();
//     int a[]=new int[n];
//     read(n,a);
//     display(n,a);
//   }
// }
import java.util.Scanner;
class ReadDisplayDataUsingMethods{

  static void read(int n,int abc[]){
    Scanner sc=new Scanner (System.in);
    for(int i=0;i<n;i++){
      abc[i]=sc.nextInt();
    }
  }

  static int[] display(int n,int abcs[]){
      return abcs;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int a[]=new int[n];
    read(n,a);
    int c[]=new display(n,a);
    for(int i=0;i<n;i++){
      System.out.println(c[i]);
    }
  }
}