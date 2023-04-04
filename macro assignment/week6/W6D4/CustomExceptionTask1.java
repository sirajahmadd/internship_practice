 // Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.

class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
    super(str);
  }
}
class BankAccount{
  int balance=50000,total_balance;
  void withdrawAmount(int withdraw) throws InsufficientFundsException{
    if(withdraw>balance){
      throw new InsufficientFundsException("insufficient balance");
    }
    else{
      total_balance=balance-withdraw;
      System.out.println("the total bal is "+total_balance);
    }
  }

  void depositeAmount(int deposite) throws InsufficientFundsException{
    if(deposite==0){
      throw new InsufficientFundsException("deposite amount cannot be zero");
    }
    else{
      total_balance=balance+deposite;
      System.out.println("the total bal is "+total_balance);
    }
  }
}

class CustomExceptionTask1{
  public static void main(String args[]){
    BankAccount b=new BankAccount();
    try{
      b.withdrawAmount(500);
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }

    try{
      b.depositeAmount(10);
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }
  }
}