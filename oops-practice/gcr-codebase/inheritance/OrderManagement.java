package inheritance;

import java.util.*;

class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        orderId = id;
        orderDate = date;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String track) {
        super(id, date);
        trackingNumber = track;
    }
    
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String track, String delivery) {
        super(id, date, track);
        deliveryDate = delivery;
    }

    
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagement{
    public static void main(String[] args) {
    	
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter Order Details\n");
    	
    	System.out.print("Enter Order Id: \n");
    	int orderId=sc.nextInt();
    	
    	System.out.print("Enter Order Date: \n");
    	String date=sc.next();
    	
    	System.out.print("Enter Tracking Id: \n");
    	String trackId=sc.next();
    	
    	System.out.print("Enter Delivery Date: \n");
    	String deliveryDate=sc.next();
    	
    	
        ShippedOrder order = new ShippedOrder(orderId, date, trackId);
        DeliveredOrder order1 = new DeliveredOrder(orderId, date, trackId, deliveryDate);
        
        System.out.println(order.getOrderStatus());
        System.out.println(order1.getOrderStatus());
    }
}
