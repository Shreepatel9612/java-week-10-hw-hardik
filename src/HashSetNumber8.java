import java.util.HashSet;

public class HashSetNumber8 {
    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet<>();

        // Add numbers to the HashSet
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}
