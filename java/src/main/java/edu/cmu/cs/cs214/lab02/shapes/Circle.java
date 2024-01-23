package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        // Implementation for drawing the circle
        System.out.println("Drawing Circle with area: " + getArea());
    }
}
