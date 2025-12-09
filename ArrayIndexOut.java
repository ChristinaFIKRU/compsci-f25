//Christina Fikru
//12/2/25
//Array IndexOut Of Bounds Exception  DONT FGT TEST PLS
// Creates an array with 100 randomly chosen integers. 
// Prompts the user to enter the index of the array, then displays the corresponding element 
// value. If the specified index is out of bounds, display the message “Out of Bounds.” 


import java.util.*;


public class ArrayIndexOut{
    public static void main (String [] args){
        int [] array = new int [100];
        for (int i = 0; i < array.length; i++){
            array [i] = (int) (Math.random () *100); 
        }
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println ("The corresponding element value is: " + array [index]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println ("Out of Bounds.");
        }
    




    }
}