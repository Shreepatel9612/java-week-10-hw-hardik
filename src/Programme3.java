import java.util.Arrays;
import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user for the size of the array and array elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(array);

        // Output: Display the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
        scanner.close();
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move indices towards each other
            left++;
            right--;
        }
    }
}
