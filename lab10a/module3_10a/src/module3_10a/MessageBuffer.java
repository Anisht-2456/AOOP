package module3_10a;

import java.util.LinkedList;
import java.util.Queue;

public class MessageBuffer {
    private Queue<String> buffer = new LinkedList<>();
    private final int capacity;

    // Constructor to define buffer capacity
    public MessageBuffer(int capacity) {
        this.capacity = capacity;
    }

    // Synchronized method to produce messages (used by the Producer)
    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait if buffer is full
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notify(); // Notify waiting consumers
    }

    // Synchronized method to consume messages (used by the Consumer)
    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if buffer is empty
        }
        String message = buffer.remove();
        System.out.println("Consumed: " + message);
        notify(); // Notify waiting producers
        return message;
    }
}
