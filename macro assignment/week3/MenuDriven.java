// menu
//   1.insertion
//   2.insert at last
//   3.insert at first
//   4.insert at specific
//   5.delete at first
//   6.delete at last
//   7.delete at specific position
//   8.search for an element
//   9.find the frequency of each number
//   10.display

//   select the opttion

//   1
//   insert the data

//   do you want to continue

// y
// 1.insertion
//   2.insert at last\n3.insert at first\n4.insert at specific
//   
//   
//   5.delete at first\n6.delete at last\n7.delete at specific position\n8.search for an element
//   
//   
//   
//   9.find the frequency of each number\n10.display
//   

// select the opttion

//   1
//   insert the data

//   do you want to continue

// import java.util.Scanner;
// class ArrayDemo{
//   //insert from last
//   static void insert(int n,int a[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       a[i]=sc.nextInt();
//     }
//   }
// //insert new element into first postion
//   static void insertAtFirst(int newElement,int a[],int n){
//     for(int i=n-1;i>=0;i--){
//       a[i+1]=a[i];
//     }
//     a[0]=newElement;
//   }

//   //insert at last
//   static void insertAtLast(int n,int newElement,int a[]){
//     a[n]=newElement;
//   }
// static void display(int n,int a[]){
//   for(int i=0;i<n;i++){
//     System.out.println(a[i]);
//   }
// }

//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int a[]=new int[50];
//     System.out.println("enter size");
//     int n=sc.nextInt();
//     insert(n,a);
//     //System.out.println("enter new element");
//     // int newElement=sc.nextInt();
//     // insertAtFirst(newElement, a, n);
//     // System.out.println("after inserting at first position");
//     // display(n+1,a);
//     System.out.println("enter new element");
//     int newElement=sc.nextInt();
//     System.out.println("after inserting at Last position");
//     insertAtLast(n, newElement, a);
//     display(n+1,a);

//   }
// }

import java.util.Scanner;

class MenuDriven {

  static void insertArrayElements(int n, int a[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements in array");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
  }

  static void inserAtFirst(int n, int newElement, int b[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("insert new elemnt to be inserted");
    newElement = sc.nextInt();
    for (int i = n - 1; i >= 0; i--) {
      b[i + 1] = b[i];
    }
    b[0] = newElement;
  }

  static void inserAtLast(int n, int newElement, int c[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("insert new elemnt to be inserted");
    newElement = sc.nextInt();
    c[n] = newElement;
  }

  static void insertAtSpecefic(int n, int newElement, int d[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the index position");
    int indexPos = sc.nextInt();
    System.out.println("insert new elemnt to be inserted");
    newElement = sc.nextInt();
    for (int i = n - 1; i >= indexPos; i--) {
      d[i + 1] = d[i];
    }
    d[indexPos] = newElement;
    n = n++;
  }

  static void deleteAtFirst(int n, int c[]) {
    for (int i = 1; i <= n; i++) {
      c[i - 1] = c[i];
    }

  }

  static void deleteAtLast(int n, int c[]) {
    c[n - 1] = 0;
  }

  static void deleteAtSpecefic(int n, int c[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the index position");
    int indexPos = sc.nextInt();
    for (int i = indexPos; i < n; i++) {
      c[i - 1] = c[i];
    }
  }

  static void display(int n, int c[]) {
    System.out.println("----after operation is performed ----");
    for (int i = 0; i < n; i++) {
      System.out.println("a[" + i + "]=" + c[i]);
    }
  }

  static void searchElement(int a[], int e, int n) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element to search");
    e = sc.nextInt();
    int position = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == e) {
        System.out.println("FOUND " + e + " at" + i + " position");
        position = i;
      }
    }
    if (a[position] != e)
      System.out.println("Not Found");
  }

  static void frequency(int a[], int n) {
    boolean visited[] = new boolean[n];
    System.out.println("Value Frequency");
    for (int i = 0; i < n; i++) {
      if (visited[i] == true)
        continue;
      int p = 1;
      for (int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) {
          visited[j] = true;
          p++;
        }
      }
      System.out.println(a[i] + "       " + p);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("eter the size");
    int n = sc.nextInt();
    char c = 'y';
    int a[] = new int[50];
    int newElement = 0;
    int position = 0, e = 0;
    do {

      System.out.println(
          "1.insertion\n2.insert at first\n3.insert at last\n4.insert at specific\n5.delete at first\n6.delete at last\n7.delete at specific position\n8.search for an element\n9.find the frequency of each number\n10.display");

      System.out.println("eter the choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          insertArrayElements(n, a);
          System.out.println("***after insertion elements in array****");
          display(n, a);
          break;
        case 2:
          inserAtFirst(n, newElement, a);
          display(n + 1, a);
          break;
        case 3:
          inserAtLast(n, newElement, a);
          display(n + 1, a);
          break;
        case 4:
          insertAtSpecefic(n, newElement, a);
          System.out.println("---------");
          display(n + 1, a);
          break;
        case 5:
          deleteAtFirst(n, a);
          System.out.println("***after deletion at first**");
          display(n - 1, a);
          break;
        case 6:
          deleteAtLast(n, a);
          System.out.println("***after deletion of last element***");
          display(n, a);
          break;
        case 7:
          deleteAtSpecefic(n, a);
          System.out.println("---after deletion---");
          display(n - 1, a);
        case 8:
          searchElement(a, e, n);
          break;
        case 9:
          frequency(a, n);
          break;
      }
      System.out.println("do you want tocontinue(y/n) ");
      c = sc.next().charAt(0);

    } while (c != 'n');
  }
}