package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] a : array) {
            for (int b : a) {
                rsl = rsl + b;
            }
        }
        return rsl;
    }
}
