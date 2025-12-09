/*
 * Created by Christina Fikru 
 * Created on 09/14/2025
 * Vertices of a triangle
 */
import java.util.Scanner;

public class TriangleVerticesCalculator {
public static void main(String[] args){
    try(Scanner input = new Scanner (System.in)){

        //this is were we get the user input
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3:");
        double y3 = input.nextDouble();

        //this is were we calculate/equation the vertices of a triangle

        double dx = x3 - x2 -x1;
        double dy = y3 - y2 -y1;
        double vertices = Math.sqrt(dx * dx + dy * dy);

        // Display the formula and the result
        System.out.println("The vertices of the triangle is " + vertices);

        input.close();

    }
}
}
