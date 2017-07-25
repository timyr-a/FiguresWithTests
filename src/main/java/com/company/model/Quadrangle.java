package com.company.model;

/**
 * Created by User on 25.07.2017.
 */
public class Quadrangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Quadrangle(double sideA, double sideB, double sideC, double sideD) {
        this.setName("Четырёхугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    /**
     * Метод вычисления площади фигуры
     *
     * @return площадь фигуры
     */
    @Override
    public double getSquare() {
        return Double.NaN;
    }

    /**
     * Метод вычисления периметра четырёхугольника
     *
     * @return периметр четырёхугольника
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}
