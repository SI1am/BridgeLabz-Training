package instancesAccessModifiers;

import java.util.*;
public class Person {
	
	String name;
	int age;


	public Person() {
		this.name = "Unknown";
		this.age = 0;
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
	}


	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name of Person \n");
		String name = sc.next();
		
		System.out.print("Enter Age of Person \n");
		int age= sc.nextInt();
		
		Person man = new Person(name , age);
		
		man.display ();
		Person man1 = new Person();
		
		System.out.println("\nDefault details \n");
		man1.display();
	}
}

