package ex1;

public class Rectangle {
    // ATTRIBUTES
    private final double width;
    private final double height;

    // CONSTRUCTORS
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // METHODS
    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return (this.width + this.height) * 2;
    }

    public String printRectangle() {
        return "{ Area: " + this.calculateArea() +
                ", Perimeter: " + this.calculatePerimeter() + "}";
    }

    public String printTwoRectangles(Rectangle figure) {
        double area1 = this.calculateArea();
        double area2 = figure.calculateArea();
        double perimeter1 = this.calculatePerimeter();
        double perimeter2 = figure.calculatePerimeter();
        double areaSum = area1 + area2;
        double perimeterSum = perimeter1 + perimeter2;

        return "{ 1st area: " + area1 + ", 2nd area: " + area2 +
                ", Area sum: " + areaSum + ", 1st perimeter: " + perimeter1 +
                ", 2nd perimeter: " + perimeter2 +
                ", Perimeter sum: " + perimeterSum + "}";
    }
}
