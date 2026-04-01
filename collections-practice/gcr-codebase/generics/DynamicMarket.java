package generics;
import java.util.*;

interface Category{}

 enum BookCategory implements Category {
    FICTION, NON_FICTION, EDUCATIONAL
}

enum ClothingCategory implements Category {
    MEN, WOMEN, KIDS
}

enum GadgetCategory implements Category {
    MOBILE, LAPTOP, ACCESSORY
}



class Product<T>{
	
	private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " | Category: " + category + " | Price: $" + price;
    }
	
}

class DiscountUtil {

    
    public static <P extends Product<?>> void applyDiscount(P product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}



class ProductCatalog {

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<? extends Category> product : products) {
            System.out.println(product);
        }
    }
}

public class DynamicMarket {
	 public static void main(String[] args) {

	        Product<BookCategory> book =
	                new Product<>("Java Programming", 500.0, BookCategory.EDUCATIONAL);

	        Product<ClothingCategory> shirt =
	                new Product<>("T-Shirt", 300.0, ClothingCategory.MEN);

	        Product<GadgetCategory> phone =
	                new Product<>("Smartphone", 20000.0, GadgetCategory.MOBILE);

	        ProductCatalog catalog = new ProductCatalog();
	        catalog.addProduct(book);
	        catalog.addProduct(shirt);
	        catalog.addProduct(phone);


	        DiscountUtil.applyDiscount(book, 10);
	        DiscountUtil.applyDiscount(phone, 5);

	        System.out.println("=== Product Catalog ===");
	        catalog.showCatalog();
	}
}
