import java.util.ArrayList;

public class ColorList4 {
    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>();

        //Add Color List
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("Yellow");
        color.add("Green");

        //Using for each loop
        System.out.println("List of Color:");
        for (String name : color ) {
            System.out.println(name + " ");
        }
    }
}
