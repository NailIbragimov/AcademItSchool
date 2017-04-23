package ru.academits.ibragimov.shapes;

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
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

    public String toString() {
        return "Circle" + "(" + radius + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    public int hashCode() {
        final int prime = 3;
        int hash = 1;
        hash = prime * hash + (int) radius;
        return hash;
    }

    void print() {
        System.out.println("Ширина круга = " + getWidth());
        System.out.println("Высота круга = " + getHeight());
        System.out.println("Площадь круга = " + getArea());
        System.out.println("Перимеир круга = " + getPerimeter());
    }
}
