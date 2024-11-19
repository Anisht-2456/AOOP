package module3_10b;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 10; // Maximum buffer capacity

    // Synchronized method to produce items
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait if the buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify all waiting consumers
    }

    // Synchronized method to consume items
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if the buffer is empty
        }
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify all waiting producers
        return item;
    }
}
