package module3_10b;

public class BoundedBufferSimulator {

    public static void main(String[] args) {
        // Create the shared bounded buffer
        BoundedBuffer buffer = new BoundedBuffer();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

        // Start the threads
        producerThread.start();
        consumerThread.start();

        // Join threads to ensure proper synchronization
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
