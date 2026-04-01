package reflections;
import java.lang.reflect.*;

interface Greetings{
	void hello() ;
	void goodMorning() ;
	void goodNight() ;
}

class Greeting implements Greetings{
	public void hello (){
		System.out.println("Hello");
	}
	public void goodMorning() {
		System.out.println("Good morning");
	}
	public void goodNight() {
		System.out.println("Good Night");
	}
}

public class LoggingReflection {
	public static void main(String[] args) {
		Greetings greet = new Greeting();
		
		Greetings prox = (Greetings) Proxy.newProxyInstance(
				Greetings.class.getClassLoader(),
				new Class[]{Greetings.class},
				(obj, method, params) -> {
					System.out.println("Calling method: " + method.getName());
					return method.invoke(greet, params);
				});
		
		prox.hello();
		prox.goodMorning();
		prox.goodNight();
		
	}

}
