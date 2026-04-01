//Access Private Field: Create a class Person with a private field age. Use Reflection to modify and retrieve its value.

package reflections;

import java.lang.reflect.*;
class Person{
	private String name;
	private int Age;
	
	Person(String name, int Age){
		this.Age=Age;
		this.name=name;
	}
	
	void sayHello () {
		System.out.println("My name is "+name+" and age is "+Age);
		System.out.println("Hello Everyone!!!!!!!!!!!");
	}
}

public class ModifyPrivateAge {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Amit",22);
		System.out.println("Before changing private age:");
		p1.sayHello();
		
		Field field = Person.class.getDeclaredField("Age");
		field.setAccessible(true);
		
		System.out.println();
		field.set(p1, 45);
		System.out.println("After changing private age to :45");
		p1.sayHello();
		
		
		
		

	}

}
