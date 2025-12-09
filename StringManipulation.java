/**
 	String manipulation:
 	
 	Ask the user to enter his/her favorite city and then calculate:
 	
 		-the number of characters of the string
 		-the city in upper case
 		-the city in lower case
 		-the first and the last character of the city name
 		
*/

import java.util.Scanner;	//needed to use the Scanner class

public class StringManipulation
{
	public static void main (String[] args)
	{
		//declarations
		
		String city, lCity, uCity;   //reference
		int num;   					//primitive
		char firstCharacter, lastCharacter; 	//primitive

		Scanner keyboard = new Scanner(System.in);	//create a Scanner object to read input -> reference as its an object


		//input
		
		System.out.print("Which is your favorite city? ");
		city = keyboard.nextLine();			//read the name

		//processing
		
		num = city.length();
		lCity = city.toLowerCase();
		uCity = city.toUpperCase();
		firstCharacter = city.charAt(0); //first character is at index 0
		lastCharacter = city.charAt(city.length()-1); //last character is at index length-1 because index starts at 0

		//output

		System.out.println("You entered: " + city); //echo the name back to the user
		System.out.println("Number of characters: " + num );
		System.out.println("City in uppercase letters: " + uCity );
		System.out.println("City in lowercase letters: " + lCity );
		System.out.println("The first charater in the city name is: " + firstCharacter );
		System.out.println("The last character in the city name is: " + lastCharacter);

	}




}