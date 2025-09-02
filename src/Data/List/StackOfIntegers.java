package Data.List;

public class StackOfIntegers {
    private int[] elements;
    private int top;
    private int capacity;

    public StackOfIntegers(int size) {
        capacity = size;
        elements = new int[capacity];
    }

    public void push(int value) {
        top++;
        elements[top] = value;
    }
    public int pop() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                i--;
                top = elements[i];
                elements[i] = 0;
            }
        }
        return top;
    }
    public int peek() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                i--;
                top = elements[i];
            }
        }
        return top;
    }
    public boolean isEmpty() {
        if (elements[0] == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                return false;
            }
        }
        return true;
    }
    public int size() {
        return top;
    }
    public void clear() {
        for (int i = 0; i < elements.length; i++){
            elements[i] = 0;
        }
    }
    public int search(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return elements[i];
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
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}