import java.util.ArrayList;
import java.util.List;

public class MainArray {
    public static void main(String[] args) {
        List<String> dynamicCities = new ArrayList<>(List.of("Tallinn", "Riga", "Vilnus", "Helsinki"));
        // list size
        System.out.println(dynamicCities.size());
        show(dynamicCities); // näita listi sisu
        // add new city into List
        dynamicCities.add("Amsterdam");
        dynamicCities.add("Stockholm");
        show(dynamicCities);
        // Gey Riga from List and show
        System.out.println(dynamicCities.get(1));
        // Add new city to index 2
        dynamicCities.add(2, "Boston"); // lisab keskele linna nime
        show(dynamicCities);
        // change Amsterdam to New York
        dynamicCities.set(5, "New York");
        show(dynamicCities);
        // Delete last city from list
        dynamicCities.remove(dynamicCities.size()-1);
        show(dynamicCities);

        // Create new String list with names (very long way)
        List<String> names;
        names = new ArrayList<>(); // Create empty list
        names.add("Mirko");
        names.add("Juhan");
        names.add("Mari");
        // TASK: Show List size and all elements
        System.out.println(names.size());
        show(names);
    }

    /**
     * dynamic cities list contents
     * @param cities List arguments
     */
    private static void show(List<String> cities) {
        for(String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println(); // reavahetus
    }
}
