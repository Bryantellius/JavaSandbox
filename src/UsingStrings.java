import java.util.Scanner;

public class UsingStrings {
    public static void creating() {
        // String Literal
        String city = "Birmingham";
        // or String Constructor
        String state = new String("Alabama");

        System.out.println(city + ", " + state);
    }

    public static void concatenating() {
        String fname = "Ben";
        String lname = "Bryant";

        System.out.println(fname + " " + lname);
    }

    public static void formatting() {
        String fullName = "Ben Bryant";
        int age = 25;
        // string and decimal integer
        String result = String.format("Hello my name is %s and I am %d years old.", fullName, age);
        System.out.println(result);

        // string, boolean, float, and scientific notation
        float ageInDays = age * 365.25f;
        boolean isOfAge = age > 21;

        result = String.format("Hello, %s is %f days old. He is %e old as well. Is he old enough? Answer: %b.", fullName, ageInDays, ageInDays, isOfAge);
        System.out.println(result);
    }

    public static void methods() {
        String testStr = "Hello World!";
        // length
        int testStrLength = testStr.length();
        // isEmpty
        if (testStr.isEmpty()) {
            System.out.println("Uh oh. The testStr is empty!");
        } else {
            // split
            String[] words = testStr.split(" ");

            System.out.printf("The words in '%s' are:\n", testStr);

            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i].toUpperCase());
            }

            // contains
            System.out.printf("\n%s contains 'World': %b", testStr, testStr.contains("World"));

            // replace (replaceAll will replace all occurrences of the substring)
            System.out.printf("\nIn '%s', 'l' characters will be replaced with '1' characters: %s", testStr, testStr.replaceAll("l", "1"));

            // equals and toLowerCase
            System.out.printf("\n%s is the same as %s", testStr, testStr.toLowerCase());
        }

        System.out.printf("\n%s is %d characters long.", testStr, testStrLength);
    }

    public static void takingInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who are you?");

        String name = scanner.nextLine();

        System.out.printf("Welcome back, %s! What is your id number?\n", name);

        int id = scanner.nextInt();

        // clears the newline character from the enter key
        scanner.nextLine();

        System.out.printf("Logged in as User-%d. What is your department name?\n", id);

        String department = scanner.nextLine();

        System.out.printf("Looking up details for %s-%d...", department, id);

        scanner.close();
    }
}
