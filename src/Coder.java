public class Coder extends Person {
    public String language;

    public Coder(String firstName, String lastName, String dob, String language) {
        super(firstName, lastName, dob);

        this.language = language;
    }

    @Override
    public void greet() {
        System.out.println("Hello world! My name is " + this.firstName + " " + this.lastName + " and I code in " + this.language + "!");
    }

    public void code() {
        System.out.println("Click clack I'm busy coding...");
    }
}
