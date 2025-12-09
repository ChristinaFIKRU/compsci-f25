/*
 * Comparison between passing a primitive type to a method
 * and passing an array to a method
 * 
 * Primitive types are pass by value: the original is NOT changed
 * A copy of the Array reference is passed to the method: 
 * They point to the same array and the original can be changed
 * 
 */

public class TestPassArray 
{
	public static void main(String[] args) 
	{	
		//declare and create an array
		
		int [] a = {1, 2};
		
		//swap elements using the swap method: passing primitive types as arguments
		
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swap(a[0], a[1]);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");		

		//swap element using the swapFirstTwoInArray: passing an array as argument

		System.out.println("Before invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoInArray(a);
		System.out.println("After invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");			
	}
	
	public static void swap(int n0, int n1)
	{
		int temp = n0;
		n0 = n1;
		n1 = temp;
	}
	
	public static void swapFirstTwoInArray(int [] array)
	{
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}

}
