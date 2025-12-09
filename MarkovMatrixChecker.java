/*
 * Christina Fikru
 * 10/28/2025
 * it checks Markov matrix where it prompts the user to enter a 3 x 3 matrix of double values
 */
import java.util.Scanner;

public class MarkovMatrixChecker {

    // Method to check if a matrix is a positive Markov matrix
    public static boolean isMarkovMatrix(double[][] m) {
        // Basic null/empty check
        if (m == null || m.length == 0) {
            return false;
        }

        int n = m.length; // assuming it's an n x n matrix

        for (int i = 0; i < n; i++) {
            if (m[i] == null || m[i].length != n) {
                return false;
            }
        }

        // checks all elements are positive
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] <= 0) {
                    return false;
                }
            }
        }

        // check each column sums to 1 
        for (int col = 0; col < n; col++) {
            double sum = 0;
            for (int row = 0; row < n; row++) {
                sum += m[row][col];
            }
            if (Math.abs(sum - 1.0) > 1e-6) { 
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 3; 

        try (Scanner input = new Scanner(System.in)) {
            double[][] matrix = new double[n][n];

            System.out.printf("Enter a %dx%d matrix row by row:%n", n, n);

            // Read n x n matrix with input validation
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    while (!input.hasNextDouble()) {
                        System.out.printf("Invalid entry for [%d][%d]. Please enter a valid double: ", i, j);
                        input.next(); // consume invalid token
                    }
                    matrix[i][j] = input.nextDouble();
                }
            }

            // Check and display result
            if (isMarkovMatrix(matrix)) {
                System.out.println("It is a Markov matrix.");
            } else {
                System.out.println("It is not a Markov matrix.");
            }
        }
    }
}