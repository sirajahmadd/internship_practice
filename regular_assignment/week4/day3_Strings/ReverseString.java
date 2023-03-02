class ReverseString{
  static void reverse(String s1){
    char a[]=s1.toCharArray();
    String rev="";
    for(int i=a.length-1;i>=0;i--){
      rev=rev+a[i];
    }
    System.out.println(rev);
  }
  public static void main(String args[]){
    reverse("leonal messi");
  }
}
