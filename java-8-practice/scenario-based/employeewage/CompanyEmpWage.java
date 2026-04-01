package employeewage;
import java.util.*;
public class CompanyEmpWage {

    String company;
    int ratePerHour;
    int maxDays;
    int maxHrs;
    int totalWage;
    ArrayList<Integer> dailyWage;

    public CompanyEmpWage(String company, int ratePerHour, int maxDays, int maxHrs) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxDays = maxDays;
        this.maxHrs = maxHrs;
        this.dailyWage = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + company +", Total Wage: " + totalWage +", Daily Wages: " + dailyWage;
    }
}