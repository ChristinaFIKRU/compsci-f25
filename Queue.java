// Christina F
// Queue class
// 11/11/25

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int v = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    // helper method
    public int getElementAt(int index) {
        return elements[index];
    }
}
