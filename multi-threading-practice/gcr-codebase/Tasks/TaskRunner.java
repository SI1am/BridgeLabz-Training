package Tasks;

public class TaskRunner implements Runnable {

    @Override
    public void run() {
        try {
            // Simulate computation
            for (int i = 0; i < 1000000; i++) {
                Math.sqrt(i);
            }

            // TIMED_WAITING
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
