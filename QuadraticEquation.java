/* 
 * Christina Fikru
 * 09/22/2025
 * Obtaing a qudaratic equation
 */


import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        // this prompts the user to enter values for a, b, and c
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        // Check if a is zero (not a quadratic equation)
        
        if (a == 0) {
            System.out.println("This is not a quadratic equation because 'a' cannot be 0.");
            input.close();
            return;
        }

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        System.out.println("The discriminant is: " + discriminant);

        // this determines and display the roots based on the discriminant
        if (discriminant > 0) {
            // if two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a); 
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a); 
            System.out.println("The equation has two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // if one real root
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } else {
            // if no real roots
            System.out.println("The equation has no real roots.");
        }

        input.close();
    }
}
