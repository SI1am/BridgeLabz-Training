package implementingInterface;

class Product implements Cloneable {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Cloned {

	public static void main(String[] args) throws Exception {
		
		Product p1 = new Product("Laptop", 753252);
		Product p2 = (Product) p1.clone();
		Product p3 = (Product) p2.clone();
		
		
		System.out.println(p1.name + " - " + p1.price);
		System.out.println(p2.name + " - " + p2.price);
		System.out.println(p3.name + " - " + p3.price);
	}
}
