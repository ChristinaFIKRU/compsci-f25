/*
 * Christina Fikru
 * Date: September 30, 2025
 *
 * computes an approximation of pi 
 */

import java.util.*;
    public class ApproximationOfPi 
    {
        public static void main(String[] args)
        {
            // number of terms to use in the approximation
    
                //  specific term counts, list them here
                int[] nums = {10000, 20000, 100000};
                for (int i : nums) {
                    double sum = 0.0;

                    // using k from 1..i; compute alternating sign without Math.pow
                    // Math.pow is slow and can introduce small errors and also my program keep 
                    // breaking and found to be easier instead
                    // if i were to use Math.pow it would be 
                    // sum += Math.pow(-1, k+1) / (2.0* k -1);

                    for (int k = 1; k <= i; k++) {
                        double sign = (k % 2 == 1) ? 1.0 : -1.0; // + - + - ...
                        sum += sign / (2.0 * k - 1);
                    }

                    double piApprox = 4 * sum;
            // print a single formatted line per term to avoid console wrapping/interleaving
            System.out.printf("Numbers=%6d  pi=%.10f  diff=%.10e%n", i, piApprox,
                Math.abs(Math.PI - piApprox));
                }
            }




        }


    