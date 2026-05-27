class Rectangle extends Shape {
    private String color;
    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + color + " rectangle.");
    }

    @Override
    void calculateArea() {
        System.out.println("Area of the rectangle: " + (length * width));
    }
}