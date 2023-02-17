
// A user wants to use a web application that provides multiple services. Write a Java program that uses an "else if" ladder to handle the user's selection and outputs the result.
//  The program should provide the following options to the user:
// Calculator
//Converter
// Random number generator
// Quit
// If the user selects "1", the program should provide the following options to the user for mathematical operations: 
// a. Addition
// b. Subtraction
// c. Multiplication
// d. Division 
// If the user selects "a", the program should prompt the user for two numbers and output the result of their addition. 
// Similarly, for "b", the program should prompt the user for two numbers and output the result of their subtraction. 
// For "c", the program should prompt the user for two numbers and output the result of their multiplication.
//  For "d", the program should prompt the user for two numbers and output the result of their division. 
// The program should check for division by zero. 
// If the user selects "2", the program should provide the following options to the user for unit conversion: 
// a. Celsius to Fahrenheit
// b. Fahrenheit to Celsius
// c. Kilometers to Miles
// d. Miles to Kilometers 
// If the user selects "a", the program should prompt the user for a temperature in Celsius and output the temperature in Fahrenheit. 
// Similarly, for "b", the program should prompt the user for a temperature in Fahrenheit and output the temperature in Celsius. 
// For "c", the program should prompt the user for a distance in kilometers and output the distance in miles. 
// For "d", the program should prompt the user for a distance in miles and output the distance in kilometers.
//  If the user selects "3", the program should generate a random number between 1 and 100 and output it to the user.
//  If the user selects "4", the program should print a goodbye message and exit.

import java.util.Random;
import java.util.*;

class CalculatorConverterApplication {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int choice, num1, num2, result = 0, temperature, fahrenheit = 0, celcius = 0;
    double km = 0, miles = 0;
    char inner_choice;
    System.out
        .println("the options available are \n 1)Calculator \n 2)Converter \n 3)Random number generator \n 4)Quit");
    System.out.println("enter your choice now");
    choice = sc.nextInt();

    switch (choice) {

      case 1:
        System.out.println("the mathematical operations available are : ");
        System.out.println(" a.Addition \n b.Substraction\n c.Multiplication \n d.Division");
        System.out.println("select inner choice to perform mathematical operation(a,b,c,d)");
        inner_choice = sc.next().charAt(0);
        if (inner_choice == 'a') {
          System.out.println("enter the first number");
          num1 = sc.nextInt();
          System.out.println("enter the second number");
          num2 = sc.nextInt();
          result = num1 + num2;
          System.out.println("the result is :" + result);
        } else if (inner_choice == 'b') {
          System.out.println("enter the first number");
          num1 = sc.nextInt();
          System.out.println("enter the second number");
          num2 = sc.nextInt();
          result = num1 - num2;
          System.out.println("the result is :" + result);
        } else if (inner_choice == 'c') {
          System.out.println("enter the first number");
          num1 = sc.nextInt();
          System.out.println("enter the second number");
          num2 = sc.nextInt();
          result = num1 * num2;
          System.out.println("the result is :" + result);
        } else if (inner_choice == 'd') {
          System.out.println("enter the first number");
          num1 = sc.nextInt();
          System.out.println("enter the second number");
          num2 = sc.nextInt();
          if (num2 == 0) {
            System.out.println("divisible by zero error");
            System.out.println("change the second value");
          } else {
            result = num1 / num2;
            System.out.println("the result is :" + result);
          }
        } else
          System.out.println("invalid inner choice");
        break;

      case 2:
        System.out.println("the options available are :");
        System.out.println(
            " a. Celsius to Fahrenheit \n b. Fahrenheit to Celsius \n c. Kilometers to Miles \n d. Miles to Kilometers");
        System.out.println("select inner choice to perform mathematical operation(a,b,c,d)");
        inner_choice = sc.next().charAt(0);
        if (inner_choice == 'a') {
          System.out.println("enter the temperature in celcius :");
          temperature = sc.nextInt();
          fahrenheit = (temperature * 9 / 5) + 32;
          System.out.println("the fahrenheit is " + fahrenheit + "fah");
        } else if (inner_choice == 'b') {
          System.out.println("enter the temperature in fahrenheit :");
          temperature = sc.nextInt();
          celcius = (temperature - 32) * 5 / 9;
          System.out.println("the celcius is " + celcius + " degree");
        } else if (inner_choice == 'c') {
          System.out.println("enter the kilometers :");
          km = sc.nextDouble();
          miles = km * 0.62137119;
          System.out.println("the number of miles : " + miles);
        } else if (inner_choice == 'd') {
          System.out.println("enter the miles :");
          miles = sc.nextDouble();
          km = miles * 1.609344;
          System.out.println("the number of kilometers are : " + km);
        } else
          System.out.println("invalid inner choice");
        break;

      case 3:
        System.out.println("the program is going to generate a random number for you");
        Random rand = new Random();
        int random = rand.nextInt(100);
        System.out.println("Random number generated is : " + random);
        break;

      case 4:
        System.out.println(" thank you for using my application \n See ya later");
        break;
      default:
        System.out.println("invalid choice");
    }
  }
}