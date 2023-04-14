// import java.util.Scanner;
// import java.util.ArrayList;
// class AddData{
//   public static void main(String args[]){
//     ArrayList<Integer> l=new ArrayList<Integer>();
//     l.add(10);
//     l.add(20);
//     System.out.println(l);
//   }
// }

// import java.util.Scanner;
// import java.util.ArrayList;
// class AddData{
//   public static void main(String args[]){
//     ArrayList<Integer> l=new ArrayList<Integer>();
//     l.add(10);
//     l.add(20);
//     l.add(30);
//     System.out.println(l);
    
//     for(Integer lm:l){
//       System.out.println(lm);
//     }
//     l.remove(0);
//     System.out.println(l);
//   }
// }

// import java.util.Scanner;
// import java.util.ArrayList;
// class AddData{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     ArrayList<Integer> l=new ArrayList<Integer>();
//     l.add(10);
//     l.add(20);
//     l.add(30);
//     System.out.println(l);

//     System.out.println("enter element to earch");
//     int m=sc.nextInt();
//     int index=l.indexOf(m);
//     if(index==-1){
//       System.out.println("not");
//     }
//     else{
//       System.out.println("found");
//     }
    
//   }
// }

// import java.util.Scanner;
// import java.util.HashSet;
// class AddData{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     HashSet<Integer> l=new HashSet<Integer>();
//     l.add(10);
//     l.add(50);
//     l.add(30);
//     l.remove(0);
//     System.out.println(l);  
//   }
// }

// import java.util.Scanner;
// import java.util.Stack;
// class AddData{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     Stack<Integer> l=new Stack<Integer>();
//     l.add(10);
//     l.add(50);
//     l.add(30);
//     System.out.println(l);  
//     l.add(100);
//     System.out.println(l);  
//     l.remove(0);
//     System.out.println(l);  
    
//   }
// }

import java.util.Scanner;
import java.util.PriorityQueue;
class AddData{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    PriorityQueue<Integer> l=new PriorityQueue<Integer>();
    l.add(10);
    l.add(50);
    l.add(30);
    System.out.println(l);  
    l.add(100);
    System.out.println(l);  
    l.add(2);
    System.out.println(l);
  }
}