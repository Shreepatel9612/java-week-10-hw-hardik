import java.util.HashMap;
import java.util.Map;

public class PeopleMap9 {
    public static void main(String[] args) {
        // Create a HashMap to store String keys (name) and Integer values (age)
        HashMap<String, Integer> people = new HashMap<>();

        // Add some people (name and age) to the map
        people.put("Raja", 30);
        people.put("Hardik", 25);
        people.put("Prashant", 35);
        people.put("Govind", 40);

        // Iterate through the map using a for-each loop
        System.out.println("People and their ages:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
