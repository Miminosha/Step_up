package ru.courses.math;

import java.util.Objects;

public class Fraction implements Cloneable {
    private final int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return num == fraction.num && denum == fraction.denum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denum);
    }

    @Override
    public Fraction clone() {
        return new Fraction(num, denum);
    }

    public String toString() {
        return num + "/" + denum;
    }
}
