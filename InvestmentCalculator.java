/*
 * Created by Christina Fikru 
 * Created on 09/14/2025
 * Investment Calculator 
 */

import java.util.Scanner; 
public class InvestmentCalculator  {
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
//this is were we get the user input
    System.out.print("Enter the investment amount: ");
    double investmentAmount = input.nextDouble();

    System.out.print("Enter the annual interest rate (e.g., 2.92): ");
    double investmentInterestRate = input.nextDouble();

    System.out.print("Enter the number of years: ");
    int investmentOfYears = input.nextInt();

//this is were we calculate/equation the investment 
    investmentInterestRate = investmentInterestRate / 100;
    double futureInvestmentValue = investmentAmount * Math.pow ((1 + investmentInterestRate / 12), (investmentOfYears * 12));

// this is where the output is displayed
System.out.printf("Future Value is: %.2f%n", futureInvestmentValue);

input.close();



    }
}


