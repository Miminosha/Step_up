package ru.courses.main;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(3);
        list.add(97);

        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(item -> System.out.println(item));
    }
}