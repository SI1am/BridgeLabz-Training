package collections;

import java.util.*;

public class ShoppingCart {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Double> prices = new HashMap<>();
    static LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    public static void main(String[] args) {


        while (true) {
            System.out.println("\n--- Shopping Cart ---");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. View Items Sorted by Price");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addItem();
                case 2 -> viewCart();
                case 3 -> sortedByPrice();
                case 0 -> System.exit(0);
            }
        }
    }

    public static void addItem() {
    System.out.print("Item Name: ");
    String item = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    sc.nextLine(); 

    prices.put(item, price);
    cart.put(item, price);
}

public static void viewCart() {
    
    System.out.println("\nItems in Cart:");
    for (Map.Entry<String, Double> entry : cart.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}

public static void sortedByPrice() {
    TreeMap<Double, String> sorted = new TreeMap<>();

    for (Map.Entry<String, Double> entry : cart.entrySet()) {
        sorted.put(entry.getValue(), entry.getKey());
    }

    System.out.println("\nItems Sorted by Price:");
    for (Map.Entry<Double, String> entry : sorted.entrySet()) {
        System.out.println(entry.getValue() + " : " + entry.getKey());
    }
}
}