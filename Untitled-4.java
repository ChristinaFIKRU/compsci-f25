//Christina Fikru
//12/2/25
// (NumberFormatException) Write and test a bin2Dec(String binaryString) 
//method to convert a binary string into a decimal number. Implement the bin2Dec method to 
//throw a NumberFormatException if the string is not a binary string.  

import java.util.*;

public class NumberFormatException{
    public static void main (String [] args){
        Scanner input = new Scanner (system.in);
        System.out.println ("Enter a binary string: ");
        String binaryString = input.nextLine();
        
        try {
            int decimalValue = bin2Dec (binaryString);
            System.out.println ("The decimal value is: " + decimalValue);
        }
        catch (NumberFormatException ex){
            System.out.println (ex.getMessage());
        }

    }

}