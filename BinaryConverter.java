//Christina Fikru
//12/4/25
// Binary converter - when given a decimal number, converts it to binary string num

import java.util.*;

public class BinaryConverter{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a decimal num:");

        String binaryString = input.nextLine();
        try {
            int decimalValue = bin2Dec(binaryString);
            
    System.out.println("value in binary is:" + decimalValue);
    } 
    catch (BinaryFormatException e){
        System.out.println("Indvalid binary string num:" + e.getMessage());
    }
    
}
public static int bin2Dec (String binaryString) throws BinaryFormatException{
    int decimalValue = 0;
    for (int i = 0; i < 10; i++) {
        char c = binaryString.charAt(i);
        if (c != '0' && c !='1'){
            throw new BinaryFormatException("Invalid binary num:'"+c+"'");

        } 
        decimalValue = decimalValue * 2 + (c - '0');
    }
    return decimalValue;
}


}





















































































































































































































































