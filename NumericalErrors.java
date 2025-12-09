/*
 * Numerical errors: floating point arithmetic is not exact
 */

public class NumericalErrors
{
	public static void main(String[] args) 
	{
		double total = 0;
	     	total += 5.6;
	     	total += 5.8;

		//System.out.println("total = " + total);
		
	     	System.out.println("5.6 + 5.8 = " + total);
	     
	     	total = 0.6;
	     	total += 0.3;
	     	total += 0.1;		//0.1 is not stored exactly
	     	total = 0.6 + 0.3 + 0.1;
	     	System.out.println("0.6 + 0.3 + 0.1 = " + total); 
	     
	     	if (total == 1)
	     	{
	    		System.out.println("total is = 1");
	     	}
	     	else
	     	{
	    		System.out.println("total is not = 1");
	     	}
	     
	     	if (Math.abs(total - 1.0) < 1e-15) //we use the class to invoke -thus its static
	     	{
	    		System.out.println("total is = 1");
	     	}
	    	else
	     	{
	    		System.out.println("total is not = 1");
	     	}
	}
}
