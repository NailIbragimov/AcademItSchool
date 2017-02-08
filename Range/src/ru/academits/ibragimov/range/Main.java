package ru.academits.ibragimov.range;
import ru.academits.ibragimov.range.Range;

public class Main {
    public static void main(String[] args) {
        Range distance = new Range(10.9, 50.1);
        distance.print();
        System.out.println(distance.isInside(11));

    }
}
