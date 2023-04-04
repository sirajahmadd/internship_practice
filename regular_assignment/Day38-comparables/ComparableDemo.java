// import java.util.ArrayList;
// import java.util.*;

//sorttttttttttt basedddddddddd onnnnnnnnnnn iddddddddddddd
// class Student implements Comparable<Student>{
//   private int id;
//   private String name;
//   private String dept;
//   private int age;
//   Student(int id,String name,String dept,int age){
//     this.id=id;
//     this.name=name;
//     this.dept=dept;
//     this.age=age;
//   }
// public int compareTo(Student st) {
//   if(id>st.id){
//     return 1;
//   }
//   else if(id<st.id){
//     return -1;
//   }
//   else{
//      return 0;
//   }

// }
// public int getId() {
//     return id;
// }
// public void setId(int id) {
//     this.id = id;
// }
// public String getName() {
//     return name;
// }
// public void setName(String name) {
//     this.name = name;
// }
// public String getDept() {
//     return dept;
// }
// public void setDept(String dept) {
//     this.dept = dept;
// }
// public int getAge() {
//     return age;
// }
// public void setAge(int age) {
//     this.age = age;
// }

// }
// class StudentDemo{
//   public static void main(String args[]){
//     ArrayList<Student> students=new ArrayList<Student>();
//     Scanner sc=new Scanner(System.in);
//     for(int i=0;i<3;i++){
//       students.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
//     }
//     Collections.sort(students);
//     for(Student st:students){
//       System.out.println(st.getId()+" "+st.getName()+""+st.getDept()+" "+st.getAge());
//     }
//   }
// }

//sorttttttt baseddddddddddddddd on               ageeeeeeeeeeeeeeeeeeeeeeee
import java.util.ArrayList;
import java.util.*;

class Student implements Comparable<Student> {
  private int id;
  private String name;
  private String dept;
  private int age;

  Student(int id, String name, String dept, int age) {
    this.id = id;
    this.name = name;
    this.dept = dept;
    this.age = age;
  }

  public int compareTo(Student st) {
    if (age > st.age) {
      return 1;
    } else if (age < st.age) {
      return -1;
    } else {
      return 0;
    }

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}

class StudentDemo {
  public static void main(String args[]) {
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      students.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
    }
    Collections.sort(students);
    for (Student st : students) {
      System.out.println(st.getId() + " " + st.getName() + "" + st.getDept() + " " + st.getAge());
    }
  }
}

// sort based on nameeeeeeeeeeeeeeeeeeeeeee
// import java.util.ArrayList;
// import java.util.*;
// class Student implements Comparable<Student>{
// private int id;
// private String name;
// private String dept;
// private int age;
// Student(int id,String name,String dept,int age){
// this.id=id;
// this.name=name;
// this.dept=dept;
// this.age=age;
// }
// public int compareTo(Student st) {
// return name.compareTo(st.name);

// }
// public int getId() {
// return id;
// }
// public void setId(int id) {
// this.id = id;
// }
// public String getName() {
// return name;
// }
// public void setName(String name) {
// this.name = name;
// }
// public String getDept() {
// return dept;
// }
// public void setDept(String dept) {
// this.dept = dept;
// }
// public int getAge() {
// return age;
// }
// public void setAge(int age) {
// this.age = age;
// }

// }
// class StudentDemo{
// public static void main(String args[]){
// ArrayList<Student> students=new ArrayList<Student>();
// Scanner sc=new Scanner(System.in);
// for(int i=0;i<3;i++){
// students.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
// }
// Collections.sort(students);
// for(Student st:students){
// System.out.println(st.getId()+" "+st.getName()+""+st.getDept()+"
// "+st.getAge());
// }
// }
// }

// triedddddddddddddddddddddddddddd
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.*;
// class Student implements Comparable<Student>{
// private String name;
// private int roll;
// private String sec;
// Student(String name,int roll, String sec){
// this.name=name;
// this.roll=roll;
// this.sec=sec;
// }

// public int compareTo(Student stu){
// if(roll>stu.roll){
// return 1;
// }

// else if(roll<stu.roll){
// return -1;
// }

// else{
// return 0;
// }

// }

// public String getName() {
// return name;
// }
// public void setName(String name) {
// this.name = name;
// }
// public int getRoll() {
// return roll;
// }
// public void setRoll(int roll) {
// this.roll = roll;
// }
// public String getSec() {
// return sec;
// }
// public void setSec(String sec) {
// this.sec = sec;
// }
// }

// public class ComparableDemo{
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// ArrayList<Student> s=new ArrayList<Student>();
// for(int i=0;i<3;i++){
// s.add(new Student(sc.next(),sc.nextInt(),sc.next()));
// }
// Collections.sort(s);
// for(Student st:s){
// System.out.println(st.getName()+" "+st.getRoll()+" "+st.getSec());
// }
// }
// }