class StringStartLetter{
  static void validString(String s1){
    if(s1.startsWith("L") &&s1.endsWith("a")){
      System.out.println("valid");
    }
    else
      System.out.println("invalid");
  }
  public static void main(String args[]){
    validString("Lalitha");
  }
}