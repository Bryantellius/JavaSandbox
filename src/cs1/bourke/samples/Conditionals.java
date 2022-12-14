package cs1.bourke.samples;

import java.util.Scanner;

public class Conditionals {
    public static Scanner rl = new Scanner(System.in);

    public static void calculateMealDiscount() {
        System.out.println("Enter sub total:");
        double subTotal = rl.nextDouble();

        int discountPercentage = 0;

        System.out.println("Do you have a discount? (yes/no)");
        boolean hasDiscount = rl.next().equals("yes");

        if (hasDiscount) {
            System.out.println("Enter the discount percentage amount:");
            discountPercentage = rl.nextInt();
        }

        if (discountPercentage > 100) {
            System.out.println("Error! Discount cannot be more than 100%");
        } else {
            double discount = 0;
            if (discountPercentage > 0) {
                discount = subTotal / discountPercentage;
            }
            double discountTotal = subTotal - discount;
            double tax = 0.15 * discountTotal;
            double total = discountTotal + tax;

            System.out.printf("Sub Total: %f\nDiscount Total: %f\nTax: %f\n==========\nTotal: %f", subTotal, discountTotal, tax, total);
        }

        rl.close();
    }

    public static void determineQuadrant() {
        System.out.println("Enter the x coordinate:");
        int x = rl.nextInt();

        System.out.println("Enter the y coordinate:");
        int y = rl.nextInt();

        String output;


        if (x == 0 || y == 0) {
            if (x == 0 && y == 0) {
                output = "Coordinate lies in the center";
            } else if (x == 0) {
                output = "Coordinate lies on the y-axis";
            } else {
                output = "Coordinate lies on the x-axis";
            }
        } else {
            if (x > 0 && y > 0) {
                output = "Coordinate lies in the 1st Quadrant";
            } else if (x > 0 && y < 0) {
                output = "Coordinate lies in the 4th Quadrant";
            } else if (x < 0 && y < 0) {
                output = "Coordinate lies in the 3rd Quadrant";
            } else {
                output = "Coordinate lies in the 2nd Quadrant";
            }
        }

        System.out.println(output);
    }
}
