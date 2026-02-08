package ru.courses.main;

import ru.courses.geometry.Point;

public class Main {
    static void main() throws Exception {

        Point p1 = new Point(1, 5);
        Point p2 = p1.clone();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}
