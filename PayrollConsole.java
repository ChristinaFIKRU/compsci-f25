/*
 * payroll console using the scanner
*/

import java.util.Scanner;

public class PayrollConsole
{
	public static void main(String[] arg)
	{
		//declarations
		String name; 
		int hours; 
		double payrate, grossPay; 

		Scanner kb = new Scanner(System.in);

		//input
	
		System.out.print("Enter your name: ");
		name = kb.nextLine();
	
		System.out.print("Enter the hours: ");
		hours = kb.nextInt();

		System.out.prin("Enter your pay rate");
		payrate = kb.nextDouble();

		//processing
		grossPay = hours * payrate;

		//output

		System.out.println(name + ", your gross pay is $" + grossPay);

}