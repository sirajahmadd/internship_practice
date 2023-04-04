import java.util.ArrayList;

public class CopyArrayList {

    public static void main(String[] args) {
        
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<String>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");
        sourceList.add("Yellow");
        
        // Create the destination ArrayList
        ArrayList<String> destList = new ArrayList<String>();
        
        // Copy the elements from the source ArrayList to the destination ArrayList
        for(String color : sourceList) {
            destList.add(color);
        }
        
        // Print out the contents of the destination ArrayList
        System.out.println("The colors in the destination ArrayList are:");
        for(String color : destList) {
            System.out.println(color);
        }
    }

}