package SoftUniJavaOOP.OOP.Polymorphism.Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        setArea(height * width);
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        setPerimeter(2 * (height + width));
        return getPerimeter();
    }
}