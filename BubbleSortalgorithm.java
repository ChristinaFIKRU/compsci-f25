/*
 * Christina Fikru
 * 10/09/2025
 *  bubble-sort algorithm 
 */

import java.util.*;

public class BubbleSortAlgorithm {

public static void main (String [] args){

    try (Scanner input = new Scanner (System.in)){
      int[] numbers = new int [10];
        System.out.print("Enter Number:");
       
         for (int i = 0; i < numbers.length; i++){
            numbers [i] = input.nextInt();

         }
         // Sort the array using bubble sort (ascending)
         bubbleSort(numbers);
            System.out.println("Numbers are sorted in asceding order:");
             for (int num: numbers){
                System.out.print(num +  " ");
             }
    }

}

    // Bubble-sort method: sorts the array in-place in ascending order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Make n-1 passes
        for (int pass = 0; pass < n - 1; pass++) {
            // On each pass, the last pass elements are already in place
            for (int j = 0; j < n - pass - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }





}