package ru.courses.main;

import java.util.ArrayList;

public class Main {
    static void main() {
    }

    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[i] > intArray[j + 1]) {
                    int temp = intArray[i];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
}
