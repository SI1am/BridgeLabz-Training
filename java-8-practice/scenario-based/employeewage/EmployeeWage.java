package employeewage;

public class EmployeeWage {
	static final int RATE_PER_HOUR = 20;
	static final int MAX_HRS = 100;
	static final int MAX_DAYS = 20;
	
	public static int computeEmpWage() {
		int totalHrs = 0, totalDays = 0;
		
		while (totalHrs <= MAX_HRS && totalDays < MAX_DAYS) {
			totalDays++;
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			int empHrs = (empCheck== 1)?4:(empCheck == 2)?8:0;
			totalHrs += empHrs;
		}
		return totalHrs*RATE_PER_HOUR;
	}
	
	public static int computeEmpWage(String company, int ratePerHour,int maxDays, int maxHrs) {
		
		int totalHrs = 0, totalDays = 0;
		
		while (totalHrs <= maxHrs && totalDays<maxDays) {
			totalDays++;
			int empCheck =(int)Math.floor(Math.random()*10)%3;
			int empHrs =(empCheck == 1)?4:(empCheck==2)?8:0;
			totalHrs+=empHrs;
		}
		
		int totalWage = totalHrs*ratePerHour;
		System.out.println("Total Wage for " + company + ": " + totalWage);
		return totalWage;
	}
	
}

