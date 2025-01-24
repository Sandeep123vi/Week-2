package com.mycompany.inheritance;

class Order {

    //Attributes 
    public int orderId;
    public String orderDate;

    //Constructor of base class
    public Order(int orderId, String orderDate) {
        this.orderDate = orderDate;
        this.orderId = orderId;
    }
    //Method of base class

    void display() {
        System.out.println("The order id is :" + orderId);
        System.out.println("The order date is :" + orderDate);

    }
}

class ShippedOrder extends Order {

    public int trackingNumber;

    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void display() {
        super.display();
        System.out.println("The tracking number is : " + trackingNumber);
    }

}
// create delivered class extends with shippedOreder class

class DeliveredOrder extends ShippedOrder {

    //Attrinutes
    public String deliveryDate;

    //Constructor of derived class
    public DeliveredOrder(int orderId, String orderDate, String deliveryDate, int trackingNumber) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;

    }

    void display() {
        super.display();
        System.out.println("The delivery date is :" + deliveryDate);
    }
    //Method to display status of order

    void getOrderStatus() {
        System.out.println("The order id is :" + orderId);
        System.out.println("The order date is :" + orderDate);
        System.out.println("The tracking number is :" + trackingNumber);
        System.out.println("The Delivery date  is :" + deliveryDate);
    }

}

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(120, "12-01-2025", "13-01-2025", 12454);
        order.getOrderStatus();
    }

}
