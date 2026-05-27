public class ShapeDrawing {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle("blue", 4.0, 6.0);

        circle.draw();
        circle.calculateArea();
        System.out.println();
        rectangle.draw();
        rectangle.calculateArea();
    }
}