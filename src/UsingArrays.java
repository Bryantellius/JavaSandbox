import java.util.ArrayList;
import java.util.Arrays;

public class UsingArrays {
    public static void testAll() {
        printContents();

        arrayLists();
    }

    public static void printContents() {
        // creates an empty array of 5 length
        int[] numbers1 = new int[5];

        // creates a 5 length array storing the integers 1, 2, 3, 4, 5
        int[] numbers2 = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers1.length; i++) {
            // assigns an integer at the index i
            numbers1[i] = (i + 1) * 5;
        }

        // uses Array.toString()
        System.out.println("numbers1 contents: " + Arrays.toString(numbers1));
        System.out.println("numbers2 contents: " + Arrays.toString(numbers2));
    }

    public static void arrayLists() {
        ArrayList<String> names = new ArrayList<>();

        // add items
        names.add("Kvothe");
        names.add("Simmon");
        names.add("Wilem");

        // get item
        System.out.printf("The value at index 1 is: %s\n", names.get(1));

        // set item
        names.set(2, "Wil");

        System.out.printf("The value at index 2 is changed: %s\n", names.get(2));

        // remove
        names.remove(0);

        // size
        System.out.printf("The length of the ArrayList is now: %d\n", names.size());

        // contains
        System.out.printf("Names currently contains 'Kvothe': %b\n", names.contains("Kvothe"));

        // removeIf
        // removes names if they are less than 5 characters
        names.removeIf(name -> name.length() < 5);

        // toString
        System.out.printf("The names ArrayList is now: %s\n", names.toString());

        // clear
        names.clear();

        // isEmpty
        System.out.printf("The names ArrayList is now empty: %b\n", names.isEmpty());
    }
}
