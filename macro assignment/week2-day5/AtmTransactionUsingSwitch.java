// A user has a balance of $1000 in their bank account and a PIN number of "1234". They want to withdraw money from an ATM. Write a Java program that uses an "else if" ladder to handle the transaction and outputs the result. The program should provide the following options to the user: Check balance

// Withdraw money

// Deposit money

// Change PIN

// Quit

// If the user selects "1", the program should simply print the user's balance. If the user selects "2", the program should prompt the user for their PIN number and the amount to withdraw, and check if the user has sufficient funds before deducting the amount from the balance. If the user selects "3", the program should prompt the user for their PIN number and the amount to deposit, and add the amount to the balance. If the user selects "4", the program should prompt the user for their current PIN number and then their new PIN number, and update the PIN number. If the user selects "5", the program should print a goodbye message and exit
import java.util.*;
class AtmTransactionUsingSwitch{
  public static void main(String args[]){
    Scanner sc =new Scanner (System.in);
      double balance=1000;
      String pin = "1234";
      String newPin;
      int choice,withraw,deposite;
      System.out.println("welcome to the bank of baroda");
    // System.out.println("Press 1 to check balance\n Press 2 Withraw money\n Press 3 for Deposit money\n Press 4 to Change p
// Press 5 to Quit ");
      System.out.println("Enter the choice(1-5)");
      choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("The balance is"+balance);
          break;
        case 2:
          System.out.println("Enter the pin");
          pin = sc.next();
          if(pin.equals("1234")&&balance>=1000){
            System.out.println("Enter the amount to withraw");
            withraw=sc.nextInt();
            System.out.println("the amount  withrawn is");
            System.out.println(withraw);
          }
        else if(pin.equals("1234")&&balance<1000){
          System.out.println("Insufficient Balance");
        }
        else{
          System.out.println("Enter the correct pin");
        }
        break;
        case 3:
        if(pin.equals("1234")){
          System.out.println("Enter the amount to be deposited");
          deposite=sc.nextInt();
        }
        else{
          System.out.println("Enter the correct pin");
        }
        break;
        case 4:
          System.out.println("Enter the pin");
          pin=sc.next();
          if(pin.equals("1234")){
            System.out.println("Enter your new pin: ");
            newPin = sc.next();
            System.out.println("ReEnter your new pin: ");
            newPin = sc.next();
        
            System.out.println("Your pin as been succesfully changed : ");
        }
        else{
          System.out.println("Your pin is incorrect: ");
        }
          break;
        case 5:
          System.out.println("Thank you for Banking with us ");
          break;
        default:
          System.out.println("Invalid: ");
      }
  }
}