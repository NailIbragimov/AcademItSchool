package ru.academits.ibragimov.range;

import java.util.Arrays;

public class Range {
    public double from;
    public double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    private double getLength() {
        return to - from;
    }

    public void print() {
        System.out.println(getLength());
    }

    public boolean isInside(double number) {

        return number >= from && number <= to;

    }

    public Range getCrossing(Range range) {
        if (Math.min(to, range.to) < Math.max(from, range.from)) {
            return null;
        } else {
            return new Range(Math.min(from, range.from), Math.max(to, range.to));
        }
    }

    public Range[] getUnion(Range range) {
        if (Math.min(to, range.to) >= Math.max(from, range.from)) {
            return new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
        } else {
            return new Range[]{new Range(Math.min(from, range.from), Math.min(to, range.to)), (new Range(Math.max(from, range.from), Math.max(to, range.to)))};
        }

    }

    public Range[] getDifference(Range range) {
        if (range.from <= from && to <= range.to) {
            return new Range[]{};
        } else if (to <= range.from || from >= range.to) {
            return new Range[]{new Range(from, to)};
        } else if (range.from <= to && range.to >= to) {
            return new Range[]{new Range(from, range.from)};
        } else if (from >= range.from && range.to <= to) {
            return new Range[]{new Range(range.to, to)};
        } else {
            return new Range[]{(new Range(from, range.from)), new Range(range.to, to)};
        }
    }
}


