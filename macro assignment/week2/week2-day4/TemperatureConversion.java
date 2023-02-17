// temperature conversion
// Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa

import java.util.*;
class TemperatureConversion{
  public static void main(String args[]){
    Scanner sc =new Scanner (System.in);
    double cel,fah;
    double temperature;
    System.out.println("enter the temperature ");
    temperature=sc.nextDouble();
    System.out.println("enter the {cel} for celcius");
    System.out.println("enter the {fah} for Fahrenheit");
    String change=sc.next();
    if(change.equals("fah")){
      fah=(temperature *1.8)+32;
      System.out.println(fah);
    }
    else if(change.equals("cel")){
      cel=(temperature-32)*5/9;
      System.out.println(cel);
    }
    else 
      System.out.println("inavlid input");
  }
}