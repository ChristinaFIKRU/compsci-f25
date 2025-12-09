/*
 * Processing arrays:
 * 
 * -asking a user to populate an array
 * -calculate the total and average
 * -calculate the maximum
 * -calculate the minimum 
 */
import java.util.Scanner;

public class ProcessingArrays 
{
	public static void main(String[] args) 
	{	
		//declarations
		
		double [] myList;					 		//declare an array: i.e. create a reference to an array of doubles
		int n, locMax = 0, locMin = 0;
		double total, average, maximum, minimum;
		
		Scanner kb = new Scanner(System.in);
		
		//input
		
		System.out.print("How many numbers you want to enter? ");
		n = kb.nextInt();
		
		myList = new double[n]; 					//now we can create the array because we now the size
		
		for (int i = 0; i < myList.length; i++)	//ask the user to enter the numbers
		{
			System.out.print("Enter a number: ");
			myList[i] = kb.nextDouble();
		}
		
		//processing
		
		//to get the total

		total = 0;
		for (int i = 0; i < myList.length; i++)
		{
			total = total + myList[i];
			
		}									
		
		//to get the average
		
		average = total / n;
		
 		//to get the maximum and the index of the maximum in the array
		
		maximum = myList[0];

		for (int i = 0; i < myList.length; i++)
		{
			if (myList[i] > maximum)
			{
				maximum = myList[i];
				locMax = i;
			}	
		}				
		
 		//to get the minimum and the index of the minimum in the array
		
		minimum = myList[0];

		for (int i = 0; i < myList.length; i++)
		{
			if (myList[i] < minimum)
			{
				minimum = myList[i];
				locMin = i;
			}			
		}			
		
		//output all results
		
		System.out.println("The total is: " + total);
		System.out.println("The average is " + average);
		System.out.println("The maximum is " + maximum);		
		System.out.println("The index of the maximum is " + locMax);		
		System.out.println("The minimum is " + minimum);
		System.out.println("The index of the minimum is " + locMin);
	}
}
