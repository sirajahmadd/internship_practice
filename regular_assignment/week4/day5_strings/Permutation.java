import java.util.Scanner;

public class Permutation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the index");
    int index = sc.nextInt();
    int temp = arr[index];
    arr[index] = arr[index + 1];
    arr[index + 1] = temp;
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}