package module3_10a;

public class Consumer implements Runnable {
    private MessageBuffer buffer;

    // Constructor to define the shared buffer
    public Consumer(MessageBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1500); // Simulate message consumption delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
