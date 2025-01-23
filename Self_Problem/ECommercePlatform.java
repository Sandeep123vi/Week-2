package selfproblems;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
class Order {
    private int orderId;
    private List<Product> products;
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }
    public int getOrderId() {
        return orderId;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in the Order:");
        for (Product product : products) {
            System.out.println(product.getName() + " ($" + product.getPrice() + ")");
        }
    }
}
class Customer {
    private String name;
    private List<Order> orders;
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void placeOrder(Order order) {
        orders.add(order);
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Orders: ");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

public class ECommercePlatform{
    public static void main(String[] args) {
        //Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Mobile", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        //Create orders and add products to them
        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2);
        order2.addProduct(product3);

        //Create a customer and place orders
        Customer customer = new Customer("Rishi");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        //Display customer and order details
        customer.displayCustomerDetails();
    }
}

