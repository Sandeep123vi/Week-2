public class ShoppingCart {
    public static void main(String[] args) {
        Product product = new Product("brush", 12, 2);
        if (product instanceof Product) {
            System.out.println("This is object of Product class");
        }
        product.displayDetails();
        Product.updateDiscount(20);
        product.displayDetails();
    }
}

class Product {
    final int productId = 1;
    static int discount = 30;
    String productName;
    int price;
    int quantity;

    public Product(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    public static void updateDiscount(int updateDiscount) {
        discount = updateDiscount;
    }

    public void displayDetails() {
        System.out.println("Product name is :" + productName);
        System.out.println("Price is :" + price);
        System.out.println("Quantity is :" + quantity);
        System.out.println("Product id is: " + productId);
        System.out.println("Discount is " + discount + "%");

    }

}