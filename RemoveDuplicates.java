//Christina Fikru
//12/2/25
//Remove Duplicates from an Array List

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicates(list);  // required: void method modifies list

        System.out.print("The distinct integers are: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    // Req hearderr
    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        list.clear();       // modify original list
        list.addAll(unique);
    }
}
