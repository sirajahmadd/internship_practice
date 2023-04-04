import java.util.ArrayList;
import java.util.Collections;

public class SortElements {

    public static void main(String[] args) {
        
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        
        // Sort the ArrayList in ascending order
        Collections.sort(numbers);
        
        // Print the sorted ArrayList
        System.out.println(numbers);
    }

}