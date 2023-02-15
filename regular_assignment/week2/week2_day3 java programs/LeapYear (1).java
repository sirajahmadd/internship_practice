
//leap year
import java.util.*;

class LeapYear {
  public static void main(String args[]){
    int year;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the year");
    year=sc.nextInt();
    if(year%4==0){
      System.out.println("its a leap year");
    }
    else{
      System.out.println("its not a leap year");
    }
  }
}