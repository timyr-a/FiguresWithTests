package com.company.model;

import static com.company.Validator.*;
/**
 * Created by User on 18.07.2017.
 */
public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        if (isValidLength(sideA) && isValidLength(sideB) && isValidLength(sideC)
                && isValidTriangleSides(sideA, sideB, sideC)) {
            setName("Треугольник");
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    /**
     * Метод вычисления периметра треугольника
     *
     * @return периметр треугольника
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Метод вычисления площади треугольника
     *
     * @return площадь треугольника
     */
    @Override
    public double getSquare() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}
