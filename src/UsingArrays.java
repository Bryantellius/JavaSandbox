import java.util.Arrays;

public class UsingArrays {
    public static void testAll() {
        printContents();
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
}
