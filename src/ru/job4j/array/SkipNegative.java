package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] a : array) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    a[i] = 0;
                }
            }
        }
        return array;
    }
}
