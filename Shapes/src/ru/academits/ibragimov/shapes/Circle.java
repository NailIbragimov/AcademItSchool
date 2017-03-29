package ru.academits.ibragimov.shapes;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
        return radius * 2;
    }

    @Override
    public double getHeight() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("Ширина круга = " + getWidth());
        System.out.println("Высота круга = " + getHeight());
        System.out.println("Площадь круга = " + getArea());
        System.out.println("Перимеир круга = " + getPerimeter());
    }
}
