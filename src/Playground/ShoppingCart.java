package Playground;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product p) {
        this.items.add(p);
    }

    public void displayCart() {
        System.out.println("Cart Info:");
        System.out.println("------------------------------");
        for(Product p: this.items) {
            p.displayDetails();
        }
    }

    public void totalInfo() {
        double total = 0;
        for(Product p: this.items) {
            total += (p.price * p.quantityInStock);
        }
        System.out.println("------------------------------");
        System.out.println("Total Bill Info: " + total);
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to the Shopping Cart *****");
        Product p1 = new Electronics(1, "Bulb", 100.0, 2, "Philips", 1);
        Product p2 = new Electronics(6, "Iron", 550.0, 1, "Bajaj", 1);
        Product p3 = new Clothing(101, "T-Shirt", 750.0, 1, "M", "Cotton");


        ShoppingCart s = new ShoppingCart();

        s.addProduct(p1);
        s.addProduct(p2);
        s.addProduct(p3);

        s.displayCart();
        s.totalInfo();
    }
}
