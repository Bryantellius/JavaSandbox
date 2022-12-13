package cs1.bourke.samples;

import java.util.Scanner;

public class Basics {
    public static Scanner rl = new Scanner(System.in);

    /**
     * Prompts the user for a Fahrenheit number, and outputs the Celsius conversion.
     */
    public static void fahrenheitToCelsius() {
        System.out.println("What Fahrenheit temperature would you like to convert?");

        float fahrenheitInput = rl.nextFloat();
        float celsiusConversion = 5.0f / 9.0f * (fahrenheitInput - 32);

        System.out.printf("%3.2f °F is %3.2f °C", fahrenheitInput, celsiusConversion);

        rl.close();
    }

    /**
     * Prompts the user for a, b, and c coefficients from a quadratic equation and outputs the quadratic roots.
     */
    public static void findQuadraticRoots() {
        System.out.println("Enter a coefficient:");
        double a = rl.nextDouble();
        System.out.println("Enter b coefficient:");
        double b = rl.nextDouble();
        System.out.println("Enter c coefficient:");
        double c = rl.nextDouble();

        double sqrt = Math.sqrt(b * b - 4 * a * c);

        double r1 = (-b + sqrt) / (2 * a);
        double r2 = (-b - sqrt) / (2 * a);

        System.out.printf("The roots of %fx2 + %fx + %f are %f, %f", a, b, c, r1, r2);

        rl.close();
    }
}
