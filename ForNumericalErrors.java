/*
 * problem: calculate .01+.02+.03+....+1.0
 */

 public class ForNumericalErrors
{
	public static void main(String[] args) 
	{
        double sum1 = 0;
        for (double i = 0.01; i <= 1.0; i += 0.01)
        {
        	sum1 = sum1 + i;
        }
        System.out.println("sum1 = " + sum1);
        double sum2 = 0;
        for (double i = 1.0; i >= 0.01; i -= 0.01) // if there's a space b/n  >=  program wont run so be mindful
        {
            sum2 = sum2 + i;
        }
        System.out.println("sum2 = " + sum2); // could sub it with decimal but the rule of math2.

        double sum3 = 0; 
        for (int i = 1; i <= 100; i++)
        //The problem is that the for-loop increment expression should increment the loop variable 'i', but currently it is just '1++', which is invalid; it should be 'i++'.

    {
            sum3 = sum3 + 1; 

    }
    double exact = sum3 / 100;
    System.out.println("exact = " + exact);

    }
}
//arismatic with floating point with double might not be the best choice to go about it 