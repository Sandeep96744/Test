package Playground;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) throws DuplicateProductIDException{
        for(Product p: this.items) {
            if(p.productId == product.productId) {
                throw new DuplicateProductIDException("Duplicate Product ID Found!");
            }
        }
        this.items.add(product);
    }

    public void deleteProduct(int id) throws ProductNotFoundException{
        for(Product p: this.items) {
            if(p.productId == id) {
                this.items.remove(p);
                return;
            }
        }
        throw new ProductNotFoundException("Product doesn't exist with ID: " + id);
    }

    public void displayCart() {
        System.out.println("------------------------------");
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

    public void addInFile() throws IOException {
        try(Writer write = new FileWriter("Bill.txt")) {
            write.write("Cart Info:\n-----------------------------------");
            double total = 0;
            for(Product p: this.items) {
                total += (p.price * p.quantityInStock);
                write.append("\nID:" + p.productId + " Name:" + p.productName + " Price:" + p.price + " Quantity:" + p.quantityInStock);
            }
            write.write("\n-----------------------------------\nTotal Amount:" + total);
        }
    }

    public void serialization() {
        for(Product p: this.items) {
            serializeObject(p);

            Product product = (Product)deSerializeObject("Bill.ser");
        }
    }


    public void serializeObject(Object object) {
        try(OutputStream outputStream = new FileOutputStream("Bill.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(object);
        }
        catch (IOException ex){
            System.err.println(ex);
        }

    }

    public Object deSerializeObject(String filename){
        try(InputStream inputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        }
        catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to the Shopping Cart *****");
        Product p1 = new Electronics(1, "Bulb", 100.0, 2, "Philips", 1);
        Product p2 = new Electronics(6, "Iron", 550.0, 1, "Bajaj", 1);
        Product p3 = new Clothing(101, "T-Shirt", 750.0, 1, "M", "Cotton");


        ShoppingCart s = new ShoppingCart();

        try {
            s.addProduct(p1);
            s.addProduct(p2);
            s.addProduct(p3);
            s.deleteProduct(1);
            s.displayCart();
            s.totalInfo();
            s.addInFile();

            s.serialization();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
