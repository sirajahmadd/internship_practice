import java.util.Scanner;
class RightRotate {    
 public static void main(String[] args) {    
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the index ");
   int n =sc.nextInt();    //n determine the number of times an array should be rotated.
   System.out.println("enter array size");
   int m=sc.nextInt();
   int arr[]=new int[m];
   System.out.println("enter array elements");
   for(int i=0;i<arr.length;i++){
     arr[i]=sc.nextInt();
   }     
   //Displays original array    
   System.out.println("Original array: ");  
   for (int i = 0; i < arr.length; i++) {  
     System.out.print(arr[i] + " ");     
   }      
   //Rotate the given array by n times toward right    
     for(int i = 0; i < n; i++){    
       int j, last;    
    //Stores the last element of array    
       last = arr[arr.length-1];              
       for(j = arr.length-1; j > 0; j--){    
    //Shift element of array by one    
         arr[j] = arr[j-1];  
       }    
    //Last element of array will be added to the start of array.    
        arr[0] = last;    
     }            
      System.out.println();    
    //Displays resulting array after rotation    
      System.out.println("Array after right rotation: ");    
      for(int i = 0; i< arr.length; i++){    
       System.out.print(arr[i] + " ");    
      }    
    }    
}    