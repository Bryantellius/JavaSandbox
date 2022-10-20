import java.util.HashMap;

public class UsingHashMaps {
    public static void testAll() {
        System.out.println("Practice 1:");
        statePopulationPractice();
    }

    public static void statePopulationPractice() {
        HashMap<String, Integer> statePopulations = new HashMap<>();

        // put, adds to a HashMap
        statePopulations.put("California", 39613493);
        statePopulations.put("Texas", 29730311);
        statePopulations.put("Florida", 21944577);

        showHashMap(statePopulations, "After .put(California, Texas, Florida)");

        // putIf, only adds if not present
        statePopulations.putIfAbsent("New York", 19299981);

        showHashMap(statePopulations, "After .putIfAbsent(New York)");

        // get, retrieves a value by a key
        statePopulations.get("New York"); // 19299981
        statePopulations.get("Alabama"); // null since it does not exist on the HashMap

        // getOrDefault, retrieves a value or the default if it does not exist
        statePopulations.getOrDefault("Alabama", 0); // 0, since there is no value at the key "Alabama"

        // containsKey, checks if a key exists
        if (statePopulations.containsKey("California")) {
            System.out.println("Successfully finds 'California'");
        }

        // containsValue, checks if a value exists
        if (statePopulations.containsValue(29730311)) {
            System.out.println("Successfully finds 29730311 at 'Texas'");
        }

        // forEach, iterates over each key,value pair and calls a predicate function
        statePopulations.forEach((state, population) -> System.out.printf("\n%s has a population of %d", state, population));

        // clear, removes all key/value pairs
        statePopulations.clear();

        showHashMap(statePopulations, "After .clear()");

        // isEmpty, checks if the HashMap is empty
        if (statePopulations.isEmpty()) {
            System.out.println("Finished!");
        } else {
            System.out.println("Something is not right.. HashMap should be empty.");
        }
    }

    public static void showHashMap(HashMap<String, Integer> hashMap, String message) {
        System.out.printf("\n%s:\n%s\n", message, hashMap.toString());
    }
}
