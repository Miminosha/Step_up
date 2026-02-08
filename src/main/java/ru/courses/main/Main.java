package ru.courses.main;

import ru.courses.geometry.Point;
import ru.courses.geometry.PolyLine;

public class Main {
    static void main() {

        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 5);
        Point p3 = new Point(4, 7);
        Point p4 = new Point(7, 11);

        PolyLine polyline1 = new PolyLine(new Point(1, 5),
                new Point(2, 5), new Point(4, 7), new Point(7, 11));

        PolyLine polyLine2 = new PolyLine(p1, p2, p3, p4);

        System.out.println(polyline1);
        System.out.println(polyLine2);
        System.out.println(polyline1 == polyLine2);
        System.out.println(polyline1.equals(polyLine2));
    }
}
