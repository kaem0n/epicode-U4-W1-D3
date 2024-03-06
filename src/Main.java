import ex1.Rectangle;
import ex2.Call;
import ex2.SimCard;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== EXERCISE 1 =====");
        Rectangle figure1 = new Rectangle(10, 5);
        Rectangle figure2 = new Rectangle(8, 6);
        System.out.println("E1a) figure1 " + figure1.printRectangle());
        System.out.println("E1b) figure1 & figure2 " + figure1.printTwoRectangles(figure2));

        System.out.println();
        System.out.println("===== EXERCISE 2 =====");
        Call call1 = new Call("339 112233445", "0:31");
        Call call2 = new Call("339 112233446", "1:24");
        Call call3 = new Call("339 112233447", "0:10");
        Call call4 = new Call("339 112233448", "0:46");
        Call call5 = new Call("339 112233449", "2:38");
        Call[] calls = {call1, call2, call3, call4, call5 };
        SimCard mySim = new SimCard("345 1234567", 0, calls);
        System.out.println(mySim.getSimData());
    }
}