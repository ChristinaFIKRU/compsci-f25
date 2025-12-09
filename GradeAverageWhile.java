/* grade average with for loop */

import java.util.Scanner;

public class GradeAverageWhile
{
	public static void main(String [] args)
	{
		//declarations
		double grade, total, average;
		int count;
		Scanner kb = new Scanner(System.in);

		// input and processing

		total = 0;
		count = 0;
		grade = 1;
		while (grade != -1)   //managment of the loop
		{
			System.out.print("Enter a grade (-1 to stop): ");	//-1 is a sentinel
			grade = kb.nextDouble();
			if (grade >=0)
			{
				total = total + grade;
				count = count +1;
			}			
		}
		
		average = total / count;

		//output
		System.out.println("The average is " + String.valueOf(average));
	}
}