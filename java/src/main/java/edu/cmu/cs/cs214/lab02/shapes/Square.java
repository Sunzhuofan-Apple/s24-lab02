package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSideLen() {
        return sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }

    @Override
    public void draw() {
        // Implementation for drawing the square
        System.out.println("Drawing Square with area: " + getArea());
    }
}


