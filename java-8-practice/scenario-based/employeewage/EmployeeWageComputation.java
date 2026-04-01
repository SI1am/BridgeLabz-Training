package employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder empWageBuilder = new EmpWageBuilder();


        empWageBuilder.addCompany("TCS", 20, 20, 100);
        empWageBuilder.addCompany("Infosys", 25, 22, 120);
        empWageBuilder.addCompany("Wipro", 18, 20, 90);


        empWageBuilder.computeEmpWage();


        System.out.println("\nQueried Total Wage for TCS: "+empWageBuilder.getTotalWage("TCS"));
        System.out.println("\nQueried Total Wage for Infosys: "+empWageBuilder.getTotalWage("Infosys"));
        System.out.println("\nQueried Total Wage for Wipro: "+empWageBuilder.getTotalWage("Wipro"));
    }
}