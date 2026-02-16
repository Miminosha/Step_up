package ru.courses.main;

import java.util.ArrayList;

public class Main {
    static void main() {
        int N = 10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for (int i = 0; i < N; i += 2) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(i + 1));
            arrayList.set(i + 1, temp);
        }
        System.out.println(arrayList);
    }
}