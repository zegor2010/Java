package Test.Data;

import Projects.Data.QueueOfIntegers;
import Projects.Data.StackOfIntegers;

public class QueueOfIntegersTest {
    public static void main(String[] args) {
        QueueOfIntegers queueOfIntegers = new QueueOfIntegers(20);
        queueOfIntegers.add(5);
        queueOfIntegers.add(6);
        queueOfIntegers.add(7);
        queueOfIntegers.add(8);
        queueOfIntegers.pop(1);
        queueOfIntegers.peek(2);
        queueOfIntegers.isEmpty();
        queueOfIntegers.isFull();
        queueOfIntegers.size();
        queueOfIntegers.clear();
        queueOfIntegers.search(5);
        queueOfIntegers.contains(5);
        queueOfIntegers.print();
    }
}
