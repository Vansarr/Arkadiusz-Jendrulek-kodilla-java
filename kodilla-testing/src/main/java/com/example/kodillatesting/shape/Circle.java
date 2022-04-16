package com.example.kodillatesting.shape;

public class Circle implements Shape{
private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return radius * 3.14;
    }
}
