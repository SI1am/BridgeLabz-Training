//Assisted Problems
//Animal Hierarchy
//Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
//Tasks:
//Define a superclass Animal with attributes name and age, and a method makeSound().
//Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
//Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.


package inheritance;

import java.util.Scanner;

class Animal {
	String name;
	int age;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	 public void makeSound() {
		
		System.out.println("Animal makes a sound");
		
	}
	 public void  details(String name, int age) {
		 System.out.println("Display animal details");
	 }
	
}


class Dog extends Animal {
	
	Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		
		System.out.println("Dog barks");
		
	}
	
	@Override
	public void  details(String name, int age) {
		System.out.println(name+" is dog");
		System.out.println("Age is: "+age);
		System.out.println("");
	}
}

class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
	@Override
	public void  details(String name, int age) {
		System.out.println(name+" is cat");
		System.out.println("Age is: "+age);
		System.out.println("");
	}
}

class Bird extends Animal {
	Bird(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Bird chirps");
	}
	
	@Override
	public void  details(String name, int age) {
		System.out.println(name +" is a bird");
		System.out.println("Age is: "+age);
		
	}
}

class AnimalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Animal (1-Dog, 2-Cat, 3-Bird): ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		Animal animal;
		if (choice == 1) animal = new Dog(name, age);
		else if (choice == 2) animal = new Cat(name, age);
		else animal = new Bird(name, age);
		
		animal.details(name,age);
		animal.makeSound(); // Polymorphism
	}
}
