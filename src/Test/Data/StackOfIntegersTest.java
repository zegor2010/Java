package Test.Data;

import Projects.Data.StackOfIntegers;

public class StackOfIntegersTest {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers(20);
        stackOfIntegers.push(5);
        stackOfIntegers.push(6);
        stackOfIntegers.push(7);
        stackOfIntegers.push(8);

        stackOfIntegers.pop();
        stackOfIntegers.peek();
        stackOfIntegers.isEmpty();
        stackOfIntegers.isFull();
        stackOfIntegers.size();
        stackOfIntegers.clear();
        stackOfIntegers.search(5);
        stackOfIntegers.contains(5);
        stackOfIntegers.print();
    }
}
