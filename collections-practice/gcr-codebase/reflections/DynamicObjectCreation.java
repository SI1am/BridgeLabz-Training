//Dynamically Create Objects: Write a program to create an instance of a Student class dynamically using Reflection without using the new keyword.

package reflections;
import java.lang.reflect.*;

class Student {
	String name;
	int id;
	String course;
	
	Student (String name , int id, String course){
		this.course=course;
		this.name=name;
		this.id=id;
			
	}
	
	void details() {
		System.out.println("My name is "+name+" my student id is "+id+" my course is "+course);
	}

}
public class DynamicObjectCreation {

	public static void main(String[] ars) throws Exception {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("reflections.Student");
		
		Constructor<?> constructor =cls.getDeclaredConstructor(String.class, int.class, String.class);
		Object obj =constructor.newInstance("Shivam",13241,"CSE");
		
		Student student = (Student) obj;
		
		student.details();
		
		
		
	}
	

}
