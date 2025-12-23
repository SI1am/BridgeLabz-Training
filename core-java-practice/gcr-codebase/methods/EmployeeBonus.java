//Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
//Hint => 
//Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
//Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
//Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
//Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format


package methods;

class EmployeeBonus {
	
	 public static void main(String[] args) {
		 
	        double[][] emp = generateEmployees(10);
	        
	        double[][] res = calculateBonus(emp);

	        double oldSum = 0, newSum = 0, bonusSum = 0;

	        System.out.println("OldSalary	Bonus	NewSalary");
	        for (double[] r : res) {
	        	
	            System.out.printf("%.2f\t%.2f\t%.2f\n", r[0], r[1], r[2]);
	            oldSum += r[0];
	            bonusSum += r[1];
	            newSum += r[2];
	            
	        }

	        System.out.println("\nTotal Old Salary: " + oldSum);
	        
	        System.out.println("Total Bonus: " + bonusSum);
	        
	        System.out.println("Total New Salary: " + newSum);
	    }

    public static double[][] generateEmployees(int n) {
    	
        double[][] data = new double[n][2];
        
        for (int i = 0; i < n; i++) {
        	
            data[i][0] = 10000 + Math.random() * 90000; 
            
            data[i][1] = Math.random() * 10;         
            
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] emp) {
    	
        double[][] result = new double[emp.length][3];

        for (int i = 0; i < emp.length; i++) {
        	
            double salary = emp[i][0];
            
            double years = emp[i][1];
            
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            
            double bonus = salary * bonusRate;
            
            result[i][0] = salary;
            
            result[i][1] = bonus;
            
            result[i][2] = salary + bonus;
        }
        return result;
    }

   
}
