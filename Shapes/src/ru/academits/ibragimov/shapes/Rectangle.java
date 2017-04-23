package ru.academits.ibragimov.shapes;

public class Rectangle implements Shape {
    private double lengthA;
    private double lengthB;

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

    public String toString() {
        return "Rectangle" + "(" + lengthA + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return lengthA == rectangle.lengthA && lengthB == rectangle.lengthB;
    }

    public int hashCode() {
        final int prime = 11;
        int hash = 1;
        hash = prime * hash + (int) lengthA;
        hash = prime * hash + (int) lengthB;
        return hash;
    }

    public void print() {
        System.out.println("Ширина прямоугольника = " + getWidth());
        System.out.println("Высота прямоугольника = " + getHeight());
        System.out.println("Площадь прямоугольника = " + getArea());
        System.out.println("Перимеир прямоугольника = " + getPerimeter());
    }
}
