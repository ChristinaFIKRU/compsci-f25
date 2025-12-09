// Christina F
// Test Queue class
// 11/11/25

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("=Enqueuing numbers 1–20=");
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
            System.out.println("Enqueued: " + i + " | Current size: " + queue.getSize());
        }

        System.out.println("\n= Dequeuing numbers =");
        int step = 1;
        while (!queue.empty()) {
            int removed = queue.dequeue(); // remove and return first element
            System.out.println("Step " + step + ": Removed " + removed);
            displayQueue(queue);
            step++;
        }

        System.out.println("\nQueue is now emptyyyyy!");
    }

    // this show queue's content
    public static void displayQueue(Queue queue) {
        System.out.print("Current queue: [");
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(queue.getElementAt(i));
            if (i < queue.getSize() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}











/*
PLEASE IGNORE THIS I DIDN"T LIKE THE INTIAL CODE AKA THISONE :)
public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue numbers 1 to 20
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        System.out.println("Dequeuing nums from the queue:");

        // Dequeue and print all elements
        while (!queue.empty()) {   //this removes the first elemnt for que and method returns the removed value
            System.out.print(queue.dequeue() + " "); 
        }
        System.out.println(); // prints new line at the end 
    }
}
*/