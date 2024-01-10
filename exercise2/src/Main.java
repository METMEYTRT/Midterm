public class Main {

    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Test Square
        Square square = new Square(4.0);
        System.out.println("\nSquare Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
