import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {
        
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grape");
        
        // Remove the third element from the ArrayList
        fruits.remove(2);
        
        // Print the updated ArrayList
        System.out.println(fruits);
    }

}