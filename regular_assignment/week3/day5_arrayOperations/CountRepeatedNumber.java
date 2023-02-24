import java.util.Scanner;
class CountRepeatedNumber{
  public static void main(String ars[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of element");
    int n=sc.nextInt();
    System.out.println("enter the array element");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter element to be serached");
    int find=sc.nextInt();
    int count=0;
    for(int j=0;j<n;j++){
      if(arr[j]==find){
        count++;
        System.out.println("element is present at position "+j);
      }
    }
      System.out.println("repeated number of number is " +count);
      if(count==0){
        System.out.println("not present");
  }
}
}