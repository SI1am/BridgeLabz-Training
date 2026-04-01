package generics;
import  java.util.*;
abstract class JobRole {

    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }


    
    public abstract int evaluateScore();
}

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public int evaluateScore() {
        return 85; 

    }
}


class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public int evaluateScore() {
        return 90; 

    }
}


class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public int evaluateScore() {
        return 80; 

    }
}


class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getScore() {
        return jobRole.evaluateScore();
    }

    @Override
    public String toString() {
        return candidateName + " applying for " + jobRole.getRoleName() + " | Score: " + getScore();
    }
}

class AIScreener {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
    	
        System.out.println("Screening Resume: " + resume);
    }
    


    public static void screeningPipeline(
            java.util.List<? extends JobRole> jobRoles) {

        System.out.println("\nAI Screening Pipeline:");
        
        for (JobRole role : jobRoles) {
            System.out.println("Evaluating role: " + role.getRoleName() + " | Base Score: " + role.evaluateScore());
        }
    }
    
}


public class AIResumeScreener {
	 public static void main(String[] args) {

	        Resume<SoftwareEngineer> r1 =new Resume<>("Amit", new SoftwareEngineer());

	        Resume<DataScientist> r2 = new Resume<>("Shivam", new DataScientist());

	        Resume<ProductManager> r3 =new Resume<>("Shardul", new ProductManager());


	        AIScreener.screenResume(r1);
	        AIScreener.screenResume(r2);
	        AIScreener.screenResume(r3);


	        List<JobRole> roles = new ArrayList<>();
	        roles.add(new SoftwareEngineer());
	        roles.add(new DataScientist());
	        roles.add(new ProductManager());

	        AIScreener.screeningPipeline(roles);

	 }
	 
}

