import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerApp {
    public static void main(String[] args) {
        // Create a shared buffer with a capacity of 5 messages
        BlockingQueue<String> sharedBuffer = new ArrayBlockingQueue<>(5);

        // Create producer and consumer objects
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        // Create threads for producer and consumer
        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
