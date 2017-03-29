package ru.academits.ibragimov.shapes;

public class Triangle implements Shape {

    public double x1;
    public double x2;
    public double x3;
    public double y1;
    public double y2;
    public double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return (Math.max(Math.max(x1, x2), x3)) - (Math.min(Math.min(x2, x1), x3));
    }

    @Override
    public double getHeight() {
        return (Math.max(Math.max(y1, y2), y3)) - (Math.min(Math.min(y2, y1), y3));
    }

    @Override
    public double getArea() {
        return (getHeight() * getWidth()) / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.abs(x1 - x2) + Math.abs(x1 - x3) + Math.abs(x3 - x2);
    }

    public void print() {
        System.out.println("Ширина треугольника = " + getWidth());
        System.out.println("Высота треугольника = " + getHeight());
        System.out.println("Площадь треугольника = " + getArea());
        System.out.println("Перимеир треугольника = " + getPerimeter());
    }
}
