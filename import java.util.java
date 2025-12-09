import java.util.Scanner;

public class DistanceWithFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = getValidDouble(input, "Enter x1: ");
        double y1 = getValidDouble(input, "Enter y1: ");
        double x2 = getValidDouble(input, "Enter x2: ");
        double y2 = getValidDouble(input, "Enter y2: ");

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        // Display the formula and the result
        System.out.println("\nFormula: √((x2 - x1)² + (y2 - y1)²)");
        System.out.printf("Calculation: √((%.2f - %.2f)² + (%.2f - %.2f)²)%n", x2, x1, y2, y1);
        System.out.printf("Distance: %.4f%n", distance);
    }

    public static double getValidDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}