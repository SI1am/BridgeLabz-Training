import java.util.*;

public class EmployeeWageComputation {

    // common final variables shared by both main method and getEmployeeHours method
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    // Method to check attendance
    public static int getEmployeeHours() {
        Random random = new Random();
        int attendance = random.nextInt(3); // only three numbers occur 0,1,2

        switch (attendance) {
            case 1:
                System.out.println("Employee is Present (Full Time)");
                return FULL_DAY_HOUR;
            case 2:
                System.out.println("Employee is Present (Part Time)");
                return PART_TIME_HOUR;
            default:
                System.out.println("Employee is Absent");
                return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        // to store daily wages
        ArrayList<Integer> dailyWages = new ArrayList<>();

        // calculate wage till conditions are met
        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            totalWorkingDays++;
            System.out.println("\nDay : " + totalWorkingDays);

            int hoursWorked = getEmployeeHours();
            totalWorkingHours += hoursWorked;

            int dailyWage = hoursWorked * WAGE_PER_HOUR;
            dailyWages.add(dailyWage);

            totalWage += dailyWage;

            System.out.println("Daily Wage: " + dailyWage);
        }

        System.out.println("\n----------------------------");//this will help show it in pretty way
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: " + totalWage);
        System.out.println("----------------------------");

        System.out.println("\nDaily Wages using Collection:");

        for (int wage : dailyWages) {

            System.out.println(wage);
        }


        System.out.println("\nThank You");
    }
}