// A user is trying to purchase an item online. If the item is in stock and they have enough funds in their account, 
// the transaction will be processed. If the item is out of stock, they will be asked to try again later. If they donot //haveenough funds,
// they will be asked to add more money to their account. 
import java.util.*;
class CheckFundStock{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    boolean item;
    double funds,item_cost;
    System.out.println("check for the item (true or false)");
    item=sc.nextBoolean();
    System.out.println("check your funds");
    funds=sc.nextDouble();
    if(item==true){
      System.out.println("enter the amount of item");
      item_cost=sc.nextDouble();
    if(item==true && funds>item_cost ){
      System.out.println("transaction will be processed");
    }
    else
      System.out.println("add more money to your bank account");
    }
    else
    System.out.println("item couldnot be found");  
  }
}