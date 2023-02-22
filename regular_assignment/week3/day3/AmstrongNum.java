import java.util.Scanner;
class AmstrongNum{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n,rem,result=0,num=0;
    System.out.println("enter a number");
    n=sc.nextInt();
    int orignalnum=n;
    while(n>0){
      rem=n%10;
      result=result+(int)Math.pow(rem,3); // bcz math default value is double
      n=n/10;
    }
    if(orignalnum==result){
      System.out.println("amstrong num");
    }
    else{
      System.out.println("not");
    }
  }
}


// import java.util.Scanner;class Armstrongnumber {    public static void main(String[] args) {      int num, temp, remainder, result = 0, n = 0;      Scanner sc = new Scanner(System.in);      System.out.print("Enter a number: ");      num = sc.nextInt();      temp= num;      while (temp != 0) {        temp= temp/10;        n++;      }      temp = num;      while (temp != 0) {        remainder = temp % 10;        result= result + (int)Math.pow(remainder,n);        temp = temp/10;      }      if (result == num)        System.out.println(num + " is an Armstrong number.");      else        System.out.println(num + " is not an Armstrong number.");    }}