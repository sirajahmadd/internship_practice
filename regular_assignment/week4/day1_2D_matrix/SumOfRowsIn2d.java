public class SumOfRowsIn2d {
  public static void main(String args[]) {

    int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int sumRows;
    for (int i = 0; i < 3; i++) {
      sumRows=0;
      for (int j = 0; j < 3; j++) {
        sumRows=sumRows+a[i][j]+b[i][j];
        }  
      System.out.println(sumRows+" ");
      }
    
  }
}