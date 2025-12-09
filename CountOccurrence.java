/*
 * Christina Fikru
 * 10/09/2025
 * Count occurrence of numbers
 * (Count occurrence of numbers) Write a program that reads integers between 
1 and 100 and counts the occurrence of each (you should store the numbers in an array). Output 
should be in ascending order. Assume the input ends when the user enters a 0. Here is a sample 
run of the program:
Enter integers between 1 and 100 (enter 0 to stop): 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
 * 
 */

import java.util.Scanner;

public class CountOccurrence {

    public static void main(String[] args) {
        int[] counts = new int[101];

        System.out.println("Enter integers between 1 and 100 (enter 0 to stop):");

        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                if (!input.hasNextInt()) {
                    input.next(); // skip non-integer token
                    continue;
                }

                int number = input.nextInt();
                if (number == 0) {
                    break; // end of input
                }

                if (number >= 1 && number <= 100) {
                    counts[number]++;
                } else {
                    // ignore values outside 1-100 (optional: print a warning)
                }
            }
        }

        // Print results in ascending order
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " " + (counts[i] == 1 ? "time" : "times"));
            }
        }
    }
}
