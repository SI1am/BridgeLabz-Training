package Restraunt;

public class Chef extends Thread {

    private String dish;
    private int cookingTime; 

    public Chef(String name, String dish, int cookingTime) {
        super(name);
        this.dish = dish;
        this.cookingTime = cookingTime;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);

        int[] progress = {25, 50, 75, 100};
        int stepTime = cookingTime / progress.length;

        for (int p : progress) {
            try {
                Thread.sleep(stepTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
        }

        System.out.println(getName() + " completed " + dish);
    }
}
