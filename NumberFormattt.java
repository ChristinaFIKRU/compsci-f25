//Christina Fikru
//12/2/25
// (NumberFormatException) Write and test a bin2Dec(String binaryString) 
//method to convert a binary string into a decimal number. Implement the bin2Dec method to 
//throw a NumberFormatException if the string is not a binary string.  

import java.util.*;

public class NumberFormattt{
    public static void main (String [] args){
        System.out.println ("Enter a binary string: ");
        try (Scanner input = new Scanner (System.in)){
        String binaryString = input.nextLine();
        
        try {
       int decimalValue = bin2Dec (binaryString);
        System.out.println("the decimal value is:" + decimalValue);
        } catch ( NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        }
        }
        //private static int decimalValue;

 public static int bin2Dec (String binaryString) throws NumberFormatException {
         int decimalValue = 0;
         for (int i = 0; i < binaryString.length(); i++){
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1'){
                throw new NumberFormatException("Invalid binary digit: '" + c + "'");

            }
            decimalValue = decimalValue * 2 + (c - '0');

         }
         return decimalValue;

      
        

    }
    }
