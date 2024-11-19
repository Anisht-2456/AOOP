package module3_10a;

public class MessagingAppSimulator {

    public static void main(String[] args) {
        // Create a shared message buffer with a capacity of 5
        MessageBuffer buffer = new MessageBuffer(5);

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

        // Start the producer and consumer threads
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
