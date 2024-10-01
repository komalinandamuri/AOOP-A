import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<String> sharedBuffer;

    public Consumer(BlockingQueue<String> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            String message;
            while (!(message = sharedBuffer.take()).equals("END")) {
                // Consume message from the shared buffer (blocking if the buffer is empty)
                System.out.println(Thread.currentThread().getName() + " consumed: " + message);
                Thread.sleep(1000);  // Simulate time taken to consume a message
            }
            System.out.println("No more messages to consume. Consumer exiting.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
