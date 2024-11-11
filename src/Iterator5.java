import java.util.ArrayList;
import java.util.Iterator;

public class Iterator5 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        //Add cars arrylist
        cars.add("Maruti");
        cars.add("Audi");
        cars.add("Bugati");
        cars.add("TATA");
        cars.add("Hyundai");

        //Get iterator for the arrylist
        Iterator<String>iterator = cars.iterator();

        //Arraylist using the Iterator
        System.out.println("List of Cars:");
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name + " ");
        }
    }
}
