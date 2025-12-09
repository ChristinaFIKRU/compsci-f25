/*
 * Array basics:
 * 
 * 1) array declaration
 * 2) array creation
 * 3) accessing the elements of an array
 * 4) populating an array
 */
public class ArrayBasics 
{
	public static void main(String[] args) 
	{
		//array declaration
		
		int [] arrayOfIntegers;			//arrayOfIntegers is a reference to an array of ints
		double [] arrayOfDoubles;		//arrayOfDoubles is a reference to an array f doubles
		String [] arrayOfStrings;		//arrayofStrings is a reference to an array of strings
		
		//array creation
		
		arrayOfIntegers = new int[10];		//creates an array of 10 integers
		arrayOfDoubles = new double[20];	//creates an array of 20 doubles
		arrayOfStrings = new String[5];		//creates an array of 5 strings
		
		//array declaration and creation can be done in the same statement
		
		int [] anotherArrayOfIntegers = new int[10];
		double [] anotherArrayOfDoubles = new double[20];
		String [] anotherArrayOfStrings = new String[5];
		
		//array declaration, creation and initialization can be done in one statement
		
		int [] numbers = {5, 4, 3, 2, 1};
		
		//populating and accessing the elements of an array
		
		numbers[0] = 5;
		numbers[1] = 4;
		numbers[2] = 3;
		numbers[3] = 2;
		numbers[4] = 1;
		
		numbers[1] = numbers[0] + 1;
		
		System.out.println("Value of element with index " + 1 + " is " + numbers[1]);
	}
}
