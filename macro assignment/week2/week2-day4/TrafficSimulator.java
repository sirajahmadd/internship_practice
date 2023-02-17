// Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow.
  
import java.util.*;
class TrafficSimulator{
  public static void main(String args[]){
    Scanner sc =new Scanner (System.in);
    String traffic_flow;
    int time;
    System.out.println("enter the traffic flow");
    traffic_flow=sc.next();
    System.out.println("enter the time");
    time=sc.nextInt();
    if((time>8 && time<10) && (traffic_flow.equals("heavy"))){
      System.out.println("green light for north east");
      System.out.println("red light for east-west");
    }
    else if((time>10 && time<12) && (traffic_flow.equals("heavy"))){
      System.out.println("green light for east-west");
      System.out.println("red light for south-east");
    }
    else if((time>12 && time<14) && (traffic_flow.equals("heavy"))){
      System.out.println("green light for east-west");
      System.out.println("red light for south-east");
    }
    else if((time>14 && time<16) && (traffic_flow.equals("heavy"))){
      System.out.println("green light for south-west");
      System.out.println("red light for north-east");
    }
    else if((time>16 && time<18) && (traffic_flow.equals("heavy"))){
      System.out.println("green light for east-west");
      System.out.println("red light for south-east");
    }
    else
      System.out.println("yellow  light for all direction");
  }
}