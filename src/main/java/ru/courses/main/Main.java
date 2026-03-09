package ru.courses.main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main() {
        Stream<String> stream = Stream.of("I", "like", "java");
        String result = getStringFromStream(stream);
        System.out.println(result);
    }

    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
}