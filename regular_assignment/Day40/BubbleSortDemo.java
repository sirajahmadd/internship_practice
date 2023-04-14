import java.util.Scanner;
class BubbleSortDemo{
  public static void main(String args[]){
    int temp=0,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n-1-i;i++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}

// import java.util.Scanner; 
// class BubbleSortDemo{
//   public static void main(String args[]) {
//     Scanner s = new Scanner(System.in);
//     System.out.println("enter array size");
//     int n = s.nextInt();
//     int arr[] = new int[n];
//     System.out.println("enter array elements");
//     for (int i = 0; i < n; i++) {
//       arr[i] = s.nextInt();
//     }

 

//     System.out.println("Before Sort ");
//     for(int i=0;i<n;i++){
//       System.out.println(arr[i]);
//     }
//   int temp=0;
//     for(int i=0;i<n-1;i++){
//       for(int j=i+1;j<n;j++){
//         if(arr[i]>arr[j]){
//           temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//         }
//       }
//     }
// System.out.println("After Sort ");
//     for(int i=0;i<n;i++){
//       System.out.println(arr[i]);
//     }
    
//   }
// }