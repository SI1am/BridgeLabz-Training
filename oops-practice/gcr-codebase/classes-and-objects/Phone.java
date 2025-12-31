// package classesandobjects;
import java.util.Scanner;

public class Phone {

	String brand;
	String model;
	double price;
    
    public Phone( String brand, String model,double price){
    	this.brand = brand;
    	this.model = model;
    	this.price = price;
    }
    
    
    public void displayDetails() {
    	
    	System.out.println("Brand: " + brand);
    	System.out.println("Model: " + model);
    	System.out.println("Price: " + price);
    	
    	
    	
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter brand: ");
        String brand = sc. nextLine();
        
        System.out.print("Enter model: ");
        String model = sc. nextLine();


        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        
        Phone phone = new Phone(brand, model, price);
        phone.displayDetails();
    }
}