import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<String> sharedBuffer;

    public Producer(BlockingQueue<String> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String message = "Message-" + i;
                // Add message to the shared buffer (blocking if the buffer is full)
                sharedBuffer.put(message);
                System.out.println(Thread.currentThread().getName() + " produced: " + message);
                Thread.sleep(500);  // Simulate time taken to produce a message
            }
            // Indicate the end of message production
            sharedBuffer.put("END");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
