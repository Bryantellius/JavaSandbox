import java.util.Scanner;

public class BasicCalculator {
    private static Scanner sc = new Scanner(System.in);

    public static void on() {
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("Result: " + calculate(a, b));
    }

    public static double calculate(double a, double b) {
        return a + b;
    }
}
