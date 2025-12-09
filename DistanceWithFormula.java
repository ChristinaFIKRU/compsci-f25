/*
 * Created by Christina Fikru 
 * Created on 09/14/2025
 * Distance With Formula
 */
import java.util.Scanner;

public class DistanceWithFormula {
    public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)){
        // Prompt the user to enter the coordinates of two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);

        // Display the formula and the result
        System.out.println("The distance between the two points is " + distance);

        input.close();
    }


    }
    
    }

