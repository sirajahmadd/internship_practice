import java.util.StringTokenizer;
class CountNumberOfToken{
  public static void main(String args[]){
    StringTokenizer st=new StringTokenizer("hello there hoe are you");
    int count=0;
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
      count++;
    }
      System.out.println("the number of tokens are "+count);
  }
}

// import java.util.StringTokenizer;
// class MaxmumLengthOfToken{
//   public static void main(String args[]){
//     StringTokenizer st=new StringTokenizer("hey how you doing");
//     System.out.println(st.countTokens());
//   }
// }