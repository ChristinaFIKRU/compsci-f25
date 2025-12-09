/*
 * Christina Fikru
 * Date: September 30, 2025
 *
 * computes DEcimal to binary including negative numbers
 */

import java.util.*;

public class DecimalToBinary {
    // main method
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            // Prompt the user to enter two decimal numbers
            System.out.print("Enter the first decimal number: ");
            int first = input.nextInt();

            System.out.print("Enter the second decimal number: ");
            int second = input.nextInt();

            System.out.println("First number (decimal): " + first + " -> binary: " + toBinary(first));
            System.out.println("Second number (decimal): " + second + " -> binary: " + toBinary(second));
        }
    }

    // Convert an integer to its binary representation as a string.
    // Handles zero and negative numbers (prefixes with '-').
    public static String toBinary(int n) { // helper method
        if (n == 0) return "0";
        boolean negative = n < 0;
        long value = negative ? -(long) n : n; // use long to avoid overflow on Integer.MIN_VALUE since we cant use integer.toBinaryString() to simplify 
    

        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.append(value % 2 == 0 ? '0' : '1');
            value /= 2;
        }
        if (negative) sb.append('-'); // add negative sign if needed
        return sb.reverse().toString();
    }
}