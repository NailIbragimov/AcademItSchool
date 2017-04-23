package ru.academits.ibragimov.shapes;

class Triangle implements Shape {

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
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

    private double getLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter() / 2 * (getPerimeter() / 2 - getLength(x1, x2, y1, y2)) + (getPerimeter() / 2 - getLength(x1, x3, y1, y3)) + (getPerimeter() / 2 - getLength(x3, x2, y3, y2))));
    }

    @Override
    public double getPerimeter() {
        return getLength(x1, x2, y1, y2) + getLength(x1, x3, y1, y3) + getLength(x3, x2, y3, y2);
    }

    public String toString() {
        return "Triangle" + "(" + x1 + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return x1 == triangle.x1 && y1 == triangle.y1 && x2 == triangle.x2
                && y2 == triangle.y2 && x3 == triangle.x3 && y3 == triangle.y3;
    }

    public int hashCode() {
        final int prime =121;
        int hash = 1;
        hash = prime * hash + (int) x1;
        hash = prime * hash + (int) x2;
        hash = prime * hash + (int) x3;
        hash = prime * hash + (int) y1;
        hash = prime * hash + (int) y2;
        hash = prime * hash + (int) y3;
        return hash;
    }

    void print() {
        System.out.println("Ширина треугольника = " + getWidth());
        System.out.println("Высота треугольника = " + getHeight());
        System.out.println("Площадь треугольника = " + getArea());
        System.out.println("Перимеир треугольника = " + getPerimeter());
    }
}
