/*
 * Created by Christina Fikru 
 * Created on 09/14/2025
 * Programing Exercise Assignment 
 */

import java.util.Scanner;

public class DistanceWithFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//first point user input

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
		// This part shows the output essentially

        System.out.println("The distance between the two points is " + distance);

        input.close();
    }
}


		

		

	
	
			
	
		



	
	