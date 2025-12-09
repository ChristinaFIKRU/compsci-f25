/*
 * Christina Fikru
 * 10/28/2025
 *Prompts to enter the number of cities and the locations of the cities and finds the 
 * centeral city and its total to all other objects
 */

import java.util.Scanner;

public class CenteralCity {
    public static void main(String[] args) {
        // Use try-with-resources to ensure Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {

            // this asks the user for number of cities
            System.out.print("Enter the number of cities: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid number of cities.");
                return;
            }
            int numberOfCities = input.nextInt();

            if (numberOfCities <= 0) {
                System.out.println("No cities to process.");
                return;
            }

            double[][] cities = new double[numberOfCities][2];

            System.out.println("Enter the coordinates of the cities:");
            for (int i = 0; i < numberOfCities; i++) {

                // validate that two doubles are available
                while (!input.hasNextDouble()) {
                    System.out.print("Please enter a valid x coordinate: ");
                    input.next();
                }
                cities[i][0] = input.nextDouble(); // x-coordinate
                while (!input.hasNextDouble()) {
                    System.out.print("Please enter a valid y coordinate: ");
                    input.next();
                }
                cities[i][1] = input.nextDouble(); // y-coordinate
            }

            //  Finding the central city
            int centralCityIndex = 0;
            double minTotalDistance = Double.MAX_VALUE;

            for (int i = 0; i < numberOfCities; i++) {
                double totalDistance = 0;

                for (int j = 0; j < numberOfCities; j++) {
                    if (i != j) {
                        totalDistance += distance(cities[i][0], cities[i][1], cities[j][0], cities[j][1]);
                    }
                }

                if (totalDistance < minTotalDistance) {
                    minTotalDistance = totalDistance;
                    centralCityIndex = i;
                }
            }

            // display result
            System.out.printf("The central city is at (%.2f, %.2f)%n", 
                              cities[centralCityIndex][0], cities[centralCityIndex][1]);
            System.out.printf("The total distance to all other cities is %.2f%n", minTotalDistance);
        }
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}