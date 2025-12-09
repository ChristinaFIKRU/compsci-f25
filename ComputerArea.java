/*
 * Christina Fikru
 * 10/06/2025
 * isValid and area method to find the three sides of a triangle
 */

 import java.util.Scanner;

public class ComputerArea {
    public static void main(String[] args) {
        // use try-with-resources so Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user to enter three sides
            System.out.print("Enter the three sides of the triangle with enter followed each value: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            // basic validation: sides must be positive
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("All sides must be positive numbers.");
                return;
            }

            // Check if the triangle is valid
            if (isValid(side1, side2, side3)) {
                System.out.println("The area of the triangle is " + area(side1, side2, side3));
            } else {
                System.out.println("The input is invalid. The sum of any two sides must be greater than the third side.");
            }
        }
    }

    // the method returns true if the sum of any two sides is greater than the third side
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
               (side1 + side3 > side2) &&
               (side2 + side3 > side1);
    }

    // the method returns the area of the computer area using Heron's formula
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
