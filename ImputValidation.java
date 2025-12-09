/*
 * Input validation
 * Enter a num 1-100
 */

import java.util.Scanner;

public class ImputValidation
  {
public static void main(String[] args)
{
 	double num; 
	Scanner kb = new Scanner (System.in);

}

	System.out.print("Enter a num b/n 1 and 100 inclusive: ");
	num = kb.nextDouble();



}while(num < 1 || num > 100); 

// while(!(num > 1 && num <=100)); if the number isn't in the range we want we keep asking

	System.out.println("thank youuuuuu");

 



