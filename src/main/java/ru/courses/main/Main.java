package ru.courses.main;

import java.lang.reflect.Field;

public class Main {

    public static void nullifyObject(Object obj) {
        if (obj == null) {
            return;
        }

        Class<?> objectClass = obj.getClass();

        Field[] fields = objectClass.getDeclaredFields();

        for (Field field : fields) {
            if (field.getType().isPrimitive()) {
                continue;
            }
            try {
                field.setAccessible(true);
                field.set(obj, null);
            } catch (IllegalAccessException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new java.util.ArrayList<>(java.util.Arrays.asList("Anton", "Oleg", "Igor"))
        );

        System.out.println("До: " + cat);
        nullifyObject(cat);
        System.out.println("После: " + cat);
    }
}