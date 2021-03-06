package com.github.simple_paint.swing.models;

import java.util.Objects;

public class Line {

    private int x1, y1, x2, y2;

    private int color;

    private int thickness;

    @Override
    public String toString() {
        return "Line{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", color=" + color +
                ", thickness=" + thickness +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return x1 == line.x1 &&
                y1 == line.y1 &&
                x2 == line.x2 &&
                y2 == line.y2 &&
                color == line.color &&
                thickness == line.thickness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2, color, thickness);
    }

    public Line() {
    }

    public Line(int x1, int y1, int x2, int y2, int color, int thickness) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.thickness = thickness;
    }

    public int getColor() {
        return color;
    }

    public int getThickness() {
        return thickness;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

}
