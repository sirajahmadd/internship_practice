import java.util.StringTokenizer;
class LengthOfEachToken{
  public static void main(String args[]){
    StringTokenizer st=new StringTokenizer("hello there hi");
    System.out.println("length of each token is ");
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken().length());
    }
  }
}