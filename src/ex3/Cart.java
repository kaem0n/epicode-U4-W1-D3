package ex3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Cart {
    // ATTRIBUTES
    private final Customer customer;
    private final ArrayList<Item> items;
    private double totalToPay;

    // CONSTRUCTORS
    public Cart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalToPay = 0;
    }

    // GETTERS & SETTERS
    public String getTotal() {
        return round(this.totalToPay) + "€";
    }

    // METHODS
    public void addItem(Item item, int qty) {
        item.setQuantity(qty);
        items.add(item);
        this.totalToPay += item.getPrice();
    }

    public void removeItem(Item item) {
        items.remove(item);
        this.totalToPay -= item.getPrice();
    }

    public void editItem(Item item, int qty) {
        this.totalToPay -= item.getPrice();
        item.setQuantity(qty);
        items.set(items.indexOf(item), item);
        this.totalToPay += item.getPrice();
    }

    public void pay(){
        this.customer.setWallet(this.customer.getWallet() - totalToPay);
        this.totalToPay = 0;
        items.clear();
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return "Cart {" +
                "customer=" + customer.getName() +
                " " + customer.getSurname() +
                ", items=" + items +
                ", total to pay=" + round(totalToPay) +
                "€}";
    }
}
