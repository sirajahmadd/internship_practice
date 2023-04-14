import java.util.Scanner;
import java.util.ArrayList;
class Practice{
  int id,roll;
  String name;

  Practice(String name,int roll,int id){
    this.name=name;
    this.roll=roll;
    this.id=id;
  }
}
class PracticeStudent{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Practice> p=new ArrayList<Practice>();
    System.out.println("enter the umber of students u want");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      p.add(new Practice(sc.next(),sc.nextInt(),sc.nextInt()));
    }

    for(Practice pr:p){
      System.out.println("the details are"+"\n"+"name:"+pr.name+"\nroll:"+pr.roll+"\nid:"+pr.id);
    }
  }
}