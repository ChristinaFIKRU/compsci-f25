/*
 * Christina Fikru
 * 10/06/2025
 * Prompts the user to enter string and a character
 */

import java.util.Scanner;

public class NumberOccurrences {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user for a string
            System.out.print("Enter a string: ");
            String str = input.nextLine();

            // Prompt user for a character (validate input)
            System.out.print("Enter a character: ");
            String chInput = input.nextLine();
            if (chInput.length() == 0) {
                System.out.println("No character entered.");
                return;
            }
            char ch = chInput.charAt(0);

            // Display the result
            System.out.println("The character '" + ch + "' occurs " + count(str, ch) + " times in the string.");
        }
    }

    // The method returns the number of occurrences of a character in a string
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
