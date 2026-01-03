package generics;
import java.util.*;
abstract class WarehouseItem{
	private String name;
	
	public WarehouseItem(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getDescription();
	
}

class Electronics extends WarehouseItem {
	private String brand;
	
	public Electronics (String name, String brand) {
		super(name);
		this.brand=brand;
		
	}
	
	@Override
    public String getDescription() {
        return "Electronics: " + getName() + ", Brand: " + brand;
    }
	
}

class Groceries extends WarehouseItem {
	private int quantity;
	
	public Groceries (String name, int quantity) {
		super(name);
		this.quantity=quantity;
		
	}
	
	@Override
	public String getDescription() {
		return "Electronics: " + getName() + ", Quantity: " + quantity;
	}
	
}

class Furniture extends WarehouseItem {
	private String material;
	
	public Furniture (String name, String material) {
		super(name);
		this.material=material;
		
	}
	
	@Override
	public String getDescription() {
		return "Electronics: " + getName() + ", Brand: " + material;
	}
	
}


class Storage<T extends WarehouseItem>{
	private List<T> items;
	
	public Storage() {
		items = new ArrayList<>();
	}
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public T getItem(int index) {
		if(index>=0 && index<items.size()) {
			return items.get(index);
		}
		 return null;
	}
	
	public List<T> getItems(){
		return items;
	}
	
	public static void displayItems (List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDescription());
        }
    }
	
}


public class SmartWarehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method 

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Preload some data
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", "Samsung"));

        groceriesStorage.addItem(new Groceries("Milk", 7));
        groceriesStorage.addItem(new Groceries("Bread", 5));

        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSmart Warehouse Management System");
            System.out.println("1. Display Electronics");
            System.out.println("2. Display Groceries");
            System.out.println("3. Display Furniture");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Electronics in Storage:");
                    Storage.displayItems(electronicsStorage.getItems());
                    break;
                case 2:
                    System.out.println("Groceries in Storage:");
                    Storage.displayItems(groceriesStorage.getItems());
                    break;
                case 3:
                    System.out.println("Furniture in Storage:");
                    Storage.displayItems(furnitureStorage.getItems());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

	}

}
