package ru.courses.main;

import ru.courses.kitchen.Sauce;
import ru.courses.kitchen.Spicy;

public class Main {
    static void main() {
        Sauce sauce1 = new Sauce("Cesar", Spicy.NOT_SPICY);
        Sauce sauce2 = new Sauce("Tabasco", Spicy.VERY_SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
    }
}
