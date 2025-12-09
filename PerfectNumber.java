/*
 * Christina Fikru
 * Date: September 30, 2025
 *
 * computes perfect numbers between 1 and 10000
 */

import java.util.*;

public class PerfectNumber {
    // main method
    public static void main(String[] args) {
        // find and print perfect numbers between 1 and 10000
        for (int n = 2; n <= 10000; n++) {
            int sum = 0;

            // check divisors from 1 to n/2
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) { // if i is a divisor
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.println(n + " is a perfect number");
            }
        }
    }
}
