import java.util.Scanner;
class Student{
  String name,branch;
  int id;
  double sub1,sub2,sub3;

  void average(){
    double avg=sub1+sub2+sub3;
    System.out.println(name+" "+avg);
  }
  void percentage(){
    double total=sub1+sub2+sub3;
    double per=(total/300)*100;
    System.out.println(name+" "+per);
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student s[]=new Student[5];
    for(int i=0;i<5;i++){
      s[i]=new Student();
      System.out.println("enter the student id ");
      s[i].id=sc.nextInt();
      System.out.println("enter the student name ");
      s[i].name=sc.next();
      System.out.println("enter the student branch  ");
      s[i].branch=sc.next();
      System.out.println("enter the marks of sub1 ");
      s[i].sub1=sc.nextInt();
      System.out.println("enter the marks of sub2 ");
      s[i].sub2=sc.nextInt();
      System.out.println("enter the marks of sub3 ");
      s[i].sub3=sc.nextInt();
      s[i].average();
      s[i].percentage();
      System.out.println("**********");
    }
    
}
}

//without user input
// class Student{
//   String name,branch;
//   int id;
//   double sub1,sub2,sub3;

//   void average(){
//     double avg=sub1+sub2+sub3;
//     System.out.println(name+" "+avg);
//   }
//   void percentage(){
//     double total=sub1+sub2+sub3;
//     double per=(total/300)*100;
//     System.out.println(name+" "+per);
//   }
// }

// class StudentMain{
//   public static void main(String args[]){
    
//     Student s1=new Student();
    
//     System.out.println("the average and percentage of :");
//     s1.id=10;
//     s1.name="siraj ahmad";
//     s1.branch="cse";
//     s1.sub1=50.0;
//     s1.sub2=70.0;
//     s1.sub3=90.0;
//     s1.average();
//     s1.percentage();
//     s1.id=10;

//     Student s2=new Student();
//     s2.name="mmeeesssiii";
//     s2.branch="ece";
//     s2.sub1=100.0;
//     s2.sub2=100.0;
//     s2.sub3=99.99.0;
//     s2.average();
//     s2.percentage();
// }
// }