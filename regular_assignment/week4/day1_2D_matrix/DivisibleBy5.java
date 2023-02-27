// class Array2d{
//   public static void main(String args[]){
//     int arr[][]={{1,2,10},{2,5,4},{4,5,6}};
//     int i,j,count;
//     for( i=0;i<3;i++){
//       for ( j=0;j<3;j++){
//         if(arr[i][j]%5==0){
//           System.out.println(arr[i][j]);
//         }
//      }
//   }
// }
// }

import java.util.Scanner;
  class DivisibleBy5{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{2,5,15},{20,60,70},{4,5,6}};
      for(int i=0;i<3;i++){
        int count=0;
        for(int j=0;j<3;j++){
          if(a[i][j]%5==0){
           count++;
          }
        }
        System.out.println(count);
       
      }
    }
  }