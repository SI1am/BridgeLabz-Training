//Access and Modify Static Fields: Create a Configuration class with a private static field API_KEY. Use Reflection to modify its value and print it.
package reflections;
import java.lang.reflect.*;
class Configurations{
	private static String API_KEY="This_is_old_key";
}


public class AccessModify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("reflections.Configurations");
		
		Field field = cls.getDeclaredField("API_KEY");
		field.setAccessible(true);
		
		System.out.println("Old Key is: "+ field.get(null));
		
		field.set(null,"NEW_API_KEY_I_AM_SHIVAM");
		
		System.out.println("New Key is: "+ field.get(null));
		

	}

}
