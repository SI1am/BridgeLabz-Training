package Tasks;

public class ThreadStateDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new TaskRunner(), "Task-1");
        Thread t2 = new Thread(new TaskRunner(), "Task-2");

        Thread[] tasks = {t1, t2};

        StateMonitor monitor = new StateMonitor(tasks);


        monitor.start();

        t1.start();
        t2.start();
    }
}
