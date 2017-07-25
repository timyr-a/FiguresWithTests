package com.company.model;

/**
 * Created by User on 20.07.2017.
 */
public class IsoTriangle extends Triangle {
    public IsoTriangle(double side, double base) {
        super(side, side, base);
        setName("Равнобедренный треугольник");
    }

    public double getPerimeter(){
        return getSideA() * 2 + getSideC();
    }

    public double getSquare(){
        double h = Math.sqrt(Math.pow(getSideA(), 2) - Math.pow(getSideC(), 2) / 4);
        return getSideC() * h / 2;
    }


}
