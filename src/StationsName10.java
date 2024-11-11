import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StationsName10 {
    public static void main(String[] args) {
        // Create a HashMap to store station names and the lines they belong to
        Map<String, String> stationLines = new HashMap<>();

        // Populate the map with some Zone 1 station names and corresponding lines
        stationLines.put("Oxford Circus", "Central");
        stationLines.put("King's Cross St Pancras", "Victoria");
        stationLines.put("Liverpool Street", "Central");
        stationLines.put("Piccadilly Circus", "Bakerloo, Piccadilly");
        stationLines.put("Bank", "Central");
        stationLines.put("London Bridge", "Jubilee");
        stationLines.put("Waterloo", "Bakerloo");
        stationLines.put("Green Park", "Jubilee, Piccadilly, Victoria");

        // Get the station name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a station name (Zone 1): ");
        String station = scanner.nextLine();

        // Check if the station exists in the map
        if (stationLines.containsKey(station)) {
            String lines = stationLines.get(station);
            System.out.println("The following lines pass through " + station + ": " + lines);
        } else {
            System.out.println("Sorry, the station " + station + " is not in Zone 1 or doesn't exist in the system.");
        }

        scanner.close();
    }
}
