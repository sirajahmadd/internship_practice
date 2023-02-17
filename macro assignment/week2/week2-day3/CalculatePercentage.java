//calculate percentage
import java.util.*;
class CalculatePercentage{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int phy,che,mat,bio,comp;
    double obtained_marks,percentage;
    System.out.println("enter the physics marks");
    phy=sc.nextInt();
    System.out.println("enter the chemistry marks");
    che=sc.nextInt();
    System.out.println("enter the maths marks");
    mat=sc.nextInt();
    System.out.println("enter the biology marks");
    bio=sc.nextInt();
    System.out.println("enter the computer marks");
    comp=sc.nextInt();
    obtained_marks=phy+che+mat+bio+comp;
    percentage=(obtained_marks/500)*100;
    System.err.println("the percentage is :"+ percentage);
    if(percentage>=90)
      System.err.println("grade A");
    else if(percentage>=80 && percentage<=89)
      System.err.println("grade B");
    else if(percentage>=70 && percentage<=79)
      System.err.println("grade c");
    else if(percentage>=60 && percentage<=69)
      System.err.println("grade D");
    else if(percentage>=50 && percentage<=59)
      System.err.println("grade E");
    else
      System.err.println("fail");
    
  }
}