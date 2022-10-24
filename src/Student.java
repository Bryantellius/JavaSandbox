public class Student {
    String firstName;
    String lastName;
    int expectedGraduationyear;
    double gpa;
    String declaredMajor;

    public Student(String firstName, String lastName, int expectedGraduationyear, double gpa, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationyear = expectedGraduationyear;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public void incrementGraduationYear() {
        expectedGraduationyear++;
    }

    public void incrementGraduationYear(int numOfYears) {
        expectedGraduationyear += numOfYears;
    }

    public void printStats() {
        System.out.printf("\nFirst Name: %s\nLast Name: %s\nExpected Graduation Year: %d\nGPA: %f\nMajor: %s\n", firstName, lastName, expectedGraduationyear, gpa, declaredMajor);
    }
}
