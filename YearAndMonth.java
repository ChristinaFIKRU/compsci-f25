/* 
 * Christina Fikru
 * 09/22/2025
 * Obtaing a Year and month 
 */

import java.util.Scanner;

public class YearAndMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Prompt the user to enter the first three letters of a month
        System.out.print("Enter the first three letters of the month (e.g., Jan, Feb): ");
        String month = input.next();

        int days = 0; // Variable to store the number of days

        // Determine the number of days in the month
        switch (month) {
            case "Jan": days = 31; break;
            case "Feb":
                // Check for leap year
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28; // Non-leap year
                }
                break;
            case "Mar": days = 31; break;
            case "Apr": days = 30; break;
            case "May": days = 31; break;
            case "Jun": days = 30; break;
            case "Jul": days = 31; break;
            case "Aug": days = 31; break;
            case "Sep": days = 30; break;
            case "Oct": days = 31; break;
            case "Nov": days = 30; break;
            case "Dec": days = 31; break;
            default:
                System.out.println("Invalid month entered.");
                input.close();
                return; // Exit the program if the input is invalid
        }

        // Display the result
        System.out.println(month + " " + year + " has " + days + " days.");

        input.close();
    }
}
