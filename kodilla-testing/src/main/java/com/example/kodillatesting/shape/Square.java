package com.example.kodillatesting.shape;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                ", field= " + getField() +
                '}';
    }
}
