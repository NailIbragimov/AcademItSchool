package ru.academits.ibragimov.range;

public class Range {
    private double from;
    private double to;

    private Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    private double getFrom() {
        return from;
    }


    private double getTo() {
        return to;
    }


    private double getDistance() {

        return to - from;
    }

    public void print() {
        System.out.println(getDistance());
    }

    private boolean isInside(double i) {
        return i >= getFrom() && i <= getTo();
    }

    public static void main(String[] args) {
        Range distance = new Range(10.9, 50.1);
        distance.print();
        System.out.println(distance.isInside(11));

    }
}
