/**
	Sales Report modularizing your code
	
	1) get the total daily sales during one week from the user
	2) calculate the average daily sales
	3) display total and average
	
	Each step should be handled by a different method
	
*/

import java.util.Scanner;

public class Sales
{
	public static void main(String [] args) 
	{
		//declarations
		
		final int NUMBER_DAYS = 7;
		double totalSales = 0.0;
		double averageSales = 0.0;
		
		//Task#1 get the total sales from the user
		
		totalSales = getTotalSales(NUMBER_DAYS);

		//Task#2 calculate the average

		averageSales = getAverageSales(totalSales, NUMBER_DAYS);

		//Task#3 display the total and average

		displayResults(NUMBER_DAYS, totalSales, averageSales);
	}

	public static double getTotalSales(int d) //one argument
	{

		Scanner kb = new Scanner(System.in); //scanner object
		double total = 0.0, sales = 0.0;

		for (int i = 1; i <= d; i++) //loop to get sales for each day
		{
			System.out.print("Enter sales for day " + i + ": ");
			sales = kb.nextDouble();// sales is double thus is why its double given everything has to be consitent
			total = total + sales; //total += kb.nextDouble();
		}

		//return the total sales

		return total;
	}

	public static double getAverageSales(double sales, int days)
	{
		return (sales/days);
	}

	public static void displayResults (int days, double sales, double average)
	{
		System.out.println ("The number of days " + days); 
		System.out.println ("The total sales are " + sales);
		System.out.println ("The average daily sales are " + average);
	} 
}// if the method is void it does not return anything 