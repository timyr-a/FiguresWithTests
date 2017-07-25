package com.company;

import com.company.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стороны треугольника: ");
        Triangle triangle = new Triangle(
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(triangle);

        System.out.print("Введите катеты прямоугольного треугольника: ");
        RightTriangle rightTriangle = new RightTriangle(
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(rightTriangle);

        System.out.print("Введите боковую сторону и основание равнобедренного треугольника: ");
        IsoTriangle isoTriangle = new IsoTriangle(
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(isoTriangle);

        System.out.print("Введите сторону равностороннего треугольника: ");
        EqualTriangle equalTriangle = new EqualTriangle(
                scanner.nextDouble()
        );
        printFigureInfo(equalTriangle);

        System.out.print("Введите большую и малую оси эллипса: ");
        Ellipse ellipse = new Ellipse(
                scanner.nextDouble(),
                scanner.nextDouble()
        );
        printFigureInfo(ellipse);

        System.out.print("Введите диаметр окружности: ");
        Circle circle = new Circle(
                scanner.nextDouble()
        );
        printFigureInfo(circle);
    }

    private static void printFigureInfo(Figure figure){
        System.out.println(figure.getName());
        System.out.printf("Периметр: %.2f\n", figure.getPerimeter());
        System.out.printf("Площадь: %.2f\n", figure.getSquare());
    }

}