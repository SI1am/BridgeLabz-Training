// package spaceandtimecomplexity;
import java.util.Scanner;

class RobotHazard {
	public double CalculateHazardRisk(double armPrecision,int workerDensity,String machineryState) throws RobotSafetyException {


		if (armPrecision<0.0 || armPrecision>1.0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}


		if (workerDensity < 1 || workerDensity > 20) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}


		double machineRiskFactor;
		
		if (machineryState.equals("Worn")) {
			machineRiskFactor = 1.3;
		} else if (machineryState.equals("Faulty")) {
			machineRiskFactor = 2.0;
		} else if (machineryState.equals("Critical")) {
			machineRiskFactor = 3.0;
		} else {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}

		double ans =((1.0 - armPrecision)* 15.0)+(workerDensity * machineRiskFactor);
		return ans;
	}
}
class RobotSafetyException extends Exception {
	
	public RobotSafetyException(String message) {
		super(message);
	}
}


public class Robot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RobotHazard auditor = new RobotHazard();

        try {
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = sc.nextDouble();

            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Select Machinery State:");
            System.out.println("1. Worn");
            System.out.println("2. Faulty");
            System.out.println("3. Critical");

            int choice = sc.nextInt();
            String machineryState;

            switch (choice) {
                case 1: machineryState = "Worn"; break;
                case 2: machineryState = "Faulty"; break;
                case 3: machineryState = "Critical"; break;
                default:
                    throw new RobotSafetyException("Error: Unsupported machinery state");
            }

            double risk = auditor.CalculateHazardRisk(armPrecision, workerDensity, machineryState);

            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}