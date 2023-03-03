// //  1. String Replacer: 
// // Create an application that takes a string and a word as input and replaces all occurrences 
// //   of the word with another word.
// //   Use strings to manipulate the input string

import java.util.*;

class Macroassignment1 {
  static void replacee(String str, String word, String replace) {

    System.out.println(str.replace(word, replace));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str="hello bitlabs how are you";

    System.out.println("enter word");
    String word = sc.nextLine();
    System.out.println("enter replacing word");
    String replace = sc.nextLine();

    replacee(str, word, replace);
  }

}