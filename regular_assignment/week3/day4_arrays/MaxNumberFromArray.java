
import java.util.*;
class MaxNumberFromArray {
  public static void main(String args[]){
    int arr[]=new int[5];
    int max=arr[0];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      if(arr[i]>max)
        max=arr[i];
    }
    System.out.println("max number is:"+max);
  }
}

// public class MaxNumberFromArray {  
//     public static void main(String[] args) {  
  
//         //Initialize array  
//         int [] arr = new int [] {25, 11, 7, 75, 56};  
//         //Initialize max with first element of array.  
//         int max = arr[0];  
//         //Loop through the array  
//         for (int i = 0; i < arr.length; i++) {  
//             //Compare elements of array with max  
//            if(arr[i] > max)  
//                max = arr[i];  
//         }  
//         System.out.println("Largest element present in given array: " + max);  
//     }  
// } 