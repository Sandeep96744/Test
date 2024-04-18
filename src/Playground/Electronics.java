package Playground;

public class Electronics extends Product {
    String brand;
    int warrantyPeriod;

    public Electronics(int productId, String productName, double price, int quantityInStock, String brand, int warrantyPeriod) {
        super(productId, productName, price, quantityInStock);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    public void displayDetails() {
        System.out.println("Product Info: ");
        System.out.println("ID: " + this.productId);
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity in Stock: " + this.quantityInStock);
        System.out.println("Brand: " + this.brand);
        System.out.println("Warranty Period: " + this.warrantyPeriod);
    }
}