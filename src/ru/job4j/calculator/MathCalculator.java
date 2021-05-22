package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multi(first, second);
    }

    public static double sumBySubAndDiv(double first, double second) {
        return sub(first, second) + div(first, second);
    }

    public static double sumAllFuncs(double first, double second) {
        return sum(first, second) + sub(first, second)
                + multi(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumBySubAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAllFuncs(10, 20));
    }
}
