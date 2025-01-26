package problems.e_commerce;


import java.util.ArrayList;

public class EcommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product charger = new Electronics("C233", "Boat super charger", 12.55, 22);
        charger.setPrice(455.34);
        products.add(charger);

        Product mobile = new Electronics("IP433", "IPhone", 13.32, 35);
        mobile.setPrice(75555.34);
        products.add(mobile);

        Product shop = new Electronics("S452", "Sandal soap", 15.75, 12);
        shop.setPrice(55.34);
        products.add(shop);

        Product underwear = new Electronics("U964", "Onn", 25.5, 10);
        underwear.setPrice(155.34);
        products.add(underwear);

        for(Product product : products) {
            product.displayProductDetails();
            double finalPrice = product.getPrice() - product.taxAmount - product.discountAmount;
            System.out.println("Final price of this product will be " + finalPrice);
            System.out.println("--------------------------------------------------------");
        }
    }
}
