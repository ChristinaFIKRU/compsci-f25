/*
 * Created by Christina Fikru 
 * Created on 09/14/2025
 * Wind Chill Calculator
 */
import java.util.Scanner;

public class WindChillCalculator {
public static void main(String[] args){
    try(Scanner input = new Scanner (System.in)){
        //this is were we get the user input

        System.out.print("Enter the wind speed in Farenheit: ");
        double t = input.nextDouble();
        System.out.print("Enter the wind speed in mph: ");
        double w = input.nextDouble();

        //this is were we calculate/equation the wind chill

        double windChill = 35.74 + (0.6215 * t) - (35.75 * Math.pow(w, 0.16)) + (0.4275 * t * Math.pow(w, 0.16));
        System.out.printf("The wind chill is %.2f degrees Farenheit.%n", windChill);
        
        input.close();
    }
}
}






