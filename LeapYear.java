/*
 * Christina Fikru
 * Date: September 30, 2025
 *
 * computes an approximation of leap year with 10 years new line and a gap in each year
 */

import java.util.*;
    public class LeapYear 
    {
        //main method
        public static void main (String[] args)
        {
            // this counts how many leap years in total
            int count = 0;
            for (int year = 101; year <= 2100; year++){
                boolean isLeap = false;

                // check if year is divisible by 4 
                if (year % 4 == 0){
                    isLeap = true;
// check if year is divisible by 100 but not 400
                } else if (year % 100 == 0){
                    isLeap = false; 
                } else if (year % 400 == 0){
                    isLeap = true;
                }
                // if it is a leap year, print it out
                if (isLeap){
                    count++;
                    System.out.print(year + "");
                    
                    //if the count is divisible by 10 then it prints a new line
                    if (count % 10 == 0){ 
                        System.out.println();

                    } else{
                        System.out.print(" "); //it prints a space between each year
                    }
                
                }
                }
        
            }




        }
    