// Text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common words.
import java.util.*;
class Macroassignment3{
  
  static void countChar(String s){
    char c[]=s.toCharArray();
    int count=0;
    for(int i=0;i<c.length;i++){
      count++;
    }
    System.out.println("the number of alphabets are ");
    System.out.println(count);
  }
  
  static void countWords(String str){
    String s1[]=str.split(" ");
    int count=0;
    for(int i=0;i<s1.length;i++){
      count ++;
    }
    System.out.println("the number of words are :");
    System.out.println(count);
  }

  static void countDuplicates(String str){
    int count;
    String s[]=str.split(" ");
    for(int i=0;i<s.length;i++){
      count=1;
      for(int j=i+1;j<s.length;j++){
        if(s[i].equals(s[j])){
          count++;
          s[j]="0";
      }
    }
    if(count > 1 && s[i] != "0"){
      System.out.println("dupllicate words");
      System.out.println(s[i]);
    }
  }
}

  static void lineCount(String s){
    String str[]=s.split("\r\n|\r|\n");
    System.out.println("number of lines are");

    System.out.println(str.length);
  }
  
  public static void main(String argd[]){
    Scanner sc=new Scanner(System.in);
    String s="hello welcome to my channal hello";
    int count;
    countChar(s);
    countWords(s);
    countDuplicates(s);
    lineCount(s);
    
  }
}