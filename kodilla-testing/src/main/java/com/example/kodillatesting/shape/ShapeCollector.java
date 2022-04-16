package com.example.kodillatesting.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
}

public boolean removeFigure(Shape shape) {
        //
    boolean result = false;
    if (figures.contains(shape)) {
        figures.remove(shape);
        result = true;
    }
    return result;
}

public Shape getFigure (int n) {
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        return null;
}

public int getFiguresQuantity () {
        return figures.size();
}

public void showFigures() {
        figures.toArray();
        for (Shape figure : figures) {
            System.out.println(figure);
        }
}




}
