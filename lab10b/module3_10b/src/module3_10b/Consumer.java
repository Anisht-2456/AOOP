package module3_10b;

public class Consumer implements Runnable {
    private BoundedBuffer buffer;

    // Constructor to define the shared buffer
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate time to consume an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
