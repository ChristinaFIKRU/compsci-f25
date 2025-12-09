/*
 * Christina Fikru
 * 10/28/2025
 * it displays the location of the first element in the maximum square submatrix and the num rows
*/

import java.util.Scanner;

public class LargestBlock {
    public static void main(String[] args) {
        // Use try-with-resources and validate inputs
        try (Scanner input = new Scanner(System.in)) {
            // 1️⃣ Get matrix size
            System.out.print("Enter the number of rows in the square matrix: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid input for matrix size.");
                return;
            }
            int n = input.nextInt();
            if (n <= 0) {
                System.out.println("Matrix size must be a positive integer.");
                return;
            }

            int[][] matrix = new int[n][n];

            // 2️⃣ Get the matrix elements (0s and 1s)
            System.out.println("Enter the matrix row by row (0s and 1s):");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    while (!input.hasNextInt()) {
                        System.out.printf("Invalid entry for [%d][%d]. Please enter 0 or 1: ", i + 1, j + 1);
                        input.next(); // consume invalid token
                    }
                    int val = input.nextInt();
                    if (val != 0 && val != 1) {
                        System.out.println("Only 0 or 1 allowed. Exiting.");
                        return;
                    }
                    matrix[i][j] = val;
                }
            }

            findLargestBlock(matrix);
        }
    }

    public static void findLargestBlock(int[][] matrix) {
        int n = matrix.length;
        int[][] size = new int[n][n]; 
        int maxSize = 0;   
        int maxRow = 0;    
        int maxCol = 0;   

        for (int i = 0; i < n; i++) {
            size[0][i] = matrix[0][i];
            if (size[0][i] > maxSize) {
                maxSize = size[0][i];
                maxRow = 0;
                maxCol = i;
            }
            size[i][0] = matrix[i][0];
            if (size[i][0] > maxSize) {
                maxSize = size[i][0];
                maxRow = i;
                maxCol = 0;
            }
        }

        //  size[][] matrix for the rest
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    size[i][j] = 1 + Math.min(size[i - 1][j - 1],
                                               Math.min(size[i - 1][j], size[i][j - 1]));
                } else {
                    size[i][j] = 0;
                }

                // Tracks largest found
                if (size[i][j] > maxSize) {
                    maxSize = size[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        //if no 1s were found
        if (maxSize == 0) {
            System.out.println("No submatrix of 1s found.");
            return;
        }

        
        int startRow = maxRow - maxSize + 1;
        int startCol = maxCol - maxSize + 1;

        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d%n",
                          startRow + 1, startCol + 1, maxSize);
    }
}