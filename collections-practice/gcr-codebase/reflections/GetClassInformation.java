//Get Class Information: Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.


package reflections;
import java.lang.annotation.*;
import java.lang.reflect.*;
//import java.util.ArrayList;
//import annotations.Animal;

//import  java.lang.String;
public class GetClassInformation {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> cls1= Class.forName("java.util.ArrayList");
		Class<?> cls2= Class.forName("annotations.Animal");
		
		System.out.println("Class name : "+cls1.getName());
		System.out.println("Class name : "+cls2.getName());
		
		//Prints method in ArrayList Class
		System.out.println("Methods of : "+cls1.getName());
		for(Method method: cls1.getMethods()) {
			System.out.println(method.getName());
		}
		System.out.println();
		
		//Prints Methods in Animal Class that i have created in Annotations
		System.out.println("Methods of : "+cls2.getName());
		for(Method method: cls2.getMethods()) {
			System.out.println(method.getName());
		}
		System.out.println();
		
		//Prints Fields Names of ArrayList
		System.out.println("Field of : "+cls1.getName());
		for(Field f: cls1.getFields()) {
			System.out.println("Field: "+f.getName());
		}
		System.out.println();
		
		//Prints Fields Names of Animal Class
		System.out.println("Field of : "+cls2.getName());
		for(Field f: cls2.getFields()) {
			System.out.println("Field: "+f.getName());
		}
		System.out.println();
		
		//Prints Constructors of the ArrayList Class
		System.out.println("Consturctors of : "+cls1.getName());
		for(Constructor<?> c: cls1.getConstructors()) {
			System.out.println("Constuructor : "+ c.getName());
		}
		System.out.println();
		

	}

}
