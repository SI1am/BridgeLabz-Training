package encapsulation;
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }
}

class Clothing extends Product implements Taxable {
    Clothing(int productId, String name, double price) {
    	
        super(productId, name, price);
        
    }

    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Electronics extends Product implements Taxable {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Groceries extends Product {
    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}


public class EcommerceManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products to add: ");
        int n = Integer.parseInt(sc.nextLine());

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n------Product #" + (i + 1) + " -------");
            System.out.print("Enter Product Type \n1.Electronics:  \n2.Clothing:  \n3.Groceries: ");
            int type = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ₹");
            double price = Double.parseDouble(sc.nextLine());

            switch (type) {
                case 1:
                    products[i] = new Electronics(id, name, price);
                    break;
                case 2:
                    products[i] = new Clothing(id, name, price);
                    break;
                case 3:
                    products[i] = new Groceries(id, name, price);
                    break;
                default:
                    System.out.println("Invalid type. Try again.");
                    i--; // redo this iteration
            }
        }

        // Display summary
        System.out.println("\n========= Product Summary =========");
        for (Product p : products) {
            printFinalPrice(p);
        }

        sc.close();
    }

    public static void printFinalPrice(Product p) {
        double basePrice = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = 0;

        if (p instanceof Taxable) {
            Taxable t = (Taxable) p;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
            
        } else {
        	
            System.out.println("No tax applicable.");
        }

        double finalPrice = basePrice + tax - discount;

        System.out.println("Product: " + p.getName());
        System.out.println("Base Price: ₹" + basePrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("-----------------------------------");
    }

}
