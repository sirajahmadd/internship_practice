import java.util.ArrayList;

public class UpdateElementInArray {

    public static void main(String[] args) {
        
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        
        // Update an element in the ArrayList
        int index = 2; // the index of the element to be updated
        int newNumber = 5; // the new number to replace the old one
        numbers.set(index, newNumber);
        
        // Print the updated ArrayList
        System.out.println(numbers);
    }

}