// Write a Java class called Movie that has fields for the movie's title, director, and release year

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
  private String title,director;
  private int year;

  Movie(String title, String director, int year){
    this.title=title;
    this.director=director;
    this.year=year;
  }

  public int compareTo(Movie mm){
    if(year>mm.year){
      return -1;
    }
    else if(year<mm.year){
      return 1;
    }
    else{
      return 0;
    }
  }

  
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}

public class MovieComparable{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Movie> m=new ArrayList<Movie>();
    for(int i=0;i<3;i++){
      m.add(new Movie(sc.next(),sc.next(),sc.nextInt()));
    }
    Collections.sort(m);
    for(Movie mov:m){
      System.out.println(mov.getTitle()+"  "+mov.getDirector()+"  "+mov.getYear());
    }
  }
}
