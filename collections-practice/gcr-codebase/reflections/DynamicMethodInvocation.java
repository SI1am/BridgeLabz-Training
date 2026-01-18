//Dynamic Method Invocation: Define a class MathOperations with multiple public methods (add, subtract, multiply). Use Reflection to dynamically call any method based on user input
package reflections;

import java.util.Scanner;
import java.lang.reflect.*;
class MathOperations{
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
    public int add(int a, int b) {
        return a + b;
    }

	
    public int subtract(int a, int b) {
        return a - b;
    }


    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
	
}

public class DynamicMethodInvocation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Class<?> cls = Class.forName("reflections.MathOperations");
		MathOperations mo=new  MathOperations();
		
		System.out.println("Enter method name : \n1.Add: \n2.Subtract \n3.Multiply \n4.Divide ");
		String choice = sc.next().toLowerCase();
		
		System.out.println("Enter first value ");
		int a=sc.nextInt();
		System.out.println("Enter second value ");
		int b=sc.nextInt();
		
		Method method =cls.getDeclaredMethod(choice, int.class,int.class);
		int ans =(int)method.invoke(mo, a,b);
	
		System.out.println(ans);

	}

}
