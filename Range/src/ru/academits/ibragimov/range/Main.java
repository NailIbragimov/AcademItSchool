package ru.academits.ibragimov.range;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range distance = new Range(10.9, 50.1);
        Range range = new Range(1, 21);
        distance.print();
        System.out.println(distance.isInside(11));
        Range interval1 = range.getCrossing(distance);
        if (range.getCrossing(distance) == null) {
            System.out.println("Нет пересечений");
        } else {
            System.out.println("{" + interval1.from + "," + interval1.to + "}");
        }
        Range[] interval2 = range.getUnion(distance);
        System.out.println("Результат объединения интервалов: " + (Arrays.toString(interval2)));

        Range[] interval3 = range.getDifference(distance);
        System.out.println("Результат разности интервалов: " + (Arrays.toString(interval3)));

    }

}

