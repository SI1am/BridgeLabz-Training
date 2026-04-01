package implementingInterface;

import java.util.function.Function;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_LEN = 17;
		Function<String,Integer> func = str -> str.length();
		int len =func.apply("My name is shivam and i am working with this thing abrakadabra");
		System.out.println("Max length limit is: "+MAX_LEN);
		
		if (len > MAX_LEN){
            System.out.println("Message exceeds limit. Length: " + len);
        }else {
            System.out.println("Message is within limit. Length: " + len);
        }

	}

}
