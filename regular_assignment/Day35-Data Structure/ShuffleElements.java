import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {

    public static void main(String[] args) {
        
        // Create an ArrayList of strings
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        // Shuffle the elements in the ArrayList
        Collections.shuffle(colors);
        
        // Print out the shuffled ArrayList
        System.out.println("The shuffled colors are:");
        for(String color : colors) {
            System.out.println(color);
        }
    }

}