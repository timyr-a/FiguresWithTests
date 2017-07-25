package com.company;

/**
 * Created by User on 25.07.2017.
 * класс содержит методы проверки
 * допустимости вводимых значений
 */
public class Validator {

    public static boolean isValidLength(double length){
        return length > 0;
    }

    public static boolean isValidTriangleSides(double sideA, double sideB, double sideC){
        return (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA);
    }

}
