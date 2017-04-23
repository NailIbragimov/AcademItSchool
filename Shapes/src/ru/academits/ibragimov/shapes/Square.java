package ru.academits.ibragimov.shapes;

public class Square implements Shape {
    private double length;

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

    public String toString() {
        return "Square" + "(" + length + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Square square = (Square) o;
        return length == square.length;
    }

    public int hashCode() {
        final int prime = 99;
        int hash = 1;
        hash = prime * hash + (int) length;
        return hash;
    }

    public void print() {
        System.out.println("Ширина квадрата = " + getWidth());
        System.out.println("Высота квадрата = " + getHeight());
        System.out.println("Площадь квадрата = " + getArea());
        System.out.println("Перимеир квадрата = " + getPerimeter());
    }


}
