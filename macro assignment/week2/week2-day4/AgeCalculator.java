// Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.

import java.util.*;
import java.time.LocalDate; // for current date
import java.time.format.DateTimeFormatter; // date format
import java.time.Period;// to find the difference
class AgeCalculator{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    String dob;
    System.out.println("enter the date of birth");
    dob=sc.nextLine();

    LocalDate today=LocalDate.now(); // class for reading current date
    System.out.println("todays date is :");
    System.out.println(today);

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");// to specify the format you can edit the format)
    LocalDate dateOfBirth = LocalDate.parse(dob, dateFormat); // converting string into date format

    Period age= Period.between(dateOfBirth, today);
    System.out.println(age.getYears());
    if(age.getYears()>18)
      System.out.println(" adult");
    else
      System.out.println("minor");
  }
}