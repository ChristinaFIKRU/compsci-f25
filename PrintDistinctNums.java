/*
 * Christina Fikru
 * 10/09/2025
 * Print distinct numbers
 */

import java.util.Scanner;

public class PrintDistinctNums {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[10];
            int[] distinct = new int[10];
            int count = 0;

            System.out.print("Enter ten numbers: ");

        // Read 10 numbers. For each number, check whether it is already stored in
// the distinct[] array; if not, append it. After the loop distinct[0..count-1]
// and tehn holds the distinct numbers in the order they were first seen.

            for (int i = 0; i < 10; i++) {
                numbers[i] = input.nextInt();
                boolean isNew = true;

                for (int j = 0; j < count; j++) {
                    if (numbers[i] == distinct[j]) {
                        isNew = false;
                        break;
                    }
                }

                if (isNew) {
                    distinct[count] = numbers[i];
                    count++;
                }
            }

            System.out.println("The number of distinct numbers is " + count);
            System.out.print("The distinct numbers are: ");

            for (int i = 0; i < count; i++) {
                System.out.print(distinct[i] + (i < count - 1 ? " " : ""));
            }

            System.out.println();
        }
    }
}