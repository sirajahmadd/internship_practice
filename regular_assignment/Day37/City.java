// Create a class called "City" with attributes "name" and "population". Create an ArrayList of City objects and add 3 cities to it. Print the name and population of each city. Increase the population of one city by 100,000 and print the updated information.

import java.util.*;
class Cityy{
  String name;
  long pop;
  Cityy(String name,long pop){
    this.name=name;
    this.pop=pop;
  }
  
}
class City{
  public static void main(String args[]){
    ArrayList<Cityy> c=new ArrayList<Cityy>();
    System.out.println("enter city and population");
    Scanner sc=new Scanner (System.in);
    for(int i=0;i<2;i++){
      c.add(new Cityy(sc.next(),sc.nextLong()));
    }
    for(Cityy cit:c){
      System.out.println("city name:"+cit.name+" city population"+cit.pop);
    }

  }
}


// import java.util.ArrayList;

// class Cityy {
//     private String name;
//     private int population;

//     Cityy(String name, int population) {
//         this.name = name;
//         this.population = population;
//     }

//     String getName() {
//         return name;
//     }

//     int getPopulation() {
//         return population;
//     }

//     void setPopulation(int population) {
//         this.population = population;
//     }
// }

// public class City {
//     public static void main(String[] args) {

//         ArrayList<Cityy> cities = new ArrayList<>();
//         cities.add(new Cityy("New York City", 8399000));
//         cities.add(new Cityy("Los Angeles", 3999000));
//         cities.add(new Cityy("Chicago", 2706000));

//         for (Cityy city : cities) {
//             System.out.println("Name: " + city.getName());
//             System.out.println("Population: " + city.getPopulation());
//             System.out.println();
//         }

//         cities.get(1).setPopulation(cities.get(1).getPopulation() + 100000);

//         System.out.println("Updated information for " + cities.get(1).getName());
//         System.out.println("Population: " + cities.get(1).getPopulation());
//     }
// }