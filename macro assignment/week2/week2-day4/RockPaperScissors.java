//rock,paper

import java.util.*;
class RockPaperScissors{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    String player1;
    String player2;
    System.out.println("enter the choice of first player \n (rock or paper or scissors)");
    player1=sc.nextLine();
    System.out.println("enter the choice of second player \n (rock or paper or scissors)");
    player2=sc.nextLine();
    if(player1.equals(player2)){
      System.out.println("its a tie");
    }
    else if(player1.equals("rock") && (player2.equals("paper")) || (player1.equals("paper") && (player2.equals("scissors")))  || (player1.equals("scissors") && player2.equals("rock"))){
      System.out.println("player 2 wins");
    }
    else if(player2.equals("rock") && (player1.equals("paper")) || (player2.equals("paper") && (player1.equals("scissors")))  || (player2.equals("scissors") && player1.equals("rock"))){
      System.out.println("player 1 wins");
  }
    else
      System.out.println("invalid input");
}
}