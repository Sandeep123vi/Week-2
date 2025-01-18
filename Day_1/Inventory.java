class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable to keep track of total products
    private static int totalProducts = 0;

    // Constructor to initialize a product object
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class Inventory {
    public static void main(String[] args) {
        // Create instances of the Product class (Objects)
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 799.49);
        Product product3 = new Product("Headphones", 199.99);

        // Display details of each product
        System.out.println("--- Product Details ---");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();

        // Display total number of products created
        System.out.println("\n--- Total Products ---");
        Product.displayTotalProducts();
    }
}
