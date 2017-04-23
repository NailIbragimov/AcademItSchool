package ru.academits.ibragimov.shapes;

import java.util.Arrays;

public class Main {
    private static Shape maxArea(Shape[] a) {
        Shape area = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].getArea() > area.getArea()) {
                area = a[i];
            }

        }
        return area;
    }

    private static Shape getSecondPerimeter(Shape[] a) {
        Shape tmp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].getPerimeter() < a[minIndex].getPerimeter()) {
                    minIndex = j;
                }
            }
            tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
        return a[1];
    }


    public static void main(String[] args) {


        /*Square s1 = new Square(8);
        Square s2 = new Square(9);
        s1.print();
        s2.print();
        Triangle t1 = new Triangle(17, 32, 57, 71, 97, 11);
        Triangle t2 = new Triangle(24, 41, 63, 87, 109, 121);
        t1.print();
        t2.print();
        Rectangle r1 = new Rectangle(7, 9);
        Rectangle r2 = new Rectangle(6, 10);
        r1.print();
        r2.print();
        Circle c1 = new Circle(9);
        Circle c2 = new Circle(19);
        c1.print();
        c2.print();*/

        Shape[] a = {new Square(8), new Square(9), new Circle(19), new Circle(9), new Triangle(17, 32, 57, 71, 97, 11), new Triangle(24, 41, 63, 87, 109, 121), new Rectangle(7, 9), new Rectangle(6, 10)};
        Shape s = maxArea(a);

        System.out.printf("Фигура с максимальной площадью: %s.%nПлощадь фигуры: %.2f%n", s.toString(), s.getArea());

        System.out.println(a[0].equals(a[7]));

        System.out.println(a[0].hashCode());
        System.out.println(a[1].hashCode());

        Shape p = getSecondPerimeter(a);
        System.out.printf("Фигура с вторым по величине периметром: %s.%nПериметр фигуры: %.2f%n", p.toString(), p.getPerimeter());

    }


}
