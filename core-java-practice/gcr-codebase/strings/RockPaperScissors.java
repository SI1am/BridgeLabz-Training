//Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
//Hint => 
//The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
//Create a Method to find the Computer Choice using the Math.random
//Create a Method to find the winner between the user and the computer
//Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
//Create a Method to display the results of every game and also display the average and percentage wins 
//In the main take user input for the number of games and call methods to display results

package strings;

import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of games you want to play : ");
        int games = sc.nextInt();

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < games; i++) {
        	System.out.println("Enter Your Choice rock, paper or scissors ");
            String user = sc.next();
            String comp = computerChoice();
            
            String win = winner(user, comp);

            if (win.equals("User")) userWins++;
            if (win.equals("Computer")) compWins++;
            System.out.println("User points : "+userWins);
            System.out.println("Computer points : "+compWins);
            
        }

        
        System.out.println("User Win %: " + (userWins * 100.0/games));
        System.out.println("Computer Win %: " + (compWins * 100.0/games));
    }
    
    
   public static String computerChoice() {
	   
    	String[] choices = {"rock", "paper", "scissors"};
    	//Math.random() only give 0.0<=value<1.0 but never 1.0
    	//multiplying them with 3 will give values that can be converted to either 0,1 or 2
    	return choices[(int)(Math.random() * 3)];//
    }
    
   public static String winner(String user, String comp) {
	   
    	if (user.equals(comp)) return "Draw";
    	
    	if ((user.equals("rock") && comp.equals("scissors")) || (user.equals("paper") && comp.equals("rock")) ||(user.equals("scissors") && comp.equals("paper")))
    		
    		return "User";
    	
    	return "Computer";
    }
}

