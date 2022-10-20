import java.time.LocalDate;

public class Person {
    public String firstName;
    public String lastName;
    private LocalDate dob;

    public String getDob() {
        return this.dob.toString();
    }

    public void setDob(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = LocalDate.parse(dob);
    }

    public void greet() {
        System.out.println("Hello! My name is " + this.firstName);
    }

    public void greet(String name) {
        System.out.println("Hello " + name + "! My name is " + this.firstName);
    }
}
