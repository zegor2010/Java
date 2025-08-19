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
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = value;
            }
        }
    }

    public int pop() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                i--;
                top = elements[i];
                elements[i] = null;
            }
        }
        return top;
    }

    public int peek() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                i--;
                top = elements[i];
            }
        }
        return top;
    }

    public boolean isEmpty() {
        if (elements[0] == null) {
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return elements.length;
    }

    public void clear() {
        elements = null;
    }

    public int search(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return elements[i];
            }
        }
        return 0;
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
//test the class