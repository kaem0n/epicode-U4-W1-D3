package ex3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Item {
    // ATTRIBUTES
    private final int id;
    private int quantity;
    private double price;
    private String description;

    // CONSTRUCTORS
    public Item(double price, String description) {
        Random idGen = new Random();
        this.id = idGen.nextInt(0, 1000);
        this.quantity = 0;
        this.price = price;
        this.description = description;
    }

    // GETTERS & SETTERS
    public void setQuantity(int qty) {
        this.quantity = qty;
        this.price *= qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // METHODS
    private static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return "Item {" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + round(price) +
                "€, description='" + description + '\'' +
                '}';
    }
}
