import java.util.Scanner;

interface Atm {
  void withdraw();

  void deposite();

  void getBalance();

}

class SBI implements Atm {

  public void withdraw() {
    double bal = 10000;
    System.out.println("enter amount to be withdrawn");
    Scanner sc = new Scanner(System.in);
    double withdraww = sc.nextDouble();
    double balance = bal - withdraww;
    System.out.println("remaining balance is " + balance);
  }

  public void deposite() {
    double bal = 20000;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter amount to be deposited");
    double depositee = sc.nextDouble();
    double balance = bal + depositee;
    System.out.println("the balance after the deposition is " + balance);
  }

  public void getBalance() {
    System.out.println("the balnce is to be calculated");
  }
}

class InterfaceAtm {
  public static void main(String args[]) {
    Atm a = new SBI();
    a.withdraw();
    a.deposite();
    a.getBalance();
  }
}

// import java.util.Scanner;

 

// interface ATM {
//     void deposit();

 

//     void withdraw();

 

//     void getBalance();
// }

 

// class SbiATM implements ATM {
//     Scanner sc = new Scanner(System.in);
//     double balance = 5000;

 

//     public void deposit() {
//         System.out.println("Enter deposit amount ");
//         double amount = sc.nextDouble();
//         balance = balance + amount;
//         getBalance();
//     }

 

//     public void withdraw() {
//         System.out.println("Enter withdraw- amount ");
//         double amount = sc.nextDouble();
//         balance = balance - amount;
//         getBalance();
//     }

 

//     public void getBalance() {
//         System.out.println("balance is " + balance);
//     }
// }

 

// class InterfaceDemo2 {
//     public static void main(String args[]) {
//         ATM atm = new SbiATM();
//         atm.deposit();
//         atm.withdraw();
//         atm.getBalance();
//     }
// }