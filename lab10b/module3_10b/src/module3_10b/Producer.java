package module3_10b;

public class Producer implements Runnable {
    private BoundedBuffer buffer;

    // Constructor to define the shared buffer
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 1;
        try {
            while (true) {
                buffer.produce(item++);
                Thread.sleep(500); // Simulate time to produce an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
