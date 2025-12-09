/*
 *Example to illustrate the use of valur-returning method
 */

 import java.util.*;
 public class CalcMax
 {
    public static void main (String[] args)
{
        //declare variables
        double num1=0, num2=0, result=0; 
        Scanner kb = new Scanner(System.in);

        //get user input
        System.out.print("Enter two num separated by space: ");
        num1 = kb.nextDouble();
        num2 = kb.nextDouble();
        //call the method and store the return value in result

        // processing
        result = maxNum(num1, num2); //method call
        // these num 1 & 2 are different arguments as this one is part of the main

    //output
        displayOutput(num1, num2, result); //method call

    }
    
        public static void displayOutput(double n1, double n2, double res)
    {
        System.out.println("The max of " + n1 + " and " + n2 + " is " + res); //n1 and n2 are parameters
    }
    public static double maxNum(double n1, double n2) //double because the type of result is double

    { 
        //double maxValue = Math.max(n1, n2); //method defintion, this method only knows ab n2 and 2 
        //if we complie this method it will give an error because it does not know ab num1 and num2 and thers no return statment
        //return maxValue; //returning the value of maxValue to the calling method
        return Math.max(n1, n2); //can also be written like this

    }
 }

