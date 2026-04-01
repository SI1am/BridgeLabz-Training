package multithreading;


public class PrintShop {
    public static void main(String[] args) {
        System.out.println("Starting print jobs...");
        long start = System.currentTimeMillis();

        Thread[] jobs = {
            new Thread(new PrintJob("Job1", 10, 5)),
            new Thread(new PrintJob("Job2", 5, 8)),
            new Thread(new PrintJob("Job3", 15, 3)),
            new Thread(new PrintJob("Job4", 8, 6)),
            new Thread(new PrintJob("Job5", 12, 7))
        };

        int[] priorities = {5, 8, 3, 6, 7};

        for (int i = 0; i < jobs.length; i++) {
            jobs[i].setPriority(priorities[i]);
            jobs[i].start();
        }

        for (Thread t : jobs) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (end - start) + "ms");
    }
}
