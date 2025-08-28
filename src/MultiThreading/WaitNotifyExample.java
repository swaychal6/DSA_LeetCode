package MultiThreading;

class SharedData {
    private int data;
    private boolean hasData = false; // Flag to check if data is ready

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) { // Wait until data is consumed
            wait();
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify(); // Notify consumer
    }

    // Consumer method
    public synchronized void consume() throws InterruptedException {
        while (!hasData) { // Wait until data is produced
            wait();
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // Notify producer
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedData.produce(i);
                    Thread.sleep(500); // Simulate time to produce
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedData.consume();
                    Thread.sleep(500); // Simulate time to consume
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
