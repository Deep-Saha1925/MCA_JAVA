class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
    
}
