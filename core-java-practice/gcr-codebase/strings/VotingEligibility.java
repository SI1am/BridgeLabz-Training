//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint => 
//Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
//Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
//Create a method to display the 2D array in a tabular format.
//Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
//

package strings;

public class VotingEligibility {

	public static void main(String[] args) {
		
		int[] ages = generateAges(10);
		String[][] table = canVote(ages);
		
		System.out.println("Age\tCan Vote");
		
		for(String[] row : table) {
			System.out.println(row[0] + "\t" + row[1]);
		}
	}
	
	//Generates Age of Students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for(int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 100);
        }
        return ages;
    }
    
    
    //Checks if students can vote or not
    public static String[][] canVote(int[] ages) {
    	
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False";
            
        }
        return result;
    }

}
