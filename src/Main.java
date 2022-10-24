public class Main {
    public static void main(String[] args) {
        Student kvothe = new Student("Kvothe", "Unknown", 2022, 3.7, "Music");
        Student simmon = new Student("Simmon", "Unknown", 2024, 4.0, "Alchemy");

        simmon.incrementGraduationYear();

        kvothe.printStats();

        simmon.printStats();
    }
}