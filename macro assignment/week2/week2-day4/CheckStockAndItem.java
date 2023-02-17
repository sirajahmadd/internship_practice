// A user is trying to purchase an item online. If the item is in stock and they have enough funds in their account, 
// the transaction will be processed. If the item is out of stock, they will be asked to try again later. If they donot //haveenough funds,
// they will be asked to add more money to their account. 

import java.util.*;
class CheckStockAndItem{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    boolean item,funds;
    System.out.println("check for item (true or false ?)");
    item=sc.nextBoolean();
    System.out.println("check for funds (true or false ?)");
    funds=sc.nextBoolean();
    if(item==false)
      System.out.println("try again later");
    else if(item==true && funds==true)
      System.out.println("the transaction will be processed");
    else if(item==true && funds==false)
      System.out.println("add amount to the walllet");
    else
      System.out.println("invalid input");
  }
}