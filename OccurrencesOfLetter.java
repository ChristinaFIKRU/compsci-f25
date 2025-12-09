//Christina Fikru
// 12/09/2025
// prompts user to enter a file name and displays the occurrences of each letter in the file

import java.util.*;
import java.io.*;

public class OccurrencesOfLetter {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        Scanner fileInput = new Scanner(file);

        // Array for 26 letters
        int[] counts = new int[26];

        // Count each letter
        while (fileInput.hasNext()) {
            String word = fileInput.next().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    counts[c - 'a']++;
                }
            }
        }

        // Print occurrences of each letter
        System.out.println("Occurrences of each letter:");
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('A' + i) + ": " + counts[i]);
        }

        // Find the three most common letters
        System.out.println("\nTop 3 most common letters:");
        for (int j = 0; j < 3; j++) {
            int maxIndex = 0;
            for (int i = 1; i < 26; i++) {
                if (counts[i] > counts[maxIndex]) {
                    maxIndex = i;
                }
            }
            System.out.println((char)('A' + maxIndex) + ": " + counts[maxIndex]);
            counts[maxIndex] = -1; // so it won't be chosen again
        }
    }
}
