/*
 * Christina Fikru
 * 10/06/2025
 * It returns the reversal of interger
 */

 import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }

    // the method returns the reversal of an integer, i.e., reverse(456) should return 654
    public static int reverse(int number) {
        int sign = number < 0 ? -1 : 1;
        int n = Math.abs(number);
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10; // extract last digit
            // detect potential overflow before it happens
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                // overflow would occur; return 0 as a sentinel (not reversible safely)
                return 0;
            }
            reversed = reversed * 10 + digit; // build reversed number
            n /= 10; // remove last digit
        }
        return reversed * sign;
    }

    // the method returns true if number is a palindrome
    public static boolean isPalindrome(int number) {
        if (number < 0) return false; // negative numbers are not considered palindromes
        return number == reverse(number);
    }
}
