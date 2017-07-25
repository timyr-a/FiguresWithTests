package com.company.model;

/**
 * Created by User on 20.07.2017.
 */
public class Circle extends Ellipse {
    public Circle(double diameter) {
        super(diameter, diameter);
        setName("Окружность");
    }

    public double getPerimeter(){
        return Math.PI * axisA;
    }

    public double getSquare(){
        return Math.PI * Math.pow(axisA, 2) / 4;
    }
}
