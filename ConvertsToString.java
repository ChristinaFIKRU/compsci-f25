/*
 * Christina Fikru
 * 10/06/2025
 * Converts miliseconds to string
 */

import java.util.Scanner;

public class ConvertsToString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user to enter milliseconds
            System.out.print("Enter the number of milliseconds: ");
            long millis = input.nextLong();

            // Display the result
            System.out.println("Converted time: " + convertMillis(millis));
        }
    }

    // The method converts milliseconds to a string hours:minutes:seconds
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }
}
