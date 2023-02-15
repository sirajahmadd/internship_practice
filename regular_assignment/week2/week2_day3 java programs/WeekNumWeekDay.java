//WeekNum or WeekDay 
import java.util.*;
class WeekNumWeekDay {
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    if(num==1)
      System.out.println("its sunday");
    else if(num==2)
     System.out.println("its monday");
    else if(num==3)
     System.out.println("its tuesday");
    else if(num==4)
     System.out.println("its wednesday");
    else if(num==5)
     System.out.println("its thursday");
    else if(num==6)
     System.out.println("its friday");
    else if(num==7)
     System.out.println("its saturday");
    else
      System.out.println("invalid number");
  }
}