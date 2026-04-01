
import java.util.*;
public class SpringSeasonOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the month (1-12): ");//taking month as input here
		int month=input.nextInt();
		System.out.println("Enter the day (1-30) : ");//taking day as input
		int day=input.nextInt();
		
		if((month==3 && day<=19)|| (month==6 && day>=19)) {// if its march and day is less than 20  or if its june and day is after 20  then its not a spring season
			
			System.out.println("Not a Spring Season");
		}
		else if((month==3 && day>=20)|| (month==6 && day<=20)) {
			
//			System.out.println("Not a Spring Season");
			System.out.println("Its a Spring Season");
		}
		else if((month>3 && month<6)) {
			System.out.println("Its a Spring Season");
		}
		else {
			System.out.println("Not a Spring Season");
			
		}

	}

}
