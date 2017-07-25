package com.company.model;

/**
 * Created by User on 20.07.2017.
 */
public class EqualTriangle extends IsoTriangle {
    public EqualTriangle(double side) {
        super(side, side);
        setName("Равносторонний треугольник");
    }

    public double getPerimeter(){
        return getSideA() * 3;
    }

    public double getSquare(){
        return Math.sqrt(3) * Math.pow(getSideA(), 2) / 4;
    }

}
