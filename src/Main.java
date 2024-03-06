import ex1.Rectangle;
import ex2.Call;
import ex2.SimCard;
import ex3.Cart;
import ex3.Customer;
import ex3.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===== EXERCISE 1 =====");
        Rectangle figure1 = new Rectangle(10, 5);
        Rectangle figure2 = new Rectangle(8, 6);
        System.out.println("E1a) figure1 " + Rectangle.printRectangle(figure1));
        System.out.println("E1b) figure1 & figure2 " + Rectangle.printTwoRectangles(figure1, figure2));


        System.out.println();
        System.out.println("===== EXERCISE 2 =====");
        SimCard mySim = new SimCard("345 1234567");
        Call[] lastCalls = new Call[5];
        lastCalls[0] = new Call("339 112233445", "3:38");
        lastCalls[1] = new Call("339 112233446", "0:26");
        lastCalls[2] = new Call("339 112233447", "1:13");
        lastCalls[3] = new Call("339 112233448", "0:35");
        lastCalls[4] = new Call("339 112233449", "2:47");
        mySim.setCallList(lastCalls);
        System.out.println("E2) mySim " + mySim.getSimData());


        System.out.println();
        System.out.println("===== EXERCISE 3 =====");
        Customer user = new Customer("Mario", "Rossi", "mario@rossi.it", 100);
        System.out.println("E3a) Customer added: " + user);
        Item bread = new Item(1.09, "1/2kg of bread.");
        Item eggs = new Item(2.49, "6 eggs pack.");
        Item water = new Item(1.98, "6 bottle pack of water.");
        Item petFood = new Item(2.39, "Pet food for cats.");
        Cart cart = new Cart(user);
        System.out.println("E3b) Empty cart: " + cart);
        System.out.println("Adding items to cart...");
        cart.addItem(bread, 2);
        cart.addItem(water, 1);
        cart.addItem(eggs, 2);
        cart.addItem(petFood, 3);
        System.out.println("E3c) Filled cart: " + cart);
        System.out.println("Removing an item...");
        cart.removeItem(bread);
        System.out.println("E3d) Cart without bread: " + cart);
        System.out.println("Adding more water...");
        cart.editItem(water, 3);
        System.out.println("E3e) Cart with one more water: " + cart);
        System.out.println("E3f) Total to pay: " + cart.getTotal());
        System.out.println("Paying...");
        cart.pay();
        System.out.println("E3g) Customer's updated wallet: " + user.getWallet() + "€");
        System.out.println("E3h) Cart is now empty again: " + cart);
    }
}