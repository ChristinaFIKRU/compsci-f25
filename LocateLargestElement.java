/*
 * Christina Fikru
 * 10/28/2025
 * Locate the largest element in a 2D array and return its row and column index
 */

import java.util.Scanner;

public class LocateLargestElement {

    // Returns a two-element array containing the row and column of the largest
    
    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2]; // location[0] = row, location[1] = column

        // Start with the first element as the maximum
        double max = a[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        // Read matrix dimensions and elements from the user
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows and columns in the array: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid input for number of rows.");
                return;
            }
            int rows = input.nextInt();
            if (!input.hasNextInt()) {
                System.out.println("Invalid input for number of columns.");
                return;
            }
            int columns = input.nextInt();

            if (rows <= 0 || columns <= 0) {
                System.out.println("Rows and columns must be positive integers.");
                return;
            }

            double[][] array = new double[rows][columns];

            System.out.println("Enter the array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    // Read next double; assume well-formed input for simplicity
                    while (!input.hasNextDouble()) {
                        // Skip invalid tokens and prompt user
                        System.out.print("Please enter a valid number: ");
                        input.next();
                    }
                    array[i][j] = input.nextDouble();
                }
            }

            int[] location = locateLargest(array);
            System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
        }
    }
}
