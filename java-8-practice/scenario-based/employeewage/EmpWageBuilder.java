package employeewage;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class EmpWageBuilder implements IEmpWageBuilder {

    private ArrayList<CompanyEmpWage> companyList;
    private HashMap<String, CompanyEmpWage> companyMap;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
        companyMap = new HashMap<>();
    }

    @Override
    public void addCompany(String company, int ratePerHour, int maxDays, int maxHrs) {
        CompanyEmpWage companyEmpWage =new CompanyEmpWage(company,ratePerHour,maxDays,maxHrs);
        companyList.add(companyEmpWage);
        companyMap.put(company, companyEmpWage);
    }

    
    
    @Override
    public void computeEmpWage() {
        companyList.forEach(this::computeWageForCompany);
    }
    
    private void computeWageForCompany(CompanyEmpWage company) {

        int totalHrs = 0;
        int totalDays = 0;

        while (totalHrs<=company.maxHrs && totalDays<company.maxDays) {

            totalDays++;
            int empCheck =ThreadLocalRandom.current().nextInt(3);
            int empHrs = (empCheck == 1)?4:(empCheck == 2)?8:0;

            totalHrs += empHrs;
            company.dailyWage.add(empHrs*company.ratePerHour);
        }

        int totalWage = company.dailyWage.stream().mapToInt(Integer::intValue).sum();
        company.setTotalWage(totalWage);
        System.out.println(company);
    }
    

    @Override
    public int getTotalWage(String companyName) {
        return Optional.ofNullable(companyMap.get(companyName)).map(c->c.totalWage).orElse(0);
    }
}
