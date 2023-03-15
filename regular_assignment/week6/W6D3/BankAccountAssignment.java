import java.util.Scanner;
class BankAccountAssignment{
  double balance,deposite_amnt,withdraw,updated_balance;
  long acc_num;

  void deposit(){
    updated_balance=balance+deposite_amnt;
    System.out.println("\namount after debited "+updated_balance);
  }
  void withdrawAmount(){
    System.out.println("amount withdrawn are "+withdraw);
  }
  void checkBalance(){
    balance=updated_balance-withdraw;
    System.out.println("the balance amount is "+balance);
    System.out.println("--------------");
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    BankAccount b[]=new BankAccount[4];
    for(int i=0;i<3;i++){
      b[i]=new BankAccount();
      System.out.println("enter the account number");
      b[i].acc_num=sc.nextLong();
      System.out.println("enter the balance");
      b[i].balance=sc.nextDouble();
      System.out.println("enter the amount to be deposited");
      b[i].deposite_amnt=sc.nextDouble();
      System.out.println("enter the amount to be withdrawn");
      b[i].withdraw=sc.nextDouble();
      b[i].deposit();
      b[i].withdrawAmount();
      b[i].checkBalance();
    }
  }
}