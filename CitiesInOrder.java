/* 
 * Christina Fikru
 * 09/22/2025
 * Displys cities in alphabetical order
 */

import java.util.Arrays;
import java.util.Scanner;

public class CitiesInOrder {
    //this is main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // This prompts the user to enter three cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine().trim();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine().trim();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine().trim();

        // this is where it stores the cities in an array
        String[] cities = {city1, city2, city3};

        // this is where it sorts the array in alphabetical order
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);

        // this is where it display the cities in alphabetical order
        System.out.println("The three cities in alphabetical order are: " 
                           + cities[0] + ", " + cities[1] + ", " + cities[2]);

        input.close();
    }
}
