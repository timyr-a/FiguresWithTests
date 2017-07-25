package com.company.model;

/**
 * Created by User on 20.07.2017.
 */
public class Ellipse extends Figure {

    protected double axisA;
    protected double axisB;

    public Ellipse(double axisA, double axisB) {
        setName("Эллипс");
        this.axisA = axisA;
        this.axisB = axisB;
    }

    /**
     * Метод вычисления площади эллипса
     *
     * @return площадь эллипса
     */
    @Override
    public double getSquare() {
        return Math.PI * axisA * axisB / 4 ;
    }

    /**
     * Метод вычисления периметра эллипса
     *
     * @return периметр эллипса
     */
    @Override
    public double getPerimeter() {
        return 4 * (Math.PI * axisA * axisB + (axisA - axisB))/(axisA + axisB);
    }
}
