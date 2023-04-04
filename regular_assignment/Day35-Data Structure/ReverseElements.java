import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {

    public static void main(String[] args) {
        
        // Create an ArrayList of strings
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        for(String col:colors){
          System.out.println(col);
        }
        // Reverse the elements in the ArrayList
        Collections.reverse(colors);
        
        // Print out the reversed ArrayList
        System.out.println("The reversed colors are:");
        for(String color : colors) {
            System.out.println(color);
        }
    }

}