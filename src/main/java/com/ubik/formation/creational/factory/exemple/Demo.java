package com.ubik.formation.creational.factory.exemple;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
