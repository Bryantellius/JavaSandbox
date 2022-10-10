public class Main {
    public static void main(String[] args) {
        double daysInYear = 365.25;
        int daysOld = 25 * (int)daysInYear; // explicitly converted to int of 365

        System.out.println("You are " + daysOld + " old.");
    }
}