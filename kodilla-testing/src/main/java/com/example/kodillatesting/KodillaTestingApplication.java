package com.example.kodillatesting;

import com.example.kodillatesting.calculator.Calculator;
import com.example.kodillatesting.shape.ShapeCollector;
import com.example.kodillatesting.shape.Square;
import com.example.kodillatesting.shape.Triangle;
import com.example.kodillatesting.user.SimpleUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaTestingApplication {

    public static void main(String[] args) {
        ShapeCollector coll = new ShapeCollector(){{
            addFigure(new Square(5));
            addFigure(new Square(6));
            addFigure(new Triangle(5, 5));
        }};

       coll.showFigures();

    }

}
