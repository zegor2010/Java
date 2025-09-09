package Test.Data;

import Projects.Data.QueueOfIntegers;


public class QueueOfIntegersTest {
    public static void main(String[] args) {
        QueueOfIntegers queueOfIntegers = new QueueOfIntegers(20);
        System.out.println(queueOfIntegers.isEmpty());
        queueOfIntegers.add(5);
        queueOfIntegers.add(6);
        queueOfIntegers.add(7);
        queueOfIntegers.add(8);
        queueOfIntegers.print();
        queueOfIntegers.pop(1);
        queueOfIntegers.peek(2);
        queueOfIntegers.print();

        System.out.println(queueOfIntegers.isEmpty());
        System.out.println(queueOfIntegers.isFull());

        System.out.println(queueOfIntegers.size());
        System.out.println(queueOfIntegers.contains(5));
        queueOfIntegers.clear();
        queueOfIntegers.search(5);
        System.out.println(queueOfIntegers.contains(5));
        queueOfIntegers.print();
    }
}
