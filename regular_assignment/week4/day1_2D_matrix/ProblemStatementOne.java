// First line of the input is an integer N that gives the number of rows and columns of the grid.
// Next N lines will have the board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
 
// Output Format:
// Output "Yes" (without quotes) if the given configuration is a valid initial configuration. Print "No" otherwise (without quotes).
// Refer sample input and output for formatting specifications.
 
// Sample Input 1:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 20 20 20
// 20 20 20 20 20
// 6 20 3 20 20
// Sample Output 1:
// Yes
 
// Sample Input 2:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 12 20 20
// 20 20 20 20 20
// 6 20 3 20 20
// Sample Output 2:
// No
 

import java.util.*;
class Example{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter number of rows");
    int n=sc.nextInt();
    System.out.println("enter number of columns");
    int m=sc.nextInt();
    int arr[][]=new int[n][m];
    int i,j,count=0;
    System.out.println("enter elements ");
    // reading elements
      for(i=0;i<n;i++){
      for (j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
        System.out.println();
    }
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        if(arr[i][j]<10 || arr[i][j]==20){
          count++;
          break;
        }
      }
    }
    if(count==0)
      System.out.println("no");
    else
      System.out.println("yes");
  }
}