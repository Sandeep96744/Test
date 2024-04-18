package Playground;

public class Clothing extends Product {
    String size;
    String material;

    public Clothing(int productId, String productName, double price, int quantityInStock, String size, String material) {
        super(productId, productName, price, quantityInStock);
        this.size = size;
        this.material = material;
    }

    public void displayDetails() {
        System.out.println("Product Info: ");
        System.out.println("ID: " + this.productId);
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity in Stock: " + this.quantityInStock);
        System.out.println("Cloth Size: " + this.size);
        System.out.println("Cloth Material: " + this.material);
    }
}
