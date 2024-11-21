package com.ubik.formation.creational.factory.exemple;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
