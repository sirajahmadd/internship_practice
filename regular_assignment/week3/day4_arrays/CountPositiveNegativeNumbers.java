import java.util.*;
class CountPositiveNegativeNumbers{
  public static void main(String args[]){
    int arr[]=new int[5];
    int total;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elemnts");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<5;i++){
      if(arr[i]>0){
        count++;
      }
    }
    System.out.println("number of positive elements: "+count);
    int countNeg=0;
    for(int i=0;i<5;i++){
      if(arr[i]<0)
        countNeg++;
    }
    System.out.println("number of negative number: "+countNeg);
    total=count+countNeg;
  }
}
// import java.util.*;
// class CountPositiveNegativeNumbers{
//   public static void main(String args[]){
//     int arr[]=new int[5];
//     int total;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter elemnts");
//     for(int i=0;i<5;i++){
//       arr[i]=sc.nextInt();
//     }
//     int count=0,countNeg=0;
//     for(int i=0;i<5;i++){
//       if(arr[i]>0){
//         count++;
//       }
//       else{
//         countNeg++;
//       }
//     }
//     System.out.println("number of positive elements: "+count);
//     System.out.println("number of positive elements: "+countNeg);
//     total=count+countNeg;
//   }
// }