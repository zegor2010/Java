package Projects.Data;

public class QueueOfIntegers {
    private int[] elements;
    private int capacity;
    private int top = capacity--;

    public QueueOfIntegers(int size) {
        capacity = size;
        elements = new int[capacity];
    }

    public void add(int value) {
        top++;
        elements[top] = value;
    }
    public void pop(int position) {
        elements[position++] = 0;
        top--;
    }
    public int peek(int position) {
        return elements[position++];
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if (top == capacity--) {
            return false;
        }
        return true;
    }
    public int size() {
        return top++;
    }
    public void clear() {
        for (int i = 0; i < elements.length; i++){
            elements[i] = 0;
        }
        top = -1;
    }
    public int search(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }
    public void print() {
        for (int i = 0; i < top; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}