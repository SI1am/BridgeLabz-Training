package multithreading;

public class PrintJob implements Runnable {
    private String jobName;
    private int pages;
    private int priority;

    private static final Object PRINTER = new Object();

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    private String getPriorityLabel() {
        if (priority >= 7) return "High Priority";
        else if (priority >= 5) return "Medium Priority";
        else return "Low Priority";
    }

    @Override
    public void run() {
        synchronized (PRINTER) {
            for (int i = 1; i <= pages; i++) {
                System.out.println("[" + getPriorityLabel() + "] Printing "+ jobName + " - Page " + i + " of " + pages);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
