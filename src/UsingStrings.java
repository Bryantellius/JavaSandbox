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
            System.out.printf("%s is %d characters long.", testStr, testStrLength);
        }
    }
}
