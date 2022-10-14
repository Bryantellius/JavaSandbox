import java.util.Scanner;

public class UsingConditions {
    public static void testAll() {
        System.out.println("\n======\nConditional Statements\n======");

        ifElse();

        switchCase();
    }

    public static void ifElse() {
        String secret = "LUCIUS FOX";
        Scanner scanner = new Scanner(System.in);

        System.out.println("..'Type your name when you are finished'..");

        String answer = scanner.nextLine();

        if (secret.equals(answer.toUpperCase())) {
            System.out.println("System shutting down...");
        } else {
            System.out.println("Incorrect Passcode >:(");
        }
    }

    public static void switchCase() {
        Scanner scanner = new Scanner(System.in);
        String operators = "+-*/";

        System.out.print("First number: ");

        int x = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Operation ('+', '-', '*', '/'): ");

        String op = scanner.next();

        scanner.nextLine();

        if (!operators.contains(op)) {
            System.out.println("Invalid operator.\nGood bye!");
        } else {
            System.out.print("Second number: ");

            int y = scanner.nextInt();

            scanner.nextLine();

            double result;

            switch (op) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
                default:
                    result = 0;
            }

            System.out.printf("%d %s %d = %f", x, op, y, result);
        }
    }
}
