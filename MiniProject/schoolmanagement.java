import java.util.*;

//     You are tasked with creating a program to model a School. The School has a list of Teachers and a list of Students. Each Teacher has a name and a subject that they teach. Each Student has a name and a grade level
//     Your program should have the following classes:
// Teacher: This class should have private fields for the teacher's name and subject, as well as getters and setters for these fields.
// Student: This class should have private fields for the student's name and grade level, as well as getters and setters for these fields.
// School: This class should have private fields for the list of Teachers and the list of Students, as well as methods to add and remove Teachers and Students from the lists, and methods to print the lists of Teachers and Students. Additionally, this class should have methods to find a Teacher or Student by name and to remove a Teacher or Student from the School.
// Your program should have a main method that allows users to interact with the School object and perform the actions listed above. The program should continue running until the user chooses to exit.
// I hope this gives you a good starting point for your assignment!

// Regenerate response

class Teacher{
  private String name;
  private String subject;
Teacher(String name, String subject){
  this.name = name;
  this.subject=subject;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}  
}
class Student{
 private String name;
  private int grade;
  Student(String name, int grade){
    this.name=name;
    this.grade=grade;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
}
class School{
 private ArrayList<Teacher> teacherList = new ArrayList<>();
  private ArrayList<Student> studentList = new ArrayList<>();
  public void addTeacher(Teacher teacher) {
    teacherList.add(teacher);
  }
  public void addStudent(Student student){
    studentList.add(student);
  }
  public void removeTeacher(String name){
    for (Teacher school : teacherList) {
      if(school.getName().equals(name)){
        teacherList.remove(school);
        System.out.println("Teacher removed succesfully");
        return;
      }
}
    System.out.println("Teacher not found");
  }
    public void removeStudent(String name){
    for (Student school : studentList) {
      if(school.getName().equals(name)){
        studentList.remove(school);
        System.out.println("Student removed succesfully");
        return;
      }
}
    System.out.println("Student not found");
  }
}
public class MiniProject{
  public static void main(String args[]){
    ArrayList<Teacher> t=new ArrayList<>();
    ArrayList<Student> s=new ArrayList<>();
    School school = new School();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many student you want to add");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter student details:");
    for(int i=0; i<n; i++){
       System.out.println("Enter the student name:");
      String name = sc.nextLine();
      System.out.println("Enter the grade:");
      int grade = sc.nextInt();
     sc.nextLine();
      s.add(new Student(name,grade));     
      school.addStudent(new Student(name,grade));
    }
   System.out.println("Enter how many teacher you want to add");
    n = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter teacher details:");
    for(int i=0; i<n; i++){
       System.out.println("Enter the teacher name:");
      String name = sc.nextLine();
      System.out.println("Enter the subject:");
      String subject = sc.next();
      sc.nextLine();
      t.add(new Teacher(name,subject));     
      school.addTeacher(new Teacher(name,subject));
    }
  }
}