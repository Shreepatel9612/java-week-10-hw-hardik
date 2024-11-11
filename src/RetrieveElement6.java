import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement6 {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        //  the ArrayList contents
        System.out.println("List of Colors: " + colors);

        //  user input for the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to retrieve: ");
        int index = scanner.nextInt();

        // Retrieve and display the element at the specified index
        if (index >= 0 && index < colors.size()) {
            String color = colors.get(index);
            System.out.println("Element at index " + index + ": " + color);
        } else {
            System.out.println("Invalid index! Please enter an index between 0 and " + (colors.size() - 1));
        }

        scanner.close();
    }
}
