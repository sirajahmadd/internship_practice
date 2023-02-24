 // 1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to 
 //   check if the guess is correct

// import java.util.Random;
// import java.util.Scanner;
// class RandomNumberGenerator{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     Random ram=new Random();
//     System.out.println("enter the guessing number");
//     int guessNumber=sc.nextInt();
//     System.out.println("the randomly generated number is");
//     int randomNumber=ram.nextInt(100);
//     System.out.println(randomNumber);
//     while(true){
//       if(guessNumber!=randomNumber){
//         System.out.println("wrong guess \nenter guess again");
//         guessNumber=sc.nextInt();
//         System.out.println(randomNumber);
//       }
//       else{
//         System.out.println("guess is right");
//         break;
//       }
//     }
//   }
// }


import java.util.Random;
import java.util.Scanner;
class RandomNumberGenerator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random ram=new Random();
    System.out.println("enter the guessing number");
    int guessNumber=sc.nextInt();
    System.out.println("the randomly generated number is");
    int randomNumber=ram.nextInt(100);
    System.out.println(randomNumber);
    while(true){
      if(guessNumber==randomNumber){
        System.out.println("guess is right");
        break;
      }
      else{
        System.out.println("wrong guess \nenter guess again");
        guessNumber=sc.nextInt();
        System.out.println(randomNumber);
        
      }
    }
  }
}




// import java.util.Random; 
// import java.util.Scanner;
// class Guessinggame{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     Random random = new Random(); 
//     int randomnumber=random.nextInt(100);
//     //System.out.println(randomnumber);
//     int Guess=0;
//     do{
//       System.out.println("Guess Number:");
//       Guess=sc.nextInt();
//       if(randomnumber==Guess)
//         System.out.println(" Correct Guess!!Congrats");
//       else
//         System.out.println(" Incorrect Guess!!Try Again");
//     }while(randomnumber!=Guess);
//   }
// }