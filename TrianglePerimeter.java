/* 
 * Christina Fikru
 * 09/22/2025
 * Obtaing a Triangle perimeter
 */


import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

// this prompts the user to enter the lengths of the three sides of the triangle
        System.out.print("Enter length of edge 1: ");
        double edge1 = input.nextDouble();

        System.out.print("Enter length of edge 2: ");
        double edge2 = input.nextDouble();

        System.out.print("Enter length of edge 3: ");
        double edge3 = input.nextDouble();
//this is where it validate if it can form a triangle
    if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1 )){
        double perimeter = edge1 + edge2 + edge3;
        System.out.println("The perimeter of the triangle is :" + perimeter);
    } else {
        //if this is invalid this will be the output/display
        System.out.println("This input is invalid and doesn't form a triangle.");

    }
    input.close();
    }

    }




