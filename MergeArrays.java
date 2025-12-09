/*
 * Copying arrays using two techniques:
 * 
 * 1) Loop method
 * 2) System.arraycopy()
 */
public class MergeArrays 
{
	public static void main(String[] args) 
	{		
		int [] arrayInt1 = {1, 2, 3};
		int [] arrayInt2 = {4, 5, 6};
		
		int [] mergeArrayInt = merge (arrayInt1, arrayInt2);
		
		displayArray(mergeArrayInt);
		
		double [] arrayDouble1 = {1.0, 2.0, 3.0};
		double [] arrayDouble2 = {4.0, 5.0, 6.0};
		
		double [] mergeArrayDouble = merge (arrayDouble1, arrayDouble2);
		
		displayArray(mergeArrayDouble);		
	}
	
	public static int[] merge (int [] a, int [] b) //
	{
		int [] c = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++)
		{
			c[a.length + i] = b[i]; //note the index in c
		}
		return c;
	}

	public static double[] merge (double [] a, double [] b) //note that we are overloading the method merge()
	{
		double [] c = new double[a.length + b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		return c;
	}
	
	public static void displayArray(int [] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void displayArray(double [] a)	//note that we are overloading the method displayArray()
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}	
}

 public static String myArraystoString(int[] a) {
        String output = "["; 
        for (int i = 0; i < a.length-1; i++){

            output += a [i] + ", "; 


        }
        output += a[a.length - 1] + "]";
        return output; 
    }




