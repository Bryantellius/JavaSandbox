import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
        Without constructor parameters
        Person testPerson = new Person();
        testPerson.firstName = "Test";
        testPerson.lastName = "Person";
        testPerson.dob = LocalDate.now();
        */

        // With Constructor parameters
        Person testPerson = new Person("Test", "Person", "2022-10-20");

        System.out.printf("%s %s", testPerson.firstName, testPerson.lastName);

        testPerson.greet();

        testPerson.greet("World");

        Coder webDev = new Coder("John", "Doe", LocalDate.now().toString(), "JavaScript");
        webDev.greet();
    }
}