import java.util.StringTokenizer;
class StringTokanizerDemo{
  public static void main(String args[]){
    StringTokenizer  st=new StringTokenizer("hello there good morning");
    while(st.hasMoreTokens())
      System.out.println(st.nextToken());
  }
}