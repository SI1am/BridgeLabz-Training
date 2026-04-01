package Tasks;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class StateMonitor extends Thread {

    private Thread[] threads;

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {

        @SuppressWarnings("unchecked")
        Set<Thread.State>[] stateHistory = new Set[threads.length];
        for (int i = 0; i < threads.length; i++) {
            stateHistory[i] = new HashSet<>();
        }

        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (int i = 0; i < threads.length; i++) {
                Thread t = threads[i];
                Thread.State state = t.getState();
                stateHistory[i].add(state);

                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


        System.out.println("\nSummary:");
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() +
                    " went through " + stateHistory[i].size() + " states");
        }
    }
}
