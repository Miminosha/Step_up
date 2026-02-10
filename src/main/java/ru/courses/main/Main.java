package ru.courses.main;

import ru.courses.math.Function;

public class Main {
    static void main() {
        System.out.println(Function.MULT.func(40, 5));
        System.out.println(Function.DIV.func(40, 5));
        System.out.println(Function.SUB.func(40, 5));
        System.out.println(Function.SUM.func(40, 5));
    }
}
