package ru.courses.main;

import ru.courses.math.Fraction;

public class Main {
    static void main() {
        Fraction f1 = new Fraction(3, 7);
        Fraction f2 = f1.clone();

        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
        System.out.println(f1);
        System.out.println(f2);
    }
}
