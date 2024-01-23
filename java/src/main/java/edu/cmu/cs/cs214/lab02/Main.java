package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        // You can still create a Rectangle, but reference it as a Shape.
        Shape shape = new Rectangle(5, 3);

        // The Renderer now takes a Shape, allowing it to be any shape.
        Renderer renderer = new Renderer(shape);
        renderer.draw();
    }
}
