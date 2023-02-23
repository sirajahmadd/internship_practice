import java.util.*;
class Vowels{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of alphabets");
    int n=sc.nextInt();
    System.out.println("enter alphabets");
    char arr[]=new char[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.next().charAt(0);
    }
    for(int i=0;i<n;i++){
      if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='a'||arr[i]=='u'){
      System.out.println("vowels are :");
      System.out.println(arr[i]);
    }
    }
  }
}