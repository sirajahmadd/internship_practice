//week days
import java.util.*;
class WeekDays{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int num;
    System.out.println("enter the week number");
    num=sc.nextInt();
    switch(num){
      case 1:
        System.out.println("sunday");
        break;
      case 2:
        System.out.println("monday");
        break;
      case 3:
        System.out.println("tuesday");
        break;
      case 4:
        System.out.println("wednesday");
        break;
      case 5:
        System.out.println("thursday");
        break;
      case 6:
        System.out.println("friday");
        break;
      case 7:
        System.out.println("satday");
        break;
      default:
        System.out.println("invalid number");
    }
    
  }
}