package employeewage;
import java.util.*;
public class EmpWageBuilder implements IEmpWageBuilder {

    private ArrayList<CompanyEmpWage> companyList;
    private HashMap<String, CompanyEmpWage> companyMap;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
        companyMap = new HashMap<>();
    }

    @Override
    public void addCompany(String company, int ratePerHour, int maxDays, int maxHrs) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, ratePerHour, maxDays, maxHrs);
        companyList.add(companyEmpWage);
        companyMap.put(company, companyEmpWage);
    }

    
    
    @Override
    public void computeEmpWage() {
        for (CompanyEmpWage company : companyList) {
            int totalHrs = 0;
            int totalDays = 0;

            while (totalHrs <= company.maxHrs && totalDays < company.maxDays) {
                totalDays++;

                int empHrs = 0;
                int empCheck = new Random().nextInt(3);

                switch (empCheck) {
                    case 1:
                        empHrs =4;  
                        break;
                    case 2:
                        empHrs =8;  
                        break;
                    default:
                        empHrs=0;  
                }

                totalHrs += empHrs;
                int dailyWage = empHrs * company.ratePerHour;
                company.dailyWage.add(dailyWage);
            }

            company.setTotalWage(totalHrs * company.ratePerHour);
            System.out.println(company);
        }
    }
    
    

    @Override
    public int getTotalWage(String companyName) {
        return companyMap.get(companyName).totalWage;
    }
}
