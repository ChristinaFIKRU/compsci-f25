/*
 * Christina Fikru
 * 10/09/2025
 *
 * SortStudents reads N student names and scores, sorts students by score
 * in descending order, and prints the names with their scores.
 */

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        // Use try-with-resources so Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter number of students: ");
            if (!input.hasNextInt()) {

                System.out.println("Invalid number of students.");
                return;
            }

            int numberOfStudents = input.nextInt();

            String[] name = new String[numberOfStudents];
            double[] score = new double[numberOfStudents];

            // Read student data: name and score for each student
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Enter student name: ");
                if (!input.hasNext()) {
                    System.out.println("Missing student name.");
                    return;
                }

                name[i] = input.next();

                System.out.print("Enter score: ");
                if (!input.hasNextDouble()) {
                    System.out.println("Invalid or missing score for " + name[i]);
                    return;
                }
                score[i] = input.nextDouble();
            }

            // Sort students by score in descending order using a simple O(n^2) swap sort.
            for (int i = 0; i < numberOfStudents - 1; i++) {
                for (int j = i + 1; j < numberOfStudents; j++) {

                    if (score[j] > score[i]) {
                        double tempScore = score[i];
                        score[i] = score[j];
                        score[j] = tempScore;

                        String tempName = name[i];
                        name[i] = name[j];
                        name[j] = tempName;
                    }
                }
            }

            System.out.println("\nStudents sorted by scores from highest to lowest:");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println(name[i] + ": " + score[i]);
            }
        }
    }
}













