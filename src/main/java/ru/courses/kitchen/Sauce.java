package ru.courses.kitchen;

public class Sauce {
    private final String name;
    private final Spicy spicy;

    public Sauce(String name, Spicy spicy) {
        this.name = name;
        this.spicy = spicy;
    }

    @Override
    public String toString() {
        return "Sauce " + name + " is " + spicy;
    }
}
