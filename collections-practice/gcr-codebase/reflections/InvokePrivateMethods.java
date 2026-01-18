//Invoke Private Method: Define a class Calculator with a private method multiply(int a, int b). Use Reflection to invoke this method and display the result.

package reflections;

import java.lang.reflect.*;

class Calculator {

	private int multiply(int a, int b) {
		return a * b;
	}
//    private int add(int a, int b) {
//        return a + b;
//    }
//
	
//    private int subtract(int a, int b) {
//        return a - b;
//    }


//    private int divide(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Division by zero");
//        }
//        return a / b;
//    }
}

public class InvokePrivateMethods {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
//		try {
//			System.out.println(c1.multiply(3,4));
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		
		Method method= Calculator.class.getDeclaredMethod("multiply", int.class ,int.class);
		method.setAccessible(true);
		
		System.out.println();
		int ans =(int)method.invoke(c1, 24,56);
		System.out.println("Ans is: " + ans );
	}

}
