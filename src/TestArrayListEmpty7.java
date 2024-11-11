import java.util.ArrayList;

public class TestArrayListEmpty7 {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();

        // Check if the ArrayList is empty using the isEmpty() method
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add an element to the ArrayList
        colors.add("Red");

        // Check again if the ArrayList is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
