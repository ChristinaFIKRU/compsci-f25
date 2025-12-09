/*
 * Created by Christina Fikru 
 * Created on 09/14/2025
 * Programing Exercise Assignment 
 */

import java.until.Scanner;
public class DistanceWithFormula {
	public static void main (String[] args) {

		//first point user input
		Scanner input = new Scanner (System.in); 
		double x1 = getVaildDouble(input, "Enter x1: ");
		double y1 = getVaildDouble(input, "Enter y1: ");
		double x2 = getVaildDouble(input, "Enter x2: ");
		double y2 = getVaildDouble(input, "Enter y2: ");

		//this calculates the horizontal and vertical distance 
		double dx = x2 - x1;
		double dy = y2 - y1;
		double distance = Math.sqrt(Math.pow (dx, 2)+ Math.pow (dy,2));

		// This part shows the formula and result essentially 
		System.out.println("\nFormula: \u221A ((x2-x1)\u00B2 + \u221A(y2-y1)\u00B2))");
		System.out.printf("Calculation: \u221A ((%.2f - %.2f)\u00B2 +\u22A1(%.2f-%.2f)\u00B2)%n",x2,x1,y2,y1;
		System.out.printf("Double: %.4f%n", distance); 

System.out.println("\nFormula: √((x2 - x1)² + (y2 - y1)²)");
        System.out.printf("Calculation: √((%.2f - %.2f)² + (%.2f - %.2f)²)%n", x2, x1, y2, y1);
	
	//output
	public static void getValidDouble(Scanner scanner,  String prompt) {
		while (true){
			System.out.print(prompt);
			if (scanner. hasNextDouble()){
				return scanner.nextDouble();
			}else {
				System.out.println("Invaild input. Enter numeric value.");
				scanner.next();
			}
			}
		}
	}
}

	
	