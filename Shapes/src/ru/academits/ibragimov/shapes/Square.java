package ru.academits.ibragimov.shapes;

public class Square implements Shape {
    public double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return length;
    }

    @Override
    public double getHeight() {
        return length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    public void print() {
        System.out.println("Ширина квадрата = " + getWidth());
        System.out.println("Высота квадрата = " + getHeight());
        System.out.println("Площадь квадрата = " + getArea());
        System.out.println("Перимеир квадрата = " + getPerimeter());
    }


}
