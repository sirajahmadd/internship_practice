import java.util.ArrayList;

public class ExtractElements {

    public static void main(String[] args) {
        
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Extract a portion of the ArrayList
        ArrayList<Integer> subList = new ArrayList<Integer>(numbers.subList(1, 4));
        
        // Print out the extracted sub-list
        System.out.println("The extracted sub-list is:");
        for(Integer num : subList) {
            System.out.println(num);
        }
    }

}