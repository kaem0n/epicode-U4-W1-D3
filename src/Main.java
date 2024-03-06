import ex1.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== EXERCISE 1 =====");

        Rectangle figure1 = new Rectangle(10, 5);
        Rectangle figure2 = new Rectangle(8, 6);
        System.out.println("E1a) figure1 " + figure1.printRectangle());
        System.out.println("E1b) figure1 & figure2 " + figure1.printTwoRectangles(figure2));

    }
}