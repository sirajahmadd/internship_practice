class VoteEligibility{
  static void vote(int age){
    if(age>18)
      System.out.println("eligible");
    else
      System.out.println("not eligible");
    }
  public static void main(String args[]){
    vote(14);
    vote(19);
  }
}

class VoteEligibility{
  static void vote(){
    int a=19;
    if(a> 18)
      System.out.println("eligible");
    else
      System.out.println("not eligible");
    }
  public static void main(String args[]){
    vote();
  }
}

class VoteEligibility{
  static String vote(){
    int a=19;
    if(a>18)
     return(" eligible");
    else
      return ("not_eligible");
    }
  public static void main(String args[]){
    String check=vote();
    System.out.println(check);
  }
}

class VoteEligibility{
  static String vote(int a){
    if(a>18)
     return(" eligible");
    else
      return ("not_eligible");
    }
  public static void main(String args[]){
    String a=vote(27);
    System.out.println(a);
  }
}