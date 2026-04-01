package lamda;
import java.util.*;
class Products {
	String name;
	double price;
	double rating;
	int discount;
	
	Products(String name, double price, double rating, int discount){
		this.name=name;
		this.price=price;
		this.rating=rating;
		this.discount =discount;
	}
	@Override
	public String toString() {
		return (name+"\nPrice: "+price+" \nRating: "+rating+" \nDiscount: "+discount);
	}
}


public class CustomSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> products = Arrays.asList(
				new Products("Laptop", 80000,4.5,10),
				new Products("Phone", 20000, 5,15),
				new Products("Headphones", 5000,3.4,10),
				new Products("Smart Watch", 10000,4,20)
				
				);
		products.sort((p1,p2)->Double.compare(p1.price, p2.price));
		System.out.println("Price wise sorted products\n"+ products);
		System.out.println();
		
		
		products.sort((p1,p2)->Double.compare(p1.rating, p2.rating));
		System.out.println("Rating wise sorted products\n"+ products);
		System.out.println();
		
		products.sort((p1,p2)->Integer.compare(p1.discount, p2.discount));
		System.out.println("Discount wise sorted products\n"+ products);
		System.out.println();
				

	}

}
