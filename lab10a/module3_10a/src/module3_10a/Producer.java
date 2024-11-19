package module3_10a;

public class Producer implements Runnable {
    private MessageBuffer buffer;

    // Constructor to define the shared buffer
    public Producer(MessageBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int messageNumber = 1;
        try {
            while (true) {
                String message = "Message " + messageNumber++;
                buffer.produce(message);
                Thread.sleep(1000); // Simulate message production delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
