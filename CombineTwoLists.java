//Christina Fikru
//12/2/25
// (Combine two lists)  
//program that prompts the user to enter two lists, each with five integers, and displays their union. 
//The numbers are separated by exactly one space. 
        
import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter 5 integers for list 1:");
        for (int i = 0; i < 5  ; i++){
            list1.add(input.nextInt());

        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter 5 integers for list 2:");
        for (int i = 0; i <  5 ; i++) {
            list2.add(input.nextInt());
        }



    ArrayList<Integer> result = union(list1, list2);
    System.out.println("The union of the two lists is: " + result);

    }
    
public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
    ArrayList<Integer> unionList = new ArrayList<>(list1);
    for (Integer element : list2) {
        if (!unionList.contains(element)) {
            unionList.add(element);
        }
    }
    return unionList;
}


}

    