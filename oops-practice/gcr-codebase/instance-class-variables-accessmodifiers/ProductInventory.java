//Problem 1: Product Inventory
//Create a Product class with:
//Instance Variables: productName, price.
//Class Variable: totalProducts (shared among all products).
//Methods:
//An instance method displayProductDetails() to display the details of a product.
//A class method displayTotalProducts() to show the total number of products created.

package instancesAccessModifiers;

import java.util.Scanner;

class ProductInventory {
    String productName;
    double price;
    static int totalProducts = 0;

    ProductInventory(String productName, double price) {
    	
        this.productName = productName;
        this.price = price;
        totalProducts++;
        
    }

    public void displayProductDetails() {
    	
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        
    }

    public static void displayTotalProducts() {
    	
        System.out.println("Total Products Created: " + totalProducts);
        
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        ProductInventory item = new ProductInventory(name, price);
        item.displayProductDetails();
        ProductInventory.displayTotalProducts();
        
    }
}
