package com.company.model;

/**
 * Created by User on 20.07.2017.
 */
public class RightTriangle extends Triangle {

    public RightTriangle(double sideA, double sideB) {
        super(sideA, sideB, Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        setName("Прямоугольный треугольник");
    }

    public double getSquare(){
        return getSideA() * getSideB() / 2;
    }

}
