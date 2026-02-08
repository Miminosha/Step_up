package ru.courses.main;

import ru.courses.geometry.Line;
import ru.courses.geometry.Point;

public class Main {
    static void main() throws Exception {

        Point p1 = new Point(1, 5);
        Point p2 = p1.clone();

        Line l1 = new Line(p1, p2);
        Line l2 = l1.clone();

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));
        System.out.println(l1);
        System.out.println(l2);
    }
}
