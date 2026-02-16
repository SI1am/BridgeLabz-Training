package employeewage;
public interface IEmpWageBuilder {
    void addCompany(String company, int ratePerHour, int maxDays, int maxHrs);
    void computeEmpWage();
    int getTotalWage(String company);
}