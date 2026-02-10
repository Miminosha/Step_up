package ru.courses.math;

public enum Function {
    SUM {
        @Override
        public int func(int x, int y) {
            return x + y;
        }
    },
    SUB {
        @Override
        public int func(int x, int y) {
            return x - y;
        }
    },
    MULT {
        @Override
        public int func(int x, int y) {
            return x * y;
        }
    },
    DIV {
        @Override
        public int func(int x, int y) {
            return x / y;
        }
    };

    public abstract int func(int x, int y);
}
