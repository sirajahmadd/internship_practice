import java.util.ArrayList;

public class SearchElement {

    public static void main(String[] args) {
        
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grape");
        
        // Search for the element "kiwi" in the ArrayList
        String searchElement = "kiwi";
        int index = fruits.indexOf(searchElement);
        
        // Check if the element is found or not
        if(index == -1) {
            System.out.println("Element not found in the ArrayList");
        }
        else {
            System.out.println("Element found at index: " + index);
        }
    }

}