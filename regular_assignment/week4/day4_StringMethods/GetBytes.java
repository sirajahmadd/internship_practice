// class GetBytes{
//   public static void main(String args[]){
//     String s="ABC";
//     byte b[]=s.getBytes();
//     for(int i=0;i<b.length;i++){
//       System.out.println(b[i]);
//     }
//     // String s2=new String(b);
//     // System.out.println(s2);
//   }
// }

class GetBytes{
  static void getBytess(String s){
    byte b[]=s.getBytes();
    for(int i=0;i<b.length;i++){
      System.out.println(b[i]);
    }
  }
  public static void main(String args[]){
    getBytess("messi");
  }
}