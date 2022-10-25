import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

public class BasicCalculator {
    private static double a;
    private static double b;
    private static char op;
    private static ArrayList<Character> operators = new ArrayList<Character>(){{
        add('+');
        add('-');
        add('*');
        add('/');
    }};
    private static Scanner sc = new Scanner(System.in);

    public static void on() {
        a = getNumberInput("Enter value 1: ");
        b = getNumberInput("Enter value 2: ");
        op = getOperatorInput("Enter operation (+ - * /): ");

        System.out.println("Result: " + calculate());
    }

    public static double getNumberInput(String prompt) {
        try {
            System.out.println(prompt);
            return sc.nextDouble();
        } catch (InputMismatchException e) {
            sc.nextLine();
            return getNumberInput("You didn't input a number. Try again.");
        }
    }

    public static char getOperatorInput(String prompt) {
        try {
            System.out.println(prompt);
            char input = sc.next().charAt(0);
            if (!operators.contains(input)) throw new InputMismatchException("Invalid operator provided");
            else return input;
        } catch (InputMismatchException e) {
            sc.nextLine();
            return getOperatorInput("You didn't input a valid operation. Try one of the following: (+ -, * /) again.");
        }
    }

    public static double calculate() {
        switch(op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return a;
        }
    }
}
