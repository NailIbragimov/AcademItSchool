package ru.academits.ibragimov.shapes;

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(8);
        Square s2 = new Square(9);
        s1.print();
        s2.print();
        Triangle t1 = new Triangle(1, 3, 5, 7, 9, 11);
        Triangle t2 = new Triangle(2, 4, 6, 8, 10, 12);
        t1.print();
        t2.print();
        Rectangle r1 = new Rectangle(7, 9);
        Rectangle r2 = new Rectangle(6, 10);
        r1.print();
        r2.print();
        Circle c1 = new Circle(9);
        Circle c2 = new Circle(19);
        c1.print();
        c2.print();

        double[] a = {s1.getArea(), s2.getArea(), t1.getArea(), t2.getArea(), r1.getArea(), r2.getArea(), c1.getArea(), c2.getArea()};
        for (int i = 1; i < a.length; i++) {
            double temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
        System.out.println("Наибольшая площадь = " + a[7]);
        double[] f = {s1.getPerimeter(), s2.getPerimeter(), t1.getPerimeter(), t2.getPerimeter(), r1.getPerimeter(), r2.getPerimeter(), c1.getPerimeter(), c2.getPerimeter()};
        for (int i = 1; i < f.length; i++) {
            double temp = f[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                f[j + 1] = f[j];
            }
            f[j + 1] = temp;
        }
        System.out.println("Второй по величине периметр = " + f[6]);
    }


}
