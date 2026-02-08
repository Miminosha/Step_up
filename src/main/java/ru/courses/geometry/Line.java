package ru.courses.geometry;

import java.util.Objects;

public class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return new Line(start.clone(),end.clone());
    }

    @Override
    public String toString() {
        return "Line {" + "start" + start + ", end" + end + '}';
    }
}
