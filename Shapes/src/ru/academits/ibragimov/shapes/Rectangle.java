package ru.academits.ibragimov.shapes;

public class Rectangle implements Shape {
    public double lengthA;
    public double lengthB;

    public Rectangle(double lengthA, double lengthB) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    @Override
    public double getWidth() {
        return lengthA;
    }

    @Override
    public double getHeight() {
        return lengthB;
    }

    @Override
    public double getArea() {
        return lengthA * lengthB;
    }

    @Override
    public double getPerimeter() {
        return (lengthA + lengthB) * 2;
    }

    public void print() {
        System.out.println("Ширина прямоугольника = " + getWidth());
        System.out.println("Высота прямоугольника = " + getHeight());
        System.out.println("Площадь прямоугольника = " + getArea());
        System.out.println("Перимеир прямоугольника = " + getPerimeter());
    }
}
