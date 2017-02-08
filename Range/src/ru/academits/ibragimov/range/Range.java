package ru.academits.ibragimov.range;

class Range {
    private double from;
    private double to;

    Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    private double getLength() {
        return to - from;
    }

    void print() {
        System.out.println(getLength());
    }

    boolean isInside(double number) {
        return number >= from && number <= to;
    }
}
