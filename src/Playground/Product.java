package Playground;

public class Product {
    int productId;
    String productName;
    double price;
    int quantityInStock;

    public Product(int productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayDetails() {
        System.out.println("Product Info: ");
        System.out.println("ID: " + this.productId);
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity in Stock: " + this.quantityInStock);
    }
}
