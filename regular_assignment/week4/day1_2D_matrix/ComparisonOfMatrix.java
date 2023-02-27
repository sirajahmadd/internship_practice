public class ComparisonOfMatrix {
  public static void main(String args[]) {

    int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int count=0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if(a[i][j]==b[i][j])
          System.out.println("matrix is   equal");
        else
       System.out.println("matrix is not  equal");
        }   
      }
  }
}



